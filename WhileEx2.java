import java.util.Scanner;

public class WhileEx2 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter any integer value  : ");
		int n = sc.nextInt();
		int  reminder = 0, result = 0;

		while (n > 0) {

			reminder = n % 10;

			result += reminder;

			n = n / 10;

		}

		System.out.println("The addition of digits in given number is :" + result);

	}

}
