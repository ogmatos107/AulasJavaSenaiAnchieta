package Aula06.Exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] vetor = {"pedro", "matheus", "kauan"};
        System.out.println("digite o nome que vc quer verificar: ");
        String nome = scanner.nextLine();

        if (vetor.equals(nome)) {
            System.out.println("o nome esta no vetor");
        } else {
            System.out.println("nome nao esta no vetor");
        }


    }
}
