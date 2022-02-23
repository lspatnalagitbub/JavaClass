import java.util.Scanner;

public class PrimeNumberEx {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n, i;
		boolean isPrime = true;

		System.out.println("Enter any integer number to find prime or not:");
		n = sc.nextInt();

		for (i = 2; i < n / 2; i++) {
			
			if (n % i == 0) {

				isPrime = false;

				break;
			}
		}

		if (isPrime)
			
			System.out.println("Given number " + n + " is  prime");

		else

			System.out.println("Given number " + n + " is not prime");

	}

}
