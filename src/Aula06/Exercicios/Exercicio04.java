package Aula06.Exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] vetor = new double[4];
        double r;
        for (int i = 0; i < 4; i++) {
            System.out.print("digite a nota" + i + " :");
            vetor[i] = scanner.nextInt();
        }
        r = vetor[0] + vetor[1] + vetor[2] + vetor[3];
        r = r / 4;
        System.out.println(r);
    }
}
