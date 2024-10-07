package Aula04.Exercicios;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a nota de avaliação de 1 à 5: ");

        int nota = sc.nextInt();

        switch (nota) {
            case 1:
                System.out.println("Precisa melhorar");
                break;
            case 2:
                System.out.println("Abaixo da média");
                break;
            case 3:
                System.out.println("Média");
                break;
            case 4:
                System.out.println("Acima da média");
                break;
            case 5:
                System.out.println("Execelente");
                break;
            default:
                System.out.println("digite entre 1 e 5.");
        }
        sc.close();
    }
}
