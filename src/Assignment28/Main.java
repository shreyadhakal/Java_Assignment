package Assignment28;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Method obj = new Method ();
		Scanner input = new Scanner(System.in);
		int n = 0;
		String decision="";
		
		do {
			System.out.println("Enter your choice: isPrime |NthPrime | allPrime");
			String choice = input.next().toLowerCase();
			switch (choice) {
				case "isprime":
					System.out.println("enter number to find prime number" );
					n = input.nextInt();
					boolean IsPrime = obj.isPrimeNumber(n);
					if (IsPrime) {
						System.out.println(n + "is a prime number");
					} 
					else { 
						System.out.println(n + "is not a prime number");
					}
					break;
				case "nthprime":
					System.out.println("enter number to find nth prime number" );
					n = input.nextInt();
					obj.firstNthPrime(n);
					break;
				case "allprime":
					System.out.println("enter start number to find all Prime between start and end numbers" );
					int start = input.nextInt();
					System.out.println("enter end number to find all Prime between start and end numbers" );
					int end = input.nextInt();
					obj.allPrimeBetween(start, end);
					break;
				default:
					break;	
			} 
			System.out.println("Do you want to continue? say yes or no");
			decision= input.next();
		}
		while(decision.equalsIgnoreCase("yes"));
		
		System.out.println("Bye bye Happy coding!");
	}
	
}
