import java.util.Scanner;

public class WhileEx1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any integer value   : ");
		int n = sc.nextInt();

		int i = 1;
		while (i <= n) {
			System.out.println(String.format("%-3d", i));
			i++;
		}

	}

}
