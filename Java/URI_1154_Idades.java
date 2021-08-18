package Iniciante;

import java.util.Scanner;

public class URI_1154_Idades {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i=0, c=0;
        float med, ni=0;
        while(i>=0){
            i = in.nextInt();
            if(i>=0){
                ni+=i;
                c++; 
            }   
        }
        med = ni/(float)c;
        System.out.printf("%.2f\n",med);
    }    
}
