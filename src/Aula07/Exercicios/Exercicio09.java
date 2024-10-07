package Aula07.Exercicios;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        int calcular = calcularExpoente(0, 0);
        System.out.print(" o resultado é: " + calcular);
    }

    static int calcularExpoente(int parametro01, int parametro02) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("digite a base: ");
        parametro01 = scanner.nextInt();
        System.out.print("digite o expoente: ");
        parametro02 = scanner.nextInt();
        for (int i = 1; i < parametro02; i++) {
            parametro01 *= parametro02;
        }
        return parametro01;
    }
}
