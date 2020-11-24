package AssignmentPackage;

import java.util.Scanner;

//19.	Write a Program to accept three sides of a triangle and display which kind of triangle is formed.
public class Assignmentt19 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter length of  first side");
		int A = input.nextInt();
		System.out.println("Enter length of  second side");
		int B = input.nextInt();
		System.out.println("Enter length of  third side");
		int C = input.nextInt();
		
		if ( A == B && A == C) {  //if a is equal to b and c then b and c will be automatically equal
			System.out.println("It is an equilateral triangle");}
		else if (A==B || A==C || B==C){
			System.out.println("It is an isosceles triangle");}
		else 
			System.out.println("It is scalene triangle");
	}
}
