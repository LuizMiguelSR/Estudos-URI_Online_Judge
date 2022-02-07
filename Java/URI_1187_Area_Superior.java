package Iniciante;

import java.util.Scanner;

public class URI_1187_Area_Superior {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double m[][] = new double[12][12];
        double sum = 0;
        int count = 0;
        String v = sc.next();
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                double x = sc.nextDouble();
                m[i][j] = x;
                if (j > i && j < (m.length - i - 1)) {
                    sum += x;
                    count++;
                }
            }
        }
        if (v.equals("S")) {
            System.out.printf("%.1f\n", sum);
        } else {
            System.out.printf("%.1f\n", (sum / count));
        }
    }
    
}
