package AssignmentPackage;

import java.util.Scanner;

public class Assignmentt37 {

	public static void main(String[] args) {
		final int ROW = 3;
		final int COLUMN = 3;

		// User Input
		int[][] array1 = new int[ROW][COLUMN];
		Scanner input = new Scanner(System.in);
		System.out.println("Matrix 1");
		for (int i = 0; i < ROW; i++) {
			for (int j = 0; j < COLUMN; j++) {
				System.out.println("Enter element of array:");
				array1[i][j] = input.nextInt();
			}
		}

		System.out.println("Matrix 2");
		int[][] array2 = new int[ROW][COLUMN];
		for (int i = 0; i < ROW; i++) {
			for (int j = 0; j < COLUMN; j++) {
				System.out.println("Enter element of array:");
				array2[i][j] = input.nextInt();
			}
		}

		// Sum Calculation

		int[][] SumArray = new int[ROW][COLUMN];

		for (int i = 0; i < ROW; i++) {
			for (int j = 0; j < COLUMN; j++) {
				SumArray[i][j] = array1[i][j] + array2[i][j];
			}
		}

		// Print
		for (int i = 0; i < ROW; i++) {
			for (int j = 0; j < COLUMN; j++) {
				System.out.print(SumArray[i][j] + " ");
			}
			System.out.println("");
		}
	}
}
