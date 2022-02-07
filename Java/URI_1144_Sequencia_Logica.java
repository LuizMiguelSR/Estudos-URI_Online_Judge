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
public class URI_1144_Sequencia_Logica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int a, b, c, d, e, f;
        a = in.nextInt();
        for(b=1;b<=a;b++){
            c=b*b;
            d=b*b*b;
            System.out.println(b+" "+c+" "+d);
            e=c+1;
            f=d+1;
            System.out.println(b+" "+e+" "+f);
        }
    }
    
}
