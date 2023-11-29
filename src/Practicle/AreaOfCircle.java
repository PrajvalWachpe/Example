package Practicle;

import java.util.Scanner;

public class AreaOfCircle {

	public double area() {
		
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
		double radius=sc.nextDouble();
		
		double ar= Math.PI*radius*radius;
		
		
		return ar;
	}
	public static void main(String[] args) {
		
		AreaOfCircle ac=new AreaOfCircle();
		double answer = ac.area();
		System.out.println("The answer is:-"+answer);
		
	}

}
