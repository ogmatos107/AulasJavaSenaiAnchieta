package Aula05.Exercicios;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("adivinhe o numero entre 1 e 100kk: ");
        int r = scanner.nextInt();
        int n1 = 44;
        int tentativas = 0;
        do {
            tentativas++;
            if (r == n1) {
                System.out.println("voce acertou");
            } else {
                System.out.println("tente novamente...");
            }
            System.out.println("tentativa " + tentativas);
            break;
        } while (r == n1);
    }
}
