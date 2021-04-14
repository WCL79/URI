package br.com.zup.inicante;

import java.io.IOException;
import java.util.Scanner;

public class URI_1009 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String nome;
        double salario, venda, comissao;
        nome = sc.nextLine();
        salario = sc.nextDouble();
        venda = sc.nextDouble();
        sc.close();
        comissao = venda * 0.15;
        System.out.format("TOTAL = R$ %.2f\n", (salario + comissao));

    }

}
