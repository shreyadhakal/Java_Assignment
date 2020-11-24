package AssignmentPackage;

import java.util.Scanner;

public class Assignmentt33 {

	public static void main(String[] args) {
		int i, temp;

		// User inputs the array size
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of elements you want in the array: ");
		int size = input.nextInt();

		// to take input element of array
		int[] array = new int[size];
		for (i = 0; i < array.length; i++) {
			System.out.println("Enter the element");
			array[i] = input.nextInt();
		}

		for (i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (array[i] > array[j]) // array[j] kata bata aayo?
				{
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		System.out.print("Array Elements in Ascending Order: ");
		for (i = 0; i < size - 1; i++) {
			System.out.print(array[i] + ", ");
		}
		System.out.print(array[size - 1]);
	}

}
