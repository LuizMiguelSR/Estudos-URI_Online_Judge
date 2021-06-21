package Iniciante;

public class URI_1155_Sequencia {

    public static void main(String[] args) {
        double i, c, s=0;
        for(i = 1; i <= 100; i++){
            c = 1/i;
            s+=c;
        }
        System.out.printf("%.2f\n",s);
    }
    
}
