package Aula07.Exercicios;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        boolean verificacao = verficarPar(true, false, 0);
    }

    public static boolean verficarPar(boolean par, boolean impar, int n1) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("digite um numero inteiro positivo: ");
        n1 = scanner.nextInt();

        if (n1 % 2 == 0) {
            System.out.print(par);
        } else {
            System.out.print(impar);
        }
        return par || impar;
    }
}
