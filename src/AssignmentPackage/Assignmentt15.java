package AssignmentPackage;

import java.util.Scanner;

//15.	Write a program that receives an ASCII code (between 0 – 128) and display its character [example: 97 (input) ->a(output)].
public class Assignmentt15 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = input.nextInt();
		
		if (n>=0 && n<=128) {
		char c = (char)n;
		System.out.println("The ASCII code for the number is" + c);}
		
	}

}
