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
public class URI_1149_Somando_Inteiros_Consecutivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int x, n, a,b=0;

        x = in.nextInt();
        n = in.nextInt();

        while(n<=0){
            n = in.nextInt();
        }
        for(a=1; a<=n; a++){
            b+=x;
            x++;
        }

        System.out.println(b);        
    }
    
}
