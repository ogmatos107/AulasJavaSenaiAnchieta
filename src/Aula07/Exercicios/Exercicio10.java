package Aula07.Exercicios;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        double IMC = calcuularIMC(0, 0, 0);
        System.out.println("seu IMC é: " + IMC);
    }

    static double calcuularIMC(double parametro01, double parametro02, double parametro03) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" digite seu peso: ");
        parametro01 = scanner.nextDouble();
        System.out.print("digite sua altura: ");
        parametro02 = scanner.nextDouble();
        parametro03 = parametro01 / (parametro02 * parametro02);
        return parametro03;
    }
}
