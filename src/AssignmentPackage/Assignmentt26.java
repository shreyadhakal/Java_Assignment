package AssignmentPackage;

import java.util.Scanner;
//26.	Write a Program to reverse the given number. //123 => 321
public class Assignmentt26 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int originalNumber = input.nextInt();

		int reverseNumber = 0;
		System.out.println("Original number is: " + originalNumber);
		while (originalNumber != 0) {
			int temp = originalNumber % 10; // gives remainder
			reverseNumber = reverseNumber * 10 + temp;
			originalNumber = originalNumber / 10; // gives quotient

		}
		System.out.println("Reversed number is:" + reverseNumber);
	}

}
