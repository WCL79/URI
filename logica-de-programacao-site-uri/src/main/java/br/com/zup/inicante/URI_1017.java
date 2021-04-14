package br.com.zup.inicante;

import java.io.IOException;
import java.util.Scanner;

public class URI_1017 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int m = sc.nextInt();
        float aux = t * m;
        sc.close();
        System.out.printf("%.3f\n", aux / 12);

    }

}
