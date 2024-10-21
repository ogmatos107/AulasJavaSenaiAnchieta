package Aula06.Exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] vetor = {"pedro", "matheus", "kauan"};

        System.out.println("digite o nome que vc quer verificar: ");
        String verificar = scanner.nextLine();

        boolean ta = true;
        boolean naota = false;


        if (vetor.equals(verificar)) {
            System.out.println(naota);
        } else {
            System.out.println(ta);
        }


    }
}
