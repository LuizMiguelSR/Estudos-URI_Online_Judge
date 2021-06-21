package Iniciante;

import java.util.Scanner;

public class URI_1157_Divisores_I {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 1; i <= n; i++){
            if(n%i==0){
                System.out.println(i);
            }
        }
    }
    
}
