package AssignmentPackage;

import java.util.Scanner;

public class Assignmentt11b {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a: ");
		int a = input.nextInt();
		System.out.println("Enter b: ");
		int b = input.nextInt();
		System.out.println("before swapping is: " +  a);
		System.out.println("before swapping is: " +  b);
		
		
		a = a+ b;
		a = a-b;
		b= a-b;
		
		 System.out.println();
		 System.out.println("After swapping is:" + a);
		 System.out.println("After swapping is:" + b); 
		
		

	}

}
