package org.opengts.war.report.model;

import java.util.HashMap;

public class FieldMap extends BaseMap {
	
	public void setProperty(String key ,Object value){
		HashMap<String ,Object> typeMap= new HashMap<String ,Object>();
		typeMap.put("type", value);
		propertyMap.put(key, typeMap);
	}

}
