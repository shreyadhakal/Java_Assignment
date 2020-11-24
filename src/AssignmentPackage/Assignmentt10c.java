package AssignmentPackage;

import java.util.Scanner;

public class Assignmentt10c {
	//10.	Write a Program for the following Mathematical Function.
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
        double x = (-b + (Math.sqrt(b* b - 4*a*c)))/2*a ;
        System.out.println("The value of x is" + x);
	}

}

