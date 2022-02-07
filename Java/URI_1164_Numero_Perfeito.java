package Iniciante;
import java.util.Scanner;

public class URI_1164_Numero_Perfeito {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x, n;
        n = in.nextInt();
        for(int i = 0; i < n; i++){
            x = in.nextInt();
            int som = 0;
            for(int j = 1; j <= x; j++){
                if(j!=x){
                    if(x%j==0){
                        som+=j;
                    }
                }
            }
            if(som==x){
                System.out.println(x+" eh perfeito");
            } else {
                System.out.println(x+" nao eh perfeito");
            }
            
        }
    }
    
}
