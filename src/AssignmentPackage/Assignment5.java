package AssignmentPackage;

import java.util.Scanner;
//5.	Write a program to find the area of a circle, rectangle, and triangle.
public class Assignment5 {

	public static void main(String[] args) {
		final double PI = Math.PI;
		Scanner radius = new Scanner(System.in);
		System.out.println("Enter the radius: ");
		double R = radius.nextDouble();
		double AreaofCircle = PI * R * R;
		System.out.println("The are of circle is " + AreaofCircle);
		
		System.out.println("-----------------");
		
		Scanner length = new Scanner(System.in);
		System.out.println("Enter the length : ");
		int l = length.nextInt();
		Scanner breadth = new Scanner(System.in);
		System.out.println("Enter the breath: ");
		int b = breadth.nextInt();
		int AreaofRectangle = l * b;
		System.out.println("The are of reactangle is " + AreaofRectangle);
		
		
		System.out.println("-----------------");
		
		double AreaofTriangle = 0.5 * l * b;
		System.out.println("The are of triangle is " + AreaofTriangle);
		
		
		
		

	}

}
