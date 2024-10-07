package Aula04.Exercicios;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("digite sua nota: ");

        float nota = sc.nextFloat();

        if (nota >= 7 && nota < 11) {
            System.out.println("Aprovado.");
        } else if (nota > 4 && nota < 7) {
            System.out.println("Recuperação.");
        } else if (nota >= 0 && nota <= 4) {
            System.out.println("Reprovado.");
        } else {
            System.out.println("revise sua nota...");
        }
        sc.close();

    }
}
