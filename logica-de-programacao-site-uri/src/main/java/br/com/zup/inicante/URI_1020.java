package br.com.zup.inicante;

import java.io.IOException;
import java.util.Scanner;

public class URI_1020 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.printf("%d ano(s)\n%d mes(es)\n%d dia(s)\n", (a / 365), ((a % 365) / 30), ((a % 365) % 30));

    }
}
