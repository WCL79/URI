package br.com.zup.inicante;

import java.io.IOException;
import java.util.Scanner;

public class URI_1015 {

    public static void main(String[] args) throws IOException {

        double x1, y1, x2, y2, contem, distancia;

        Scanner entrada = new Scanner(System.in);
         x1 = entrada.nextDouble();
         y1 = entrada.nextDouble();
         x2 = entrada.nextDouble();
         y2 = entrada.nextDouble();
         contem = ((x2 - x1)* (x2 - x1)) +((y2 - y1)*(y2 - y1));
         distancia = Math.sqrt(contem);
        System.out.printf("%.4f\n",distancia);
    }
}
