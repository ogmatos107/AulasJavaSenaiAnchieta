package Aula06.Exercicios;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        double matriz[][] = new double[2][2];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("escreva na posição  [" + i + " ][" + j + "] :" + matriz[i][j]);
                matriz[i][j] = scanner.nextDouble();

            }
        }
        System.out.println("\nMatriz preenchida");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matriz[i][j] + " ");
            }
        }
        for (int i = 0; i < 2; i++) {
            double somaLinha = 0;
            for (int j = 0; j < 2; j++) {
                somaLinha += matriz[i][j];
                System.out.println("A soma da linha " + i + " é: " + somaLinha);
            }
        }

    }
}