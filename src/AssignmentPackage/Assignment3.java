package AssignmentPackage;

import java.util.Scanner;

//3.	Write a program to find sum and average of two numbers input by User (using Scanner class).
public class Assignment3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number ");
		int a = input.nextInt();
		System.out.println("Enter another number ");
		int b = input.nextInt();
		int sum = a + b;
		double average =  (double) sum / 2;
		System.out.println("The sum is " + sum);
		System.out.println("The avarage is" + average);
		
	}

}
