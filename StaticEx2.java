
public class StaticEx2 {

	String a[]= {"aaa","bbb"};
	
	static void show()
	{
		System.out.println("Show static method");
	}
	
	void display()
	{
		System.out.println("Display method");
		
	
	}
	public static void main(String[] args) {
		
		
		StaticEx2 ex2=new StaticEx2();
		
		StaticEx2.show();
		ex2.display();

	}

}
