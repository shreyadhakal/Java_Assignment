package AssignmentPackage;
//11.	Write a program to swap two numbers a) using temp variable

import java.util.Scanner;

public class Assignmentt11a {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a: ");
		int a = input.nextInt();
		System.out.println("Enter b: ");
		int b = input.nextInt();
		System.out.println("before swapping is: " +  a);
		System.out.println("before swapping is: " +  b);
		
		
		int temp = a;
		a = b;
		b = temp;
		 System.out.println();
		 System.out.println("After swapping is:" + a);
		 System.out.println("After swapping is:" + b); 
		
		
	}

}
