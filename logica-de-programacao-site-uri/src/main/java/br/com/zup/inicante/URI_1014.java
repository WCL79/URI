package br.com.zup.inicante;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class URI_1014 {

    public static void main(String[] args) throws IOException {

        Scanner entrada = new Scanner(System.in);
        double A = entrada.nextDouble();
        double B = entrada.nextDouble();
        double T = (A / B);
        DecimalFormat df = new DecimalFormat("0.###");
        String S = df.format(T);
        System.out.printf(S+" km/l%n");

    }
}
