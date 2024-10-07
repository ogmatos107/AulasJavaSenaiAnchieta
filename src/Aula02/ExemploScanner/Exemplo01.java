package Aula02.ExemploScanner;

import java.util.Scanner;

public class Exemplo01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("digite um número inteiro:");
        int n1 = scanner.nextInt();

        System.out.println("o número que você digitou foi " + n1 + "\n");

        System.out.println("digite seu nome: ");
        scanner.nextLine();
        String nome = scanner.nextLine();
        System.out.println("prazer " + nome + " boa noite.");
    }
}
