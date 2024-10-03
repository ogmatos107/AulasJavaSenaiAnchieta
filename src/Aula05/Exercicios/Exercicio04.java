package Aula05.Exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("digite um número inteiro: ");
        int n1 = scanner.nextInt();
        boolean fake = false;
        boolean vdd = true;
        for (int contador = 1; contador < n1; contador++) {
            if (n1==2) {
                System.out.println(vdd);
            } else if (n1 % 2 == 0)
                System.out.println(fake);
            else {
                System.out.println(vdd);
            }break;
        }

    }
}
