package AssignmentPackage;

import java.util.Scanner;

//10.	Write a Program for the following Mathematical Function.
public class Assignmentt10b {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a: ");
		double a = input.nextDouble();	
		Scanner input2 = new Scanner(System.in);
		System.out.println("Enter b: ");
		double b = input2.nextDouble();	
		Scanner input3 = new Scanner(System.in);
		System.out.println("Enter c: ");
		double c = input3.nextDouble();	
		
		double s = (a+ b+ c )/2; // we already have this formula so we don't need to ask the value of s from user
		double area = Math.sqrt(s * (s-a) * (s-b) * (s-c));
		System.out.println("The area is" + area);
		
		

	}

}
