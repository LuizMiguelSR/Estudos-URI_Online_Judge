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
public class URI_1151_Fibonacci_Facil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in =  new Scanner(System.in);
        int a, b, n1=0, n2=1, c=0;
        a = in.nextInt();
        for(b = 1; b < a; b++){
            if(b%2==1){
                System.out.print(c+" ");
                c = n1 + n2;
                n1 = c;
            } else if(b == 2){
                System.out.print(c+" ");
            } else if(b % 2 == 0){
                System.out.print(c+" ");
                c = n1 + n2;
                n2 = c;
            }
        }
        System.out.println(c);
    }
    
}
