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
public class URI_1134_Tipos_De_Combustivel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int op=0, ca=0, cg=0, cd=0;
        
        while(op!=4){
            op = in.nextInt();
            if(op == 1){
                ca++;
            } else if(op == 2) {
                cg++;
            } else if(op == 3) {
                cd++;
            }
        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: "+ca);
        System.out.println("Gasolina: "+cg);
        System.out.println("Diesel: "+cd);
    }
    
}
