package br.com.zup.inicante;

import java.io.IOException;
import java.util.Scanner;

public class URI_1002 {
    public static void main(String[] args) throws IOException {

        double raio, area, pi = 3.14159;
        Scanner scan = new Scanner(System.in);
        raio = scan.nextDouble();
        area = (raio * raio) * pi;
        scan.close();
        System.out.print("A=");
        System.out.format("%.4f\n", area);

    }
}
