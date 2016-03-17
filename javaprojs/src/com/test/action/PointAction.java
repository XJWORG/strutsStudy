package com.test.action;
import java.util.Date;

import com.opensymphony.xwork2.ActionSupport;
import com.test.action.Point;
public class PointAction extends ActionSupport{
	
	private Point point;
	private String name;
	private int age;
	private Date date;

	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Point getPoint() {
		return point;
	}

	public void setPoint(Point point) {
		this.point = point;
	}

	@Override
	public String execute() throws Exception {
		return SUCCESS;
		
	}
	
	
	
}
