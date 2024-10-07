package Aula04.Exercicios;

import javax.swing.*;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("digite sua idade: ");

        int idade = scanner.nextInt();
        if (idade >= 18) {
            System.out.println("autorizado");
        } else {
            System.out.println("não autorizado");
        }

        scanner.close();
    }
}

