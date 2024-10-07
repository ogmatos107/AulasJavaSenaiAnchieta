package Aula02.ExemploScanner;

import java.util.Scanner;

public class Exemplo02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("digite seu nome:");
        String nome = scanner.nextLine();

        System.out.println("olá " + nome + " bom dia.");
    }
}
