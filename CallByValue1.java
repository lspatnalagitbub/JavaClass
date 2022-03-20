
class CallByValue1_x {

	void math(int i, int j) {
		i *= 2;
		j /= 2;
	}

}

public class CallByValue1 {

	public static void main(String[] args) {

		int i = 10, j = 20;
		
		CallByValue1_x cx = new CallByValue1_x();

		System.out.println("Value of i and j before method calling  :" + i + "   " + j);

		cx.math(i, j);

		System.out.println("Value of i and j before method calling  :" + i + "   " + j);

	}

}
