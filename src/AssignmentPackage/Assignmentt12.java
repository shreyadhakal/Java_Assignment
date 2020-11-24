package AssignmentPackage;

import java.util.Scanner;

//12.	Write a program to accept the age, name, and nationality of the person and display those values in good format.
public class Assignmentt12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter name ");
		String  name = input.nextLine();	
		System.out.println("Enter nationality ");
		String  nationality = input.nextLine();
		System.out.println("Enter age ");
		int  age = input.nextInt();
		
		System.out.println("The name is" + " " +name);
		System.out.println("The nationality is" +  " " + nationality);
		System.out.println("The age is" +  " " + age);
	}

}
