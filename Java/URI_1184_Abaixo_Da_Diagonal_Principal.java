package Iniciante;

import java.util.Scanner;

public class URI_1184_Abaixo_Da_Diagonal_Principal {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float som = 0; 
        float med = 0;
        float [][] mat = new float [12][12];
        int c = 0;
        String o = in.next();
        for(int i = 0; i < 12; i++){
            for(int j = 0; j < 12; j++){
                mat[i][j] = in.nextFloat();
                if(i > j){
                   som += mat[i][j];
                   c++;
                }
            }
        }
        if(o.charAt(0) == 'S'){
            System.out.printf("%.1f\n",som);
        } else {
            med = som/c;
            System.out.printf("%.1f\n",med);
        }
    }
    
}
