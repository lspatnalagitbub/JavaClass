import java.util.Scanner;

public class SwitchExInput {

	public static void main(String[] args) {
		String choice;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice [V,I,B,G,Y,O,R]");

		choice = sc.nextLine();

		switch (choice) {

		case "v":
			System.out.println("Given color is Voilet");
			break;

		case "i":
			System.out.println("Given color is Indigo");
			break;
			

		case "b":
			System.out.println("Given color is Blue");
			break;

		case "g":
			System.out.println("Given color is Green");
			break;

		case "y":
			System.out.println("Given color is Yellow");
			break;

		case "o":
			System.out.println("Given color is Orange");
			break;
		case "r":
			System.out.println("Given color is Red");
			break;

		default:
			System.out.println("Involid Choice");

		}

	}
}
