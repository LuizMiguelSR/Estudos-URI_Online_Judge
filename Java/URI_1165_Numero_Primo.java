package Iniciante;
import java.util.Scanner;

public class URI_1165_Numero_Primo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, x, c;
        n = in.nextInt();
        for(int i = 0; i < n; i++){
            x = in.nextInt();
            c = 0;
            for(int j = 1; j <= x; j++){
                if(x%j==0){
                    c++;
                }
            }
            if(c > 2){
                System.out.println(x+" nao eh primo");
            } else {
                System.out.println(x+" eh primo");
            }
        }
    }
    
}
