import java.util.Scanner;

public class URI_1002_Area {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double area, n=3.14159, raio;
		raio = sc.nextDouble();
		area = n * (raio * raio);
		System.out.printf("A=%.4f\n", area);
		
		sc.close();

	}

}
