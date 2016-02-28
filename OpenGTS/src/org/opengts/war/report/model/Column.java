package org.opengts.war.report.model;

public class Column extends BaseMap {


   public Column(String name){
      setProperty("name", name);
      setProperty("displayName", name);

      

   }
	  
	  public void setColumnHeaderTemplate(Object value)
	  {
		  setProperty("columnHeaderTemplate", value);
	  }
	  
	 
	  public void setColumnWidth(float value)
	  {
	    setProperty("columnWidth", value);
	  }
	
	  
	  public void setField(Object value)
	  {
		  setProperty("field", value);
	  } 
	  
	
	  
	  
	  public Column setName(String value)
	  {
		  setProperty("name", value);
		  return this;
	  }
	  
	  
	  public void setFormat(Object value)
	  {
		  setProperty("format", value);
	  }
      
	  
}
