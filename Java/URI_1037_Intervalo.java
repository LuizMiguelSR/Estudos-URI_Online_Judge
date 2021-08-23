import java.util.Locale;
import java.util.Scanner;

public class URI_1037_Intervalo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x;
		
		x = sc.nextDouble();
		
		if (x < 0.00 || x > 100.00) {
			System.out.println("Fora de intervalo");			
		} else if (x <= 25) {
			System.out.println("Intervalo [0,25]");
		} else if (x <= 50) {
			System.out.println("Intervalo (25,50]");
		} else if (x <= 75.00) {
			System.out.println("Intervalo (50,75]");
		} else {
			System.out.println("Intervalo (75,100]");
		}
		
		sc.close();

	}

}
