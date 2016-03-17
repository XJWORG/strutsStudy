package com.test.converter;

import java.util.Map;

import com.opensymphony.xwork2.conversion.impl.DefaultTypeConverter;
import com.test.action.Point;

public class PointConverter extends DefaultTypeConverter {

	@Override
	public Object convertValue(Map<String, Object> context, Object value,
			Class toType) {

		if(Point.class.equals(toType)){
			Point point = new Point();
			String[] strs = (String[])value ; 
			String[] xy = strs[0].split(",") ;
			
			int x = Integer.parseInt(xy[0]);
			int y = Integer.parseInt(xy[1]);
			point.setX(x);
			point.setY(y);
			
			return point;
			
		}else if(String.class.equals(toType)){
			Point point = (Point)value;
			String addr = "x=" + point.getX() + " , y=" + point.getY();
			return addr;
		}
		
		return null ;
	}

}
