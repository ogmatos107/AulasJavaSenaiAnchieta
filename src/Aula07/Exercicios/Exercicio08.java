package Aula07.Exercicios;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        int fatorial = calcularFatorial(0, 1, 1);
        System.out.println("o fatorial é: " + fatorial);
    }

    static int calcularFatorial(int parametro01, int parametro02, int parametro03) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("esreva um número inteiro positivo: ");
        parametro01 = scanner.nextInt();
        do {
            parametro02 *= parametro03;
            parametro03++;
        } while (parametro03 <= parametro01);
        return parametro02;
    }
}
