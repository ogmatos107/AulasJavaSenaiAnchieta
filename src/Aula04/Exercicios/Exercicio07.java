package Aula04.Exercicios;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        float num = sc.nextInt();
        System.out.println("Digite outro numero: ");
        float num2 = sc.nextInt();

        System.out.println("escolha uma opção de operação abaixo:\n ");
        System.out.println("1- soma");
        System.out.println("2- subtração");
        System.out.println("3- divisão");
        System.out.println("4- multiplicacao");

        int op = sc.nextInt();

        float r;

        switch (op) {
            case 1:
                System.out.println((r = num + num2));
                break;
            case 2:
                System.out.println((r = num - num2));
                break;
            case 3:
                System.out.println((r = num / num2));
                break;
            case 4:
                System.out.println((r = num * num2));
                break;
            default:
                System.out.println("não existe essa opção");
        }
        sc.close();
    }
}
