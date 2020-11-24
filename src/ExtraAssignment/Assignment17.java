package ExtraAssignment;

import java.util.Scanner;

public class Assignment17 {

	public static void main(String[] args) {
		leapYear();

	}


	public static void leapYear(){
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a year:");
	int  year = input.nextInt();
	
	if (year % 4 ==0) {
		if (year % 100 == 0) {
			if (year % 400 == 0) {
				System.out.println("It is a leap year");}
			else{
				System.out.println("It is not a leap year");}
		}
		else { 
			System.out.println("It is not divisble by 100 and is not a leap year");}
	}
	else
	{System.out.println("It is not a leap year");}
	
	System.out.println("end of program"); }
}
