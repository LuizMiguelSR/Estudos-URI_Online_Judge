package Iniciante;

import java.util.Locale;
import java.util.Scanner;

public class URI_1174_Selecao_Em_Vetor_I {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Scanner in = new Scanner(System.in);
        float[] a = new float[4];
        float x;
        for(int i = 0; i < 4; i++){
            x = in.nextFloat();
            a[i] = x;
            if(x <= 10){
                System.out.printf("A[%d] = %.1f\n", i, a[i]);
            }
        }
    }
    
}
