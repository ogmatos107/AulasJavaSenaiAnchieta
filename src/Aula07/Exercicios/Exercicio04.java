package Aula07.Exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        double conversao=converterGrausCelcusParaFahrnjeit(0,1.8,32);
        System.out.print("o grau em fahrnheit é: "+conversao);
    }
    public static double converterGrausCelcusParaFahrnjeit(double parametro01,double parametro02,double parametro03){
        Scanner scanner=new Scanner(System.in);
        System.out.print("digite o Grau em celsius: ");
        parametro01=scanner.nextFloat();
        return parametro01*parametro02+parametro03;
    }

}
