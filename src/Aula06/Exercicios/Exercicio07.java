package Aula06.Exercicios;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;
        int[][] matriz = new int[3][3];
        System.out.println("insira valores na matriz");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("escreva na posição [" + i + "][" + j + "]: " + matriz[i][j]);
                matriz[i][j] = scanner.nextInt();
                soma += matriz[i][j];
            }
        }
        System.out.println("\nMatriz preenchida:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
        }
        System.out.println("a soma dos numeros na matriz é: " + soma);
    }
}