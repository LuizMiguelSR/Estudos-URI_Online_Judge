package Iniciante;

public class URI_1156_Sequencia_S_II {

    public static void main(String[] args) {
        double i, b=1, c, s=0;
        for(i = 1; i <= 39; i+=2){
            c = i/b;
            s+=c;
            b*=2;
        }
        System.out.printf("%.2f\n",s);
    }
    
}
