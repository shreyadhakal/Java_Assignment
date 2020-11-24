package AssignmentPackage;

import java.util.Scanner;
//27.	Write a Program to sum each digit of given number as well as product. //456 =>4*5*6 and 4+5+6
public class Assignmentt27 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = input.nextInt();

		int sum = 0;
		int multiply = 1;
		while (number != 0) {
			int temp = number % 10;
			sum = sum + temp;
			multiply = multiply * temp;
			number = number / 10;
		}
		System.out.println("The sum of given number is:" + sum);
		System.out.println("The multiply of given number is:" + multiply);
	}

}
