package AssignmentPackage;

import java.util.Scanner;

//14.	Write a program to relate two integers entered by the user using = =or > or < sign.
public class Assignmentt14 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a: ");
		int a = input.nextInt();
		System.out.println("Enter b: ");
		int b = input.nextInt();
		
		if (a==b) 
		{System.out.println("a and b are equal");}
		if (a>b)
			{System.out.println("a is greater than b");}
		if (a< b)
			{System.out.println("a is smaller than b");	}
		
		}
	}


