package Iniciante;

import java.util.Scanner;

public class URI_1178_Preenchimento_De_Vetor_III {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x;
        double[] n = new double[100];
        x = in.nextDouble();
        n[0] = x;
        for(int i = 1; i < n.length; i++){
            n[i] = n[i-1] / 2.0000;
        }
        for(int i = 0; i < n.length; i++){
            System.out.println(String.format("N[" + i + "] = %.4f", n[i]));
        }
    }
    
}
