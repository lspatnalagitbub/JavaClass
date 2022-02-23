
import java.text.DecimalFormat;

public class NumberFormatting {

	public static void main(String[] args) {
		
		float f = 89.575757f;
		
		double d=876.67893434;
		
		System.out.println(String.format("%.2f", f));

		DecimalFormat df = new DecimalFormat("#.##");

		System.out.println(df.format(f));
		
		System.out.println(String.format("%.3f", d));

	}

}
