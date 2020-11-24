package AssignmentPackage;

import java.util.Scanner;

/*20.	Write a program to create the equivalent of a four-function calculator. The program to enter two integer’s numbers and an operator.
It then carries out the specified arithmetic
operator operation: addition, subtraction, multiplication or division of the two numbers. Finally, it displays the result.*/

public class Assignmentt20 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a character among:  + - * /");
		char c = input.next().charAt(0);

		int result = 0;
		int a = 0;
		int b = 0;

		if (c == '+' || c == '-' || c == '*' || c == '/') {
			System.out.println("Enter a number:");
			a = input.nextInt();
			System.out.println("Enter second number:");
			b = input.nextInt();
		}

		switch (c) {
		case '+':
			result = a + b;
			System.out.println("Sum of a+b is" + result);
			break;
		case '-':
			result = a - b;
			System.out.println("Substracion of a-b is" + result);
			break;
		case '*':
			result = a * b;
			System.out.println("Multiplication of a*b is" + result);
			break;
		case '/':
			result = a / b;
			System.out.println("Division of a/b is" + result);
			break;
		default:
			System.out.println("wrong choice");

		}

	}

}
