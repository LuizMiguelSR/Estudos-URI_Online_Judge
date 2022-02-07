package Iniciante;

import java.util.Scanner;

public class URI_1179_Preenchimento_De_Vetor_IV {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] par = new int[5];
        int[] impar = new int[5];
        int x, p = 0, im = 0;
        for(int i = 0; i < 15; i++){
            x = in.nextInt();
            if(x%2==0){
                par[p] = x;
                p++;
                if(p==5){
                    for(int j = 0; j <= 4; j++){
                        System.out.println("par["+j+"] = "+par[j]);
                    }
                    p = 0;
                }
            } else {
                impar[im] = x;
                im++;
                if(im==5){
                    for(int k = 0; k <= 4; k++){
                        System.out.println("impar["+k+"] = "+impar[k]);
                    }
                    im = 0;
                }
            }
            if(i==14){
                for(int k = 0; k < im; k++){
                    System.out.println("impar["+k+"] = "+impar[k]);
                }
                for(int j = 0; j < p; j++){
                    System.out.println("par["+j+"] = "+par[j]);
                }
            }
        }
    }
    
}
