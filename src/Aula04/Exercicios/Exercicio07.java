package Aula04.Exercicios;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {


        int n2=3;
        int n1=3;

        System.out.println("escolha uma opção de operação:\n ");
        System.out.println("1- soma");
        System.out.println("2- subtração");
        System.out.println("3- divisão");
        System.out.println("4- multiplicacao");


        float r;

        switch (3)
        {
            case 1:
                System.out.println((r=n1+n2));
                break;
            case 2:
                System.out.println((r=n1-n2));
                break;
            case 3:
                System.out.println((r=n1/n2));
                break;
                case 4:
                    System.out.println((r=n1*n2));
                    break;
            default:
                System.out.println("não existe essa opção");
        }

    }
}
