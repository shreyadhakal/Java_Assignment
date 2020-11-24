package AssignmentPackage;
//8.	Write a program to convert Fahrenheit to Celsius and Celsius to Fahrenheit.
public class Assignment8 {

	public static void main(String[] args) {
		
		double F = 105.50 ;
		double C = (F - 32) * 5/9;
		System.out.println("The converted Celsius value is" + C);
  
		double Fahrenheit  = C * ((double) 9/ (double) 5) + 32;
		System.out.println("The converted Fahrenheit is " + Fahrenheit);
	}

}
