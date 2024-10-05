package Aula07.Exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        double media=calcularMedia(0,0,0,3);
        System.out.print("sua média é: "+media);
    }
    public static double calcularMedia(double parametro01,double parametro02,double parametro03, double parametro04){
        Scanner scanner=new Scanner(System.in);
        System.out.print("digite suas 3 notas: ");
        parametro01=scanner.nextDouble();
        parametro02=scanner.nextDouble();
        parametro03=scanner.nextDouble();
        return (parametro02+parametro01+parametro03)/parametro04;


    }
}
