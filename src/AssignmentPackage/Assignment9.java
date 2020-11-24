package AssignmentPackage;

import java.util.Scanner;

/*9.Write a program that converts pounds into kg. 
	The program prompts the user to enter a number of pounds, converts it to kg and displays the result [1 pound is 0.454 kg]. */
public class Assignment9 {

	public static void main(String[] args) {
	
		Scanner pounds = new Scanner(System.in);
		System.out.println("Enter the number of pounds: ");
		double P = pounds.nextDouble();
		 double KG = P * 0.454;
		 System.out.println("The kgs is" + KG);
		 
	}

}
