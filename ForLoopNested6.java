

public class ForLoopNested6 {
	public static void main(String[] args) {

		for (int i = 5, x = 1; i >= 1; i--, x++) { 
			
			for (int s = 1; s <= i - 1; s++)
				System.out.print("  ");

			for (int j = 1; j <= x; j++)
				System.out.print(" *");
			

			System.out.println();
		}

	}
}

