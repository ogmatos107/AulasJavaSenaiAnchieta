package Aula06.Exercicios;

import javax.swing.*;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] vetor = {"a", "b", "c", "d", "e", "f"};

        System.out.print("informe uma letra: ");
        String caracter = scanner.nextLine();

        for (int i = 0; i < vetor.length; i++) {
            if (caracter.equals(vetor)) {
                System.out.println("letra esta no vetor");
                break;
            } else {
                System.out.println("letra nao esta no vetor");
                break;
            }

        }
    }
}
