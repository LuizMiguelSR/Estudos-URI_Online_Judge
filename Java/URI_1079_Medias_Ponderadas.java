import java.util.Locale;
import java.util.Scanner;

public class URI_1079_Medias_Ponderadas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		double med1, med2, med3, med;
		
		int N = sc.nextInt();
		
		for (int i = 0; i < N; i++) {
			med1 = sc.nextDouble();
			med2 = sc.nextDouble();
			med3 = sc.nextDouble();
			
			med = ((med1 * 2.0) + (med2 * 3.0) + (med3 * 5.0)) / 10;
			
			System.out.printf("%.1f\n", med);
		}
		
		sc.close();

	}

}
