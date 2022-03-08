import java.util.Scanner;


//Example program for 
public class MethodEx1 {

	void addition() // method signature
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any two Integer Values   :");
		int a = sc.nextInt();
		int b = sc.nextInt();

		System.out.println("Addtion of a and b is  :" + (a + b));
	}

	public static void main(String[] args) {

		MethodEx1 mex1 = new MethodEx1();
		mex1.addition();

	}

}
