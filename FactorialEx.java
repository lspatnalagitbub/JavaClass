import java.util.Scanner;

public class FactorialEx {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n, i, fact = 1;

		System.out.println("Enter any integer number :");
		n = sc.nextInt();

		for (i = 1; i <= n; i++) {
			fact *= i;
		}

		System.out.println("Factorial for the given number is :" + fact);

	}

}
