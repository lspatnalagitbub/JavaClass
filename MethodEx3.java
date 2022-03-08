import java.util.Scanner;


//Method without arguments/parameters with return values

public class MethodEx3 {

	int addition() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any two Integer Values   :");
		int a = sc.nextInt();
		int b = sc.nextInt();

		return a + b;

	}

	public static void main(String[] args) {

		MethodEx3 mex3 = new MethodEx3();

		int c = mex3.addition();
		System.out.println("The addtion of  is   :" + c);

		System.out.println("The addtion of a and b  is   :" + mex3.addition());

	}
}