package com.gc.circles;

import java.util.Scanner;

public class CircleTester {

	public static void main(String[] args) {
		System.out.println("Welcome to the Circle Tester");
		Scanner input = new Scanner(System.in);
		double radius;
		String reiterate;
		do {
			System.out.println("Please enter the radius of your circle in inches: ");
			radius = input.nextDouble();
			Circle circle = new Circle();
			System.out.println(circle.getCircumference(radius)+ "in --circumference");
			System.out.println(circle.getArea(radius)+ "in --area");
			input.nextLine();
			System.out.println("Do you have another circle y/n: ");
			reiterate = input.next();
		} while (reiterate.equalsIgnoreCase("y"));
		System.out.println("goodbye. you created "+ Circle.getObjectCount()+ " Circle(s)");
		input.close();
	}

	
	}


