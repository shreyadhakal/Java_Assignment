package AssignmentPackage;

import java.util.Scanner;

//17.	Write a program to calculate leap year.
public class Assignmentt17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a year:");
		int  Year = input.nextInt();
		
		if (Year % 4 ==0) {
			if (Year % 100 == 0) {
				if (Year % 400 == 0) {
					System.out.println("It is a leap year");
					}
				else{
					System.out.println("It is not a leap year");
					}
			}	else { 
				System.out.println("It is not divisble by 100 and is not a leap year");}
		}
		else
		{System.out.println("It is not a leap year");}
		
		System.out.println("end of program");
				

	}

}
