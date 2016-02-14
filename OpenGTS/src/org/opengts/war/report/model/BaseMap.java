package org.opengts.war.report.model;

import java.util.HashMap;
import java.util.Map;

public class BaseMap {
	Map<String,Object> propertyMap= new HashMap<String,Object>();
	
	public void setProperty(String key ,Object value){
		propertyMap.put(key, value);
	}
public Object getBasemap(){
	return propertyMap;
}

}
