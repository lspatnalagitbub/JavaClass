import java.util.Scanner;

class Student3 {

	String studentName;
	String studentID;
	String studentGroup;
	double marks1, marks2, marks3, total, avg;
	String grade;

    Student3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student Name  :");
		studentName = sc.nextLine();
		System.out.println("Enter Stduent No    :");
		studentID = sc.nextLine();
		System.out.println("Enter Student marks1, marks2, marks2");
		marks1 = sc.nextInt();
		marks2 = sc.nextInt();
		marks3 = sc.nextInt();
		totalMarks();
		avgMarks();
		findGrade();

	}

	void totalMarks() {
		total = marks1 + marks2 + marks3;
	}

	void avgMarks()

	{
		avg = total / 3;
	}

	void findGrade() {
		if (marks1 >= 35 && marks2 >= 35 && marks3 >= 35) {

			if (avg >= 60) {
				grade = "First Class";
			} else if (avg >= 50) {
				grade = "Second Class";

			} else if (avg >= 35) {
				grade = "Pass";
			}

		}

		else {
			grade = "Fail";
		}
	}

	void showStudentDetails() {
		System.out.println("Student Name  :" + studentName);
		System.out.println("Student ID    :" + studentID);
		System.out.println("Student Marks1 , Marks2, Marks3  :" + marks1 + "  " + marks2 + "   " + marks3);
		System.out.println("Total Marks    :" + total);
		System.out.println("Avg   Marks    :" + avg);
		System.out.println("Grade          :" + grade);
	}

}

public class StudentConstructor {

	public static void main(String[] args) {

		Student3 s1 = new Student3();
		Student3 s2 = new Student3();

	
		s1.totalMarks();
		s1.avgMarks();
		s1.findGrade();

	

		s1.showStudentDetails();
		s2.showStudentDetails();


	}

}
