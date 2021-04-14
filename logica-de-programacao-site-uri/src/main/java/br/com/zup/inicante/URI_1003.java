package br.com.zup.inicante;

import java.io.IOException;
import java.util.Scanner;

public class URI_1003 {
    public static void main(String[] args) throws IOException {

        int A, B, SOMA;

        Scanner entraESaida = new Scanner(System.in);
        A = entraESaida.nextInt();
        B = entraESaida.nextInt();
        SOMA = A + B;
        System.out.printf("SOMA = "+SOMA+"\n");

    }
}
