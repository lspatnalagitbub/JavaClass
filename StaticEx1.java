
public class StaticEx1 {

	
	int a;
	
	
	void show()
	{
		System.out.println("Show method ");
	}
	
	//static block
	
	static
	{
		
		System.out.println("Class loaded");
	}
	
	void showA()
	{
		System.out.println("The value of A is "+a);
	}
	
	public static void main(String[] args) {
		
		StaticEx1 ex1=new StaticEx1();
		
		ex1.a=100;
		ex1.showA();
		ex1.show();
		
	}

}
