
public class MethodOverloading {

	
	void additon(int x)
	{
		System.out.println(x+x);
		
	}
	
	
	  void addition(int x,int y) { System.out.println(x+y); }
	 
	
	void addition (int x,float y)
	{
		System.out.println(x+y);
	}
	
	void addition (int x, float y, float z)
	{
		System.out.println(x+y+z);
	}
	
	
	public static void main(String[] args) {
		MethodOverloading m1=new MethodOverloading();
		
		m1.additon(10);
		m1.addition(10, 20);
		m1.addition(10, 20.5f);
		m1.addition(10, 8.8f,9.6f);
		

	}

}
