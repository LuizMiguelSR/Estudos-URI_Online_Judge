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
public class URI_1143_Quadrado_E_Ao_Cubo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int n;
        n = in.nextInt();
        
        for(int i = 1; i <= n; i++) {
            System.out.println(i+" "+(i*i)+" "+(i*i*i));
        }
    }
    
}
