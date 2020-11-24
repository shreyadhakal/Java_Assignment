package AssignmentPackage;

import java.util.Scanner;

public class Assignmentt34 {

	public static void main(String[] args) {
		int size, i = 0, j = 0, temp;
		int[] array = new int[100];
		Scanner input = new Scanner(System.in);
		System.out.print("How many elements you want to enter: ");
		size = input.nextInt();

		/*
		 * This loop stores all the elements that we enter in an the array number. First
		 * element is at number[0], second at number[1] and so on
		 */
		for (i = 0; i < size; i++) {
			System.out.print("Enter Array Element" + (i + 1) + ": ");
			array[i] = input.nextInt();
		}

		/*
		 * Here we are writing the logic to swap first element with last element, second
		 * last element with second element and so on. On the first iteration of while
		 * loop i is the index of first element and j is the index of last. On the
		 * second iteration i is the index of second and j is the index of second last.
		 */
		j = i - 1;
		i = 0;

		while (i < j) {
			temp = array[i];
			array[i] = array[j];
			array[j] = temp;
			i++;
			j--;
		}

		System.out.print("Reversed array: ");
		for (i = 0; i < size; i++) {
			System.out.print(array[i] + "  ");
		}
	}

}
