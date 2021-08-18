/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iniciante;

import java.util.Scanner;

public class URI_1182_Coluna_Na_Matriz {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float som = 0; 
        float med = 0;
        float [][] mat = new float [12][12];
        int c = in.nextInt();
        String t = in.next();
        for(int i = 0; i < 12; i++){
            for(int j = 0; j < 12; j++){
                mat[i][j] = in.nextFloat();
                if(c == j){
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
