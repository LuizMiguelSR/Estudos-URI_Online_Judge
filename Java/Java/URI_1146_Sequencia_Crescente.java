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
public class URI_1146_Sequencia_Crescente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int x = 1, i;
        while(x != 0) {
            x = in.nextInt();
                for(i = 1; i <= x; i++){
                    System.out.print(i+(i == x ? "\n" : " "));
                }
        }
    }
    
}
