package Aula07.Exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        double conversao = converterGrausCelcusParaFahrnjeit(0);
        System.out.print("o grau em fahrnheit é: " + conversao);
    }

    public static double converterGrausCelcusParaFahrnjeit(double graus) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("digite o Grau em celsius: ");
        graus = scanner.nextFloat();
        return graus * 1.8 + 32;
    }

}
