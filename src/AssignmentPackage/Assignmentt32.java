package AssignmentPackage;

import java.util.Scanner;

public class Assignmentt32 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] array = new int[5];
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter the element");
			array[i] = input.nextInt();
			sum = sum + array[i];
		}
		System.out.println("The sum is " + sum);
	}

}
