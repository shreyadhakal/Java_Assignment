package AssignmentPackage;

import java.util.Scanner;
//22.	Write a program to print the table of given number.
public class Assignmentt22 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number to print the table: ");
		int n = input.nextInt();

		for (int i = 1; i <= 10; i++) {
			int t = n * i;
			System.out.println(n + "*" + i + "=" + t);
		}

	}

}
/*
 * If you want to print the total value then write the print statement outside
 * the for-loop bracket. If you want to print every outcome after the iteration,
 * then write print statement inside the for-loop brackets.
 */