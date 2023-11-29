package Practicle;

import java.util.Scanner;

//A = 1/2 × b × h.
public class AreaOfTriangle {

	public double triangle() {
		
		double x=0.5;
		double b;
		double h;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Base of Triangle: ");
        b = sc.nextDouble();
        
        System.out.print("Enter Height of Triangle: ");
        h = sc.nextDouble();
        
        double area=x*b*h;
         return area;
         
        
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 AreaOfTriangle at=new  AreaOfTriangle();
		 double area=at.triangle();
		 System.out.println("Area Of Triangle Is:-"+area);
	}

}
