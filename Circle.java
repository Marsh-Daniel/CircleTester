package com.gc.circles;

import java.text.DecimalFormat;

public class Circle {
	private static int i=-1;
	DecimalFormat df = new DecimalFormat("#,###,##0.00");
	public String getFormattedCircumference(double circumference) {
		
		String formattedCircumference = df.format(circumference);		
		return formattedCircumference;
	}

	public String getCircumference(double radius) {
		double circumference = Math.PI*(radius*radius);
		return getFormattedCircumference(circumference);
		
		
	}

	public String getFormattedArea(double area) {
		DecimalFormat df = new DecimalFormat("#,###,##0.00");
		String formattedArea = df.format(area);
		getObjectCount();
		return formattedArea;
		
		
	}

	public String getArea(double radius){
		double area = Math.PI*(radius + radius);
		return getFormattedArea(area);
		
		
	}
	public static int getObjectCount() {
		i++;
		return i;
	}

}
