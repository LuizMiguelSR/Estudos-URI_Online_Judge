import java.util.Scanner;

public class URI_1134_Tipo_de_Combustivel {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		
		int alc = 0, gas = 0, die = 0, x;
		
		x = sc.nextInt();
		
		while (x != 4) {
			if (x == 1) {
				alc++;
			} else if (x == 2) {
				gas++;
			} else if (x == 3) {
				die++;
			} else {
				
			}
			
			x = sc.nextInt();
		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alc);
		System.out.println("Gasolina: " + gas);
		System.out.println("Diesel: " + die);
		
		sc.close();

	}

}
