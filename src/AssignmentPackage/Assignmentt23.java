package AssignmentPackage;

import java.util.Scanner;

public class Assignmentt23 {
//Write a Program to sum 1 to nth natural numbers.
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = input.nextInt();
		int sum = 0;

		for (int i = 1; i <= n; i++) {
			sum = sum + i;
		}

		System.out.println("The sum is :" + sum);

		/*
		 * If you want to print the total value then write the print statement outside
		 * the for-loop bracket. If you want to print every outcome after the iteration,
		 * then write print statement inside the for-loop brackets.
		 */

	}

}
