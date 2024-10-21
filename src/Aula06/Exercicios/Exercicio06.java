package Aula06.Exercicios;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[2][2];

        System.out.println("insira valores na matriz");


        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("escreva na posição [" + i + "][" + j + "]: " + matriz[i][j]);
                matriz[i][j] = scanner.nextInt();
            }
        }
        System.out.println("\nMatriz preenchida:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
