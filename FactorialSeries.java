import java.util.Scanner;

public class FactorialSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n, i;
		long fact;

		System.out.println("Enter any integer number :");
		n = sc.nextInt();

		for (int j = 1; j <= n; j++) {
			fact=1;

			for (i = 1; i <= j; i++) {
				fact *= i;
			}

			System.out.println("Factorial for the given number    "+j +" = " + fact);

		}

	}

}
