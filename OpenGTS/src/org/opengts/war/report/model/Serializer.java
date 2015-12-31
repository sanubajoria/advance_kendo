package org.opengts.war.report.model;


import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.io.IOException;
import java.io.Serializable;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Serializer
{
  private Map<String, Object> properties(Object object)
  {
    Map<String, Object> options = new HashMap();
    try
    {
      for (PropertyDescriptor property : Introspector.getBeanInfo(object.getClass(), Object.class).getPropertyDescriptors())
      {
        Method getter = property.getReadMethod();
        if (getter != null) {
          options.put(property.getName(), getter.invoke(object, new Object[0]));
        }
      }
    }
    catch (IntrospectionException e) {}catch (IllegalAccessException e) {}catch (IllegalArgumentException e) {}catch (InvocationTargetException e) {}
    return options;
  }
  
  private void quote(Writer out, String string)
    throws IOException
  {
    char ch = '\000';
    
    out.append("\"");
    
    int index = 0;
    for (int length = string.length(); index < length; index++)
    {
      char previous = ch;
      ch = string.charAt(index);
      switch (ch)
      {
      case '"': 
      case '\\': 
        out.append("\\").append(ch);
        
        break;
      case '/': 
        if (previous == '<') {
          out.append("\\");
        }
        out.append(ch);
        break;
      case '\b': 
        out.append("\\b");
        break;
      case '\n': 
        out.append("\\n");
        break;
      case '\r': 
        out.append("\\r");
        break;
      case '\f': 
        out.append("\\f");
        break;
      case '\t': 
        out.append("\\t");
        break;
      default: 
        if ((ch < ' ') || ((ch >= '?') && (ch < '?')) || ((ch >= '?') && (ch < '?')))
        {
          String hex = "000" + Integer.toHexString(ch);
          
          out.append("\\u").append(hex.substring(hex.length() - 4));
        }
        else
        {
          out.append(ch);
        }
        break;
      }
    }
    out.append("\"");
  }
  
  public void serialize(Writer out, Object value)
    throws IOException
  {
    if (value == null) {
      out.append("null");
    } else if ((value instanceof String)) {
      quote(out, (String)value);
    } else if ((value instanceof Number)) {
      out.append(value.toString());
    } else if ((value instanceof Boolean)) {
      out.append(value.toString());
    } else if ((value instanceof Date)) {
      serializeDate(out, (Date)value);
    } else if ((value instanceof Iterable)) {
      serializeIterable(out, (Iterable)value);
    }  else if ((value instanceof Map)) {
      serializeMap(out, (Map)value);
    }  else if (value.getClass().isArray()) {
      serializeArray(out, value);
    } else if (value.getClass().isEnum()) {
      quote(out, value.toString());
    } else {
      serializeMap(out, properties(value));
    }
  }
  
  private void serializeDate(Writer out, Date value)
    throws IOException
  {
    Calendar cal = Calendar.getInstance();
    cal.setTime(value);
    
    out.append("new Date(").append(Integer.toString(cal.get(1))).append(",").append(Integer.toString(cal.get(2))).append(",").append(Integer.toString(cal.get(5))).append(",").append(Integer.toString(cal.get(11))).append(",").append(Integer.toString(cal.get(12))).append(",").append(Integer.toString(cal.get(13))).append(",").append(Integer.toString(cal.get(14))).append(")");
  }
  
  private void serializeMap(Writer out, Map<?, ?> map)
    throws IOException
  {
    out.append("{");
    
    Iterator<?> iterator = map.entrySet().iterator();
    while (iterator.hasNext())
    {
      Map.Entry<?, ?> entry = (Map.Entry)iterator.next();
      
      out.append("\"").append(entry.getKey().toString()).append("\":");
      
      serialize(out, entry.getValue());
      if (iterator.hasNext()) {
        out.append(",");
      }
    }
    out.append("}");
  }
  
  private void serializeIterable(Writer out, Iterable<?> iteratable)
    throws IOException
  {
    out.append("[");
    
    Iterator<?> iterator = iteratable.iterator();
    while (iterator.hasNext())
    {
      serialize(out, iterator.next());
      if (iterator.hasNext()) {
        out.append(",");
      }
    }
    out.append("]");
  }
  
  private void serializeArray(Writer out, Object array)
    throws IOException
  {
    out.append("[");
    
    int index = 0;
    for (int length = Array.getLength(array); index < length; index++)
    {
      serialize(out, Array.get(array, index));
      if (index < length - 1) {
        out.append(",");
      }
    }
    out.append("]");
  }
  
  public String json(Object object)
    throws IOException
  {
    StringWriter out = new StringWriter();
    
    serialize(out, object);
    
    return out.toString();
  }
}
