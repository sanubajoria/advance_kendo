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

import java.util.ArrayList;
import java.util.Map;

public class FormMap extends BaseMap
{
   
  
   ArrayList<Object> listOfFields = new ArrayList<Object>();
   public FormMap(){
      setProperty("fields", listOfFields);
      
   }

   public FormMap setName(String value)
   {
     setProperty("name", value);
     return this;
   }
   
   public FormMap setAction(String value)
   {
     setProperty("action", value);
     return this;
   }
   
   public FormMap setTarget(String value)
   {
     setProperty("target", value);
     return this;
   }
   
   public FormMap setClass(String value)
   {
     setProperty("class", value);
     return this;
   }
   
   public void addField(Object value)
   {
      listOfFields.add(value);
   }
 
   public void setColumnWidth(float value)
   {
     setProperty("columnWidth", value);
   }
   
   public void setFocusId(String value)
   {
     setProperty("focusFieldID", value);
   }
 
}
