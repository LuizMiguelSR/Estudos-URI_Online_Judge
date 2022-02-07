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
public class URI_1150_Ultrapassando_Z {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in =  new Scanner(System.in);
        int a, b, x, z, c=0;
        x = in.nextInt();
        do {
            z = in.nextInt();
        } while(z<=x);
        for(a = x, b = 0; b < z; a++){
            b+=a;
            c++;
        }
        System.out.println(c);
        
    }
    
}
