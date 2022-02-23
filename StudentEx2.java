
public class StudentEx2 {
	
	public static void main(String[] args) {
		
		Student students[]=new Student[100];
		
		
		for(int i=0;i<4;i++)
		{
			students[i]=new Student();
			students[i].getStudentDetails();
		}
	
		for(int i=0;i<4;i++)
		{
			System.out.println();
			students[i].showStudentDetails();
			
		}
		
		
		
	}

}
