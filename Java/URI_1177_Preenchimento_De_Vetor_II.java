package Iniciante;

import java.util.Scanner;

public class URI_1177_Preenchimento_De_Vetor_II {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] n = new int[1000];
        int c = 0;
        int t = in.nextInt();
        for(int i = 0; i < 1000; i++){
            if(c < t){
                System.out.println("N["+i+"] = "+c);
                c++;
            } else {
                c = 0;
                System.out.println("N["+i+"] = "+c);
                c++;
            }
        }
    }
    
}
