package Aula05.Exercicios;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("digite uma nota de 0 à 10: ");
        int nota = scanner.nextInt();
        int contador = 0;
        do {
            if (nota > 10 && nota < 0) {
                System.out.println("nao esta dentro do intervalo");
            } else {
                System.out.println("esta dentro do intervalo, digite novamente.");
            }
            break;
        } while (contador <= 10);
    }
}
