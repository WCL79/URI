package br.com.zup.inicante;

import java.io.IOException;
import java.util.Scanner;

public class URI_1019 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.printf("%d:%d:%d\n", a / 3600, (a % 3600) / 60, ((a % 3600) % 60));

    }
}
