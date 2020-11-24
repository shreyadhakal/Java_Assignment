package AssignmentPackage;

import java.util.Scanner;

public class Assignmentt24 {
//24.	Write a program to print the factorial number of given numbers.
	public static void main(String[] args) {
	Assignmentt24 obj = new Assignmentt24();
	
	Scanner input = new Scanner(System.in);
	System.out.println("Enter number to find factorial");
	int n = input.nextInt();
	int fact = obj.findFactorial(n);
	System.out.println("The factorial of number is" + fact);
	}
	
     public int findFactorial(int n) {
    	 int fact = 1;
    	 for ( int i = 1; i<= n; i++) {
    		 fact = fact * i;
    	 }
    	 return fact;
    	 }
     }
     

     

