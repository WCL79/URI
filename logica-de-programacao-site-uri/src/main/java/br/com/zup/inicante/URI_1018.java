package br.com.zup.inicante;

import java.io.IOException;
import java.util.Scanner;

public class URI_1018 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();
        if (a > 0 && a < 1000000) {
            System.out.println(a);
            System.out.printf("%d nota(s) de R$ 100,00\n", a / 100);
            a %= 100;
            System.out.printf("%d nota(s) de R$ 50,00\n", a / 50);
            a %= 50;
            System.out.printf("%d nota(s) de R$ 20,00\n", a / 20);
            a %= 20;
            System.out.printf("%d nota(s) de R$ 10,00\n", a / 10);
            a %= 10;
            System.out.printf("%d nota(s) de R$ 5,00\n", a / 5);
            a %= 5;
            System.out.printf("%d nota(s) de R$ 2,00\n", a / 2);
            a %= 2;
            System.out.printf("%d nota(s) de R$ 1,00\n", a);
        }
    }
}
