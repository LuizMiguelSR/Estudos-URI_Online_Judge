package Iniciante;

import java.util.Scanner;

public class URI_1181_Linha_Na_Matriz {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float som = 0; 
        float med = 0;
        float [][] mat = new float [12][12];
        int l = in.nextInt();
        String t = in.next();
        for(int i = 0; i < 12; i++){
            for(int j = 0; j < 12; j++){
                mat[i][j] = in.nextFloat();
                if(l == i){
                   som += mat[i][j];
                }
            }
        }
        if(t.charAt(0) == 'S'){
            System.out.printf("%.1f\n",som);
        } else {
            med = som/12;
            System.out.printf("%.1f\n",med);
        }
        
    }
    
}
