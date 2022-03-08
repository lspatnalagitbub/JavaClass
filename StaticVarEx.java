
public class StaticVarEx {

	static int staticVar = 0;
	int nonstaticVar = 0;
	
	static void showStaticMethod()
	{
		System.out.println("ShowStaticMethod");
	}

	void showValues() {

		System.out.println("Static Variable  value      :" + staticVar);
		System.out.println("Non Static Varaible value   :" + nonstaticVar);
		staticVar++;
		nonstaticVar++;
	}

	public static void main(String[] args) {

		StaticVarEx ex1 = new StaticVarEx();
		ex1.showValues();

		StaticVarEx ex2 = new StaticVarEx();
		ex2.showValues();

		StaticVarEx ex3 = new StaticVarEx();
		ex3.showValues();
		ex3.showValues();

	}

}



