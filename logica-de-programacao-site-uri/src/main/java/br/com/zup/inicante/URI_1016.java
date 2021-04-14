package br.com.zup.inicante;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class URI_1016 {


    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);

        int time;
        int xSpeed = 60;
        int ySpeed = 90;
        Scanner sc = new Scanner(System.in);

        time = sc.nextInt();
        ySpeed = time * 2;
        System.out.println(ySpeed + " " + "minutos");

    }
}
