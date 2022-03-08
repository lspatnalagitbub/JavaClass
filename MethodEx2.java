import java.util.Scanner;

// Methods with arguments/parameters with return values
public class MethodEx2 {


	int addition(int a, int b)
	{

		return a+b;
	}

	public static void main(String[] args) {

		MethodEx2 mex2 = new MethodEx2();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any two Integer Values   :");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		
	    int c=	mex2.addition(a,b);
	    
	    float x=Math.round(989.6);
	    
	    System.out.println("The addtion of "+a +"  and "+b +"  is   :"+c);
	    
	    
	    System.out.println("The addtion of "+a +"  and "+b +"  is   :"+mex2.addition(12,56));

	}
}
