package AssignmentPackage;

import java.util.Scanner;

//13.	Write a program to print the number entered by the user only if the number entered is negative.
public class Assignmentt13 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a number");
	int N = input.nextInt();
	if (N < 0) { System.out.println(N + " is a negative number");}
	else {System.out.println("Not negative");}
	}
}