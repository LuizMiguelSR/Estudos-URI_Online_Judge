package Iniciante;
import java.util.Scanner;
public class URI_1159_Soma_De_Pares_Consecutivos {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x, c;
        x = in.nextInt();
        while(x!=0){
            if (x%2==0){
                c=0;
                for(int i = 0; i < 5; i++){                
                    c+=x;
                    x+=2;
                }
                System.out.println(c);
                x = in.nextInt();
            } else {
                x++;
                c=0;
                for(int i = 0; i < 5; i++){
                    c+=x;
                    x+=2;                  
                }
                System.out.println(c);
                x = in.nextInt();
            }         
        }
    }
}
