package br.com.zup.inicante;

import java.util.Scanner;

public class URI_1007 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, d, diferenca;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        sc.close();
        diferenca = ((a * b) - (c * d));
        System.out.format("DIFERENCA = %d\n", diferenca);
    }
}
