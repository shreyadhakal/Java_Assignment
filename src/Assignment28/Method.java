package Assignment28;

public class Method {

	public boolean isPrimeNumber(int n) {
		boolean isPrime = true;
		for (int i = 2 ; i <= n / 2; i++) {
			if (n % i == 0) {
				isPrime = false;
				
			}
		}
		return isPrime;

	}

	public void firstNthPrime(int n) {
		for (int i = 1; i <= n; i++) {
			if (isPrimeNumber(i)) {
				System.out.println(i + "");
			}
		}
	}

	public void allPrimeBetween(int start, int end) {
		for (int i = start; i <= end; i++) {
			if (isPrimeNumber(i)) {
				System.out.println(i + "");
			}

		}
	}
}