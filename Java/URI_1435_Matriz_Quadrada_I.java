package Iniciante;

import java.util.Scanner;

public class URI_1435_Matriz_Quadrada_I {

    public static void main(String[] args) {
    	Scanner leitor = new Scanner(System.in);
    	int N = leitor.nextInt();
    	int x;
    	while (N != 0) {
    		for (int i = 1; i <= N; i++) {
    			for (int j = 1 ; j <= N; j++) {
    				x = i;
                    if (j < x) x = j;
                    if (N-i+1 < x) x = N-i+1;
                    if (N-j+1 < x) x = N-j+1;
                    
                    System.out.printf("%3d", x);
                    if (j < N) System.out.print(" ");
                    else System.out.print("\n");
                }
            }
            System.out.print("\n");
            N = leitor.nextInt();
        }
    }
    
}
