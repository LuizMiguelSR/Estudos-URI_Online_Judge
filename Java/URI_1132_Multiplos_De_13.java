/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iniciante;

import java.util.Scanner;

/**
 *
 * @author Luiz Miguel
 */
public class URI_1132_Multiplos_De_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int x, y, soma=0;
        x = in.nextInt();
        y = in.nextInt();
        if(x<y){
            for(int i = x; i <= y; i++) {
                if(i%13!=0){
                    soma+=i;
                }
            }
        } else {
            for(int i = y; i <= x; i++) {
                if(i%13!=0){
                    soma+=i;
                }
            }
        }
        System.out.println(soma);
    }
    
}
