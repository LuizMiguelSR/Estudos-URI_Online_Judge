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
public class URI_1145_Sequencia_Logica_II {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
	Scanner leitor = new Scanner(System.in);
        int X = leitor.nextInt();
	int Y = leitor.nextInt();
	int cont = 1;
	for (int i = 1; i <= Y; i++) {
            System.out.print(i);
            if (i % X == 0) System.out.println("");
            else System.out.print(" ");

	}
    }
    
}
