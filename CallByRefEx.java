class CallByReference {

	int a, b;

	CallByReference(int i, int j) {
		a = i;
		b = j;
	}

	void math(CallByReference cf) {
		cf.a *= 2;
		cf.b /= 2;
	}

}

public class CallByRefEx {

	public static void main(String[] args) {

		
		CallByReference cf1= new CallByReference(10,20);

		System.out.println("Value of i and j before method calling  :" + cf1.a + "   " + cf1.b);

		cf1.math(cf1);

		System.out.println("Value of i and j before method calling  :" + cf1.a + "   " + cf1.b);

	}

}
