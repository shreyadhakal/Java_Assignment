package AssignmentPackage;

import java.util.Scanner;

public class Assignmentt25 {
/*25. Write a program that prompts the user to enter the number of students and each student’s name and score.
	Finally display the student with the highest score. */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int noOfStudents = input.nextInt();

		int maxscore = 0;
		String studentName = "";

		for (int i = 1; i <= noOfStudents; i++) {
			System.out.println("Enter a score");
			int score = input.nextInt();
			System.out.println("Enter student name");
			String name = input.next();
			if (score > maxscore) {
				maxscore = score;
				studentName = name;
			}
		}
		System.out.println("The max score is:" + maxscore);
		System.out.println("The student name with max score is:" + studentName);

	}

}
