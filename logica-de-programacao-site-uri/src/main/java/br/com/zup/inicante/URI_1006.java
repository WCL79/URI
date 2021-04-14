package br.com.zup.inicante;

import java.io.IOException;
import java.util.Scanner;

public class URI_1006 {

    public static void main(String[] args) throws IOException {

        double a, b, c, d;
        Scanner sc = new Scanner(System.in);
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = a * 3.5;
        d = b * 7.5;
        System.out.format("MEDIA = %.5f\n", (c + d) / 11);

    }
}
