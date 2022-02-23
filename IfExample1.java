
public class IfExample1 {

	public static void main(String[] args) {

		int x = 25;
		int y = 30;
		int z = 28;

		// Simple if
		if (x > y) {
			System.out.println(" X is greater");

		}

		// if .. else

		if (x > y)

		{
			System.out.println(" X is greater");

		} else
			System.out.println("Y is greater");

		// multiple if or if..else if ladder

		if (x > y && x > z)

		{
			System.out.println(" X.... is greater");

		} else if (y > x && y > z)
			System.out.println("Y... is greater");

		else if (z > x && z > y)

			System.out.println("Z... is greater");

		
		
		// nested if
		
		if( x> y)
		{
			if (x>z)
			{
				System.out.println("X is greater");
				
			}
			
		}
		else if( y> x)
		{
			System.out.println(" Y greater");
		}
		
		else
		{
			System.out.println("Z is greater");
		}
		
	}

}
