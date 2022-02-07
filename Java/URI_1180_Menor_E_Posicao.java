package Iniciante;

import java.util.Scanner;

public class URI_1180_Menor_E_Posicao {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int []x = new int [n];
        for(int i = 0; i < n; i++){
            x[i] = in.nextInt();
        }
        int men = x[0];
        int p = 0;
        for(int i = 0; i < n; i++){
            if(men > x[i]){
                men = x[i];
                p = i;
            }
        }
        System.out.println("Menor valor: "+men);
        System.out.println("Posicao: "+p);
    }
    
}
