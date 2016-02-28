package org.opengts.war.report.model;

import java.util.ArrayList;
import java.util.Map;

public class GridMap extends BaseMap {
	
   ArrayList<Object> columns = new ArrayList<Object>();
   public GridMap()
   {
      // TODO Auto-generated constructor stub
      setProperty("columnDefs", columns);

   }
	
	 public void addColumns(Column value)
	  {
	    columns.add(value.getBasemap());
		 // setProperty("columns", value);
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
	 
	 public void setTitle(Object value)
    {
       setProperty("title", value);
    }
}
