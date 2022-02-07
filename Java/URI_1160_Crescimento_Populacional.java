package Iniciante;

import java.util.Scanner;

public class URI_1160_Crescimento_Populacional {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t, pa, pb, tempo;
        float ga, gb;
        t = in.nextInt();
        for(int i = 1; i <= t; i++){
            tempo = 0;
            pa = in.nextInt();
            pb = in.nextInt();
            ga = in.nextFloat();
            gb = in.nextFloat();
            while (pa <= pb) {
                pa *= (ga/100.0)+1.0;
                pb *= (gb/100.0)+1.0;
                tempo++;
                if(tempo > 100){
                    System.out.println("Mais de 1 seculo.");
                    break;
                }
            }
            if(tempo<=100){
                System.out.println(tempo+" anos.");
            }
        }
    }
    
}
