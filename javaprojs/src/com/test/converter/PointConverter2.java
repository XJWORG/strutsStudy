package com.test.converter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.util.StrutsTypeConverter;

import com.test.action.Point;

public class PointConverter2 extends StrutsTypeConverter {

	@Override
	public Object convertFromString(Map arg0, String[] arg1, Class arg2) {
		List<Point> points = new ArrayList<Point>();
		for(String point : arg1){
			int x = Integer.parseInt(point.split(",")[0]);
			int y = Integer.parseInt(point.split(",")[1]);
			
			Point p = new Point();
			p.setX(x);
			p.setY(y);
			
			points.add(p);
			
		}
		return points;
	}

	@Override
	public String convertToString(Map arg0, Object arg1) {
		
		StringBuffer ps = new StringBuffer();
		ps.append("[");
		
		List<Point> points = (List<Point>)arg1;
		
		for(Point p : points){
			
			ps.append("x=").append(p.getX()).append(",y=").append(p.getY());
			
		}
		
		ps.append("]");
		
		return ps.toString();
		
	}

}
