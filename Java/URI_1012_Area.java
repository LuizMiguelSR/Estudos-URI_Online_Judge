import java.util.Scanner;

public class URI_1012_Area {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double a, b, c, tri, cir, tra, qua, ret, pi = 3.14159;
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		tri = (a * c) / 2;
		cir = pi * (c * c);
		tra = ((a + b) * c) / 2;
		qua = b * b;
		ret = a * b;
		
		System.out.printf("TRIANGULO: %.3f\n", tri);
		System.out.printf("CIRCULO: %.3f\n", cir);
		System.out.printf("TRAPEZIO: %.3f\n", tra);
		System.out.printf("QUADRADO: %.3f\n", qua);
		System.out.printf("RETANGULO: %.3f\n", ret);
		
		sc.close();

	}

}
