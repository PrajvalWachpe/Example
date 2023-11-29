package Practicle;

import java.util.Scanner;

public class Circle {

	public double areaOfCircle() {
			double r;
	        double pi = 3.14;
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter radius of circle: ");
	        r = sc.nextDouble();
	        double area = pi * r * r;
	        
	        return area;
	        
	}
	public static void main(String[] args) {
	
		Circle a=new Circle();
		double area=a.areaOfCircle();
		System.out.print("Area of circle:= "+area);
		
	}

}
