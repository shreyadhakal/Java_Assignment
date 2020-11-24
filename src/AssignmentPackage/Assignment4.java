package AssignmentPackage;

import java.util.Scanner;

//Write a program to calculate Simple Interest input by the user. Simple Interest = P*T*R/100
public class Assignment4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number P: ");
		double P = input.nextDouble();
		System.out.println("Enter number T: ");
		double T = input.nextDouble();
		System.out.println("Enter number R: ");
		double R = input.nextDouble();
		double simple_interest = (P * T * R)/ 100;
		System.out.println("The value of simple interest is" + " " +  simple_interest);
		
	}

}
