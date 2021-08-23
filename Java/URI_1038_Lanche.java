import java.util.Scanner;

public class URI_1038_Lanche {

	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
		
		int cod, qtde;
		double total;
		
		cod = sc.nextInt();
		qtde = sc.nextInt();
		
		if (cod == 1) {
			total = 4.00 * qtde;
		} else if (cod == 2) {
			total = 4.50 * qtde;
		} else if (cod == 3) {
			total = 5.00 * qtde;
		} else if (cod == 4) {
			total = 2.00 * qtde;
		} else {
			total = 1.50 * qtde;
		}
		
		System.out.printf("Total: R$ %.2f\n", total);
		
		sc.close();

	}

}
