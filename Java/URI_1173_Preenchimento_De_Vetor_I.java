package Iniciante;
import java.util.Scanner;
public class URI_1173_Preenchimento_De_Vetor_I {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] n = new int [10];
        int v;
        v = in.nextInt();
        for(int i = 0; i <= 9; i++){
            if(i==0){
                n[i] = v;
                System.out.println("N["+i+"] = "+n[i]);
            } else {
                n[i] = n[i-1] * 2;
                System.out.println("N["+i+"] = "+n[i]);
            }
        }
    }
    
}
