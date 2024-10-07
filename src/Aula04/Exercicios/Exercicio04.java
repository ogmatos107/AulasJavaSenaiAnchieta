package Aula04.Exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("coloque o valor de vendas: ");

        float vendas = scanner.nextFloat();

        if (vendas >= 0 && vendas < 1000) {
            System.out.println("sua comissão é de " + (vendas * 5 / 100) + " reias");
        } else if (vendas >= 1000 && vendas < 5001) {
            System.out.println("sua comissão é de " + (vendas * 10 / 100) + " reias");
        } else {
            System.out.println("Sua comissão é de " + (vendas * 15 / 100) + " reias");
        }
        scanner.close();

    }
}
