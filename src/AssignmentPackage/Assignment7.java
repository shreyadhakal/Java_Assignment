package AssignmentPackage;

import java.util.Scanner;

//7.	Write a program that reads the radius and length of a cylinder and computes volume.
public class Assignment7 {

	public static void main(String[] args) {
		final double PI = Math.PI;
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the radius: ");
		double R = input.nextDouble();
		System.out.println("Enter the height: ");
		double H = input.nextDouble();
		 double VolumeofCylinder = PI * R * R * H;  //Or you can do Math.pow(radius, 2) to find r square.
		 System.out.println("The volume of cylinder is " + VolumeofCylinder);

	}

}
