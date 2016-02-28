//$Header: /development/AEDevelopment/env/eclipse/preferences/new_javafile_templates.xml,v 1.2 2009/01/04 16:14:23 lclement Exp $
/////////////////////////////////////////////////////////////////////////////
// PROPRIETARY RIGHTS STATEMENT
// The contents of this file represent confidential information that is the
// proprietary property of Active Endpoints, Inc.  Viewing or use of
// this information is prohibited without the express written consent of
// Active Endpoints, Inc. Removal of this PROPRIETARY RIGHTS STATEMENT
// is strictly forbidden. Copyright (c) 2002-2011 All rights reserved.
/////////////////////////////////////////////////////////////////////////////
package org.opengts.war.report.model;

import org.opengts.war.tools.CommonServlet;
import org.opengts.war.track.Constants;

public class FieldDetailMap extends BaseMap
{

 
   
   
   
   public FieldDetailMap setId(String value)
   {
     setProperty("id", value);
     return this;

   }
 
   public FieldDetailMap setClass(String value)
   {
     setProperty("class", value);
     return this;

   }
 
   public FieldDetailMap setName(String value)
   {
     setProperty("name", value);
     return this;

   }
 
   public FieldDetailMap setValue(String value)
   {
     setProperty("value", value);
     return this;

   }
 
   public FieldDetailMap setDefaultValue(String value)
   {
     setProperty("defaultvalue", value);
     return this;

   }
 
   public FieldDetailMap setSize(Integer value)
   {
     setProperty("size", value);
     return this;

   }
 
   public void setMaxSize(Integer value)
   {
     setProperty("maxsize", value);
   }
   
   public void setRo(String value){
      setProperty("ro", value);

   }
   
   public FieldDetailMap setLabel(String value)
   {
     setProperty("label", value);
     return this;
   }
   
   public void setCustomCssProperty(String value){
      setProperty("customcssproperty", value);

   }
   
   public FieldDetailMap setType(String value)
   {
     setProperty("type", value);
     return this;

   }
   
   public FieldDetailMap setEditable(boolean value)
   {
     setProperty("editable", value);
     return this;
   }
   
   public FieldDetailMap setTooltips(String value)
   {
     setProperty("tooltips", value);
     return this;
   }
   
   public FieldDetailMap setOnClick(String value)
   {
     setProperty("OnClick", value);
     return this;

   }
}
