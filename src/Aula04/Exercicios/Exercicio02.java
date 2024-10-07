package Aula04.Exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("informe o valor da compra: ");
        float valor = sc.nextFloat();

        float desconto = 0.1f;

        if (valor > 100) {
            System.out.println("sua compra foi no valor de " + valor + " reais então voce recebeu um desconto de: " + (desconto * valor) + " reais.");
        } else {
            System.out.println("sua compra foi no valor de " + valor + " então voce não recebeu desconto.");
        }
        sc.close();
    }
}

