import java.util.Scanner;

public class DoWhileNested {

	public static void main(String[] args) {

		String choice;

		Scanner sc = new Scanner(System.in);

		Scanner sc1 = new Scanner(System.in);

		int n, i;
		
		do {
			i = 1;

			System.out.println("Enter any integer number :");
			n = sc.nextInt();

			do {

				System.out.println(n + " X " + i + " = " + (i * n));
				i++;

			} while (i <=10);

			System.out.println("Do you want to continue :");
			choice = sc1.nextLine();

		} while (choice.equals("y"));

	}

}
