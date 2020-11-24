package ExtraAssignment;

import java.util.Scanner;

public class Assignment19 {

	public static void main(String[] args) {
		triangleType();

	}
	public static void triangleType() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter length of  first side");
		int a = input.nextInt();
		System.out.println("Enter length of  second side");
		int b = input.nextInt();
		System.out.println("Enter length of  third side");
		int c = input.nextInt();
		
		if ( a == b && a==c && b==c) {
			System.out.println("It is an equilateral triangle");}
		else if (a==b || a==c || b==c){
			System.out.println("It is an isosceles triangle");}
		else 
			System.out.println("It is scalene triangle");
		
	}
}
