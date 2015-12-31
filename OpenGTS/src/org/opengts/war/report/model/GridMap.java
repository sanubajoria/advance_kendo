package org.opengts.war.report.model;

public class GridMap extends BaseMap {
	
	
	 public void setColumns(Object value)
	  {
		  setProperty("columns", value);
	  }
	 
	 public void setPageable(Object value)
	  {
		  setProperty("pageable", value);
	  }
	 
	 public void setHeight(Object value)
	  {
		  setProperty("height", value);
	  }
	 
	 public void setDataSource(Object value)
	  {
		  setProperty("dataSource", value);
	  }
	 
	 public void setFilterable(Boolean value)
	  {
		  setProperty("filterable", value);
	  }

	 public void setSortable(Boolean value)
	  {
		  setProperty("sortable", value);
	  }
	 
	 public void setColumnResizeHandleWidth(Integer value)
	  {
		  setProperty("columnResizeHandleWidth", value);
	  }
}
