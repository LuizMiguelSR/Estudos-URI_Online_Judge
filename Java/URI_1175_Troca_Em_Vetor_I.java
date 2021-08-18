package Iniciante;

import java.util.Scanner;

public class URI_1175_Troca_Em_Vetor_I {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[]n = new int[20];
        for(int i = 0; i < 20; i++){
            n[i] = in.nextInt();
        }
        int x=0, y=19;
        for(int i = 0; i < 10; i++){
            int temp1=0, temp2=0;
            temp1 = n[x];
            temp2 = n[y];
            n[x] = temp2;
            n[y] = temp1;
            x++;
            y--;
        }
        for(int i = 0; i < 20; i++){
            System.out.println("N["+i+"] = "+n[i]);
        }
    }
    
}
