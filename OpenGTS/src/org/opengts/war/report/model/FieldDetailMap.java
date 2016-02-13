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

 
   
   
   
   public void setId(String value)
   {
     setProperty("id", value);
   }
 
   public void setClass(String value)
   {
     setProperty("class", value);
   }
 
   public void setName(String value)
   {
     setProperty("name", value);
   }
 
   public void setValue(String value)
   {
     setProperty("value", value);
   }
 
   public void setDefaultValue(String value)
   {
     setProperty("defaultvalue", value);
   }
 
   public void setSize(int value)
   {
     setProperty("size", value);
   }
 
   public void setMaxSize(int value)
   {
     setProperty("maxsize", value);
   }
   
   public void setRo(String value){
      setProperty("ro", value);

   }
   
   public void setCustomCssProperty(String value){
      setProperty("customcssproperty", value);

   }
}
