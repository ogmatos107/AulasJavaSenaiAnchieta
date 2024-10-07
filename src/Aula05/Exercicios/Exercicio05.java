package Aula05.Exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float soma = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.println("digite a nota " + i + ": ");
            float notas = scanner.nextFloat();
            soma += notas;
        }
        float media = soma / 5;
        System.out.println(media);


    }
}
