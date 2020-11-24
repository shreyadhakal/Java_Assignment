package AssignmentPackage;

import java.util.Scanner;

public class Assignmentt29 {

	public static void main(String[] args) {
		Assignmentt29 obj = new Assignmentt29();

		Scanner input = new Scanner(System.in);
		System.out.println("Enter number to find factorial");
		int n = input.nextInt();
		float fact = obj.findSeries(n);
		System.out.println("The result is" + fact);
	}
	
	public float findSeries(int n) {
		float sum = 0;
		for(int i = 1; i<=n; i++) 
		{
			sum = sum + ((float) i / (float)(findFactorial(i)));
		}
		return sum;
	}

	public int findFactorial(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		return fact;
	}

}
