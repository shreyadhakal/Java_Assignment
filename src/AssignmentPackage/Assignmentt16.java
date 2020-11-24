package AssignmentPackage;

import java.util.Scanner;

//16.	Write a program to find the given number is even or odd.
public class Assignmentt16 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number");
		int N = input.nextInt();
		if(N% 2 == 0) {
			System.out.println("It is even number");}
			else {System.out.println("It is odd number");}
		}
	}


