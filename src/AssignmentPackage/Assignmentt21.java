package AssignmentPackage;

import java.util.Scanner;

//21.	Program to input the number of (1...7) and translate to its equivalent name of the day of the week.
public class Assignmentt21 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: 1, 2, 3, 4, 5, 6, 7");
		int n = input.nextInt();

		// if you don not give break statement to right answer then every line after
		// right ans will get printed. So we should always write break after every print
		// statement
		switch (n) {
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wednesday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
			break;

		default:
			System.out.println("wrong choice");

		}
	}
}
