package br.com.zup.inicante;

import java.io.IOException;
import java.util.Scanner;

public class URI_1008 {

    public static void main(String[] args) throws IOException {
        int f, h;
        double d;
        Scanner sc = new Scanner(System.in);
        f = sc.nextInt();
        h = sc.nextInt();
        d = sc.nextDouble();
        sc.close();
        System.out.format("NUMBER = %d\nSALARY = U$ %.2f\n", f, (h * d));

    }
}
