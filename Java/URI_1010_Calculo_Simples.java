import java.util.Scanner;

public class URI_1010_Calculo_Simples {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numPc1, numPc2, codPc1, codPc2;
		double valUnit1, valUnit2, total;
		
		codPc1 = sc.nextInt();
		numPc1 = sc.nextInt();
		valUnit1 = sc.nextDouble();
		
		codPc2 = sc.nextInt();
		numPc2 = sc.nextInt();
		valUnit2 = sc.nextDouble();
		
		total = (numPc1 * valUnit1) + (numPc2 * valUnit2);
		System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);
		
		sc.close();

	}

}
