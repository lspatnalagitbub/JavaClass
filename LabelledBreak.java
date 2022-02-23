
public class LabelledBreak {

	public static void main(String[] args) {

		label1:
			for (int i = 1; i <= 3; i++) {
			label2:
				for (int j = 1; j <= 3; j++) {
				if (i == 3 && j == 3) {
					// using break statement with label
					continue label1;
				}
				System.out.println(i + " " + j);
			}
		}
	}
}



