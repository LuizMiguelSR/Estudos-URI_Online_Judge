/*Ler um valor N. Calcular e escrever seu respectivo fatorial. 
Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
Entrada
A entrada contém um valor inteiro N (0 < N < 13).
Saída
A saída contém um valor inteiro, correspondente ao fatorial de N.
 */
package Iniciante;

import java.util.Scanner;

public class URI_1153_Fatorial_Simples {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, fat=1;
        n = in.nextInt();
        for(int i = n; i>=1; i--){
            fat*=i;
        }
        System.out.println(fat);
    }
    
}
