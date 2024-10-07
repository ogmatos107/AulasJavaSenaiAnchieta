package Aula04.Exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("digite seu código: ");

        int cod = scanner.nextInt();
        switch (cod) {
            case 1:
                System.out.println("eletrônico");
                break;
            case 2:
                System.out.println("alimentos");
                break;
            case 3:
                System.out.println("vestuários");
                break;
            default:
                System.out.println("não existe esse código");
        }
        scanner.close();

    }
}
