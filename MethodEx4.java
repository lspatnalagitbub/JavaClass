import java.util.Scanner;

//Methods with arguments/Parameters without returns values

public class MethodEx4 {

	void addition(int a, int b) {

		System.out.println("The addition of two values is   :" + (a + b));

	}

	public static void main(String[] args) {

		MethodEx4 mex4 = new MethodEx4();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any two Integer Values   :");
		int a = sc.nextInt();
		int b = sc.nextInt();

		mex4.addition(a, b);

	}
}
