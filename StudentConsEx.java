
public class StudentConsEx {

	int id;
	String name;
	int age;
	
	StudentConsEx()
	{
		
	}
	

	// creating two arg constructor
	StudentConsEx(int i, String n) {
		id = i;
		name = n;
	}

	// creating three arg constructor
	StudentConsEx(int i, String n, int a) {
		id = i;
		name = n;
		age = a;
	}

	void display() {
		System.out.println(id + " " + name + " " + age);
	}

	public static void main(String args[]) {
		StudentConsEx s=new StudentConsEx();
		StudentConsEx s1 = new StudentConsEx(111, "Karan");
		StudentConsEx s2 = new StudentConsEx(222, "Aryan", 25);
		s1.display();
		s2.display();
	}
}