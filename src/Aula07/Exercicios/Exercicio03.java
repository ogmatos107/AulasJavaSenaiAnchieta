package Aula07.Exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        int dobro = dobrar(0, 2);
        System.out.println(dobro);
    }

    public static int dobrar(int parametro01, int parametro02) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("digite um numero para descobrir seu dobro: ");
        parametro01 = scanner.nextInt();
        return parametro01 * parametro02;
    }
}
