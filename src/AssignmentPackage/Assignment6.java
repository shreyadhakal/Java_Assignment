package AssignmentPackage;

import java.util.Scanner;
//6.	Write a program to find the perimeter of a circle, triangle, and rectangle.
public class Assignment6 {

	public static void main(String[] args) {
		final double PI = Math.PI;
		Scanner radius = new Scanner(System.in);
		System.out.println("Enter the radius: ");
		double R = radius.nextDouble();
		double PerimeterofCircle = 2 * PI * R;
		System.out.println("The perimeter of circle is " + PerimeterofCircle);

		System.out.println("-------------");
		Scanner length = new Scanner(System.in);
		System.out.println("Enter the length : ");
		int l = length.nextInt();
		Scanner width = new Scanner(System.in);
		System.out.println("Enter the width: ");
		int w = width.nextInt();
		int PerimeterofRectangle = l * w;
		System.out.println("The perimeter of reactangle is " + PerimeterofRectangle);
		
		System.out.println("-------------");
		
		Scanner side_A = new Scanner(System.in);
		System.out.println("Enter the side A : ");
		int A = side_A.nextInt();
		Scanner side_C = new Scanner(System.in);
		System.out.println("Enter the side B: ");
		int C = side_C.nextInt();
		Scanner base = new Scanner(System.in);
		System.out.println("Enter the base: ");
		int B = base.nextInt();
		int PerimeterofTriangle = A + B + C;
		System.out.println("The perimeter of rtriangle is " + PerimeterofTriangle);
	}

}
