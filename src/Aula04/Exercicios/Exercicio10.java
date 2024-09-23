package Aula04.Exercicios;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite quantos reais você tem: ");

        int real = sc.nextInt();

        System.out.println("insire a opção abaixo para qual moeda você quer converter.\n");
        System.out.println("1- dolár");
        System.out.println("2- euro");
        System.out.println("3- libra");
        Scanner sc2 = new Scanner(System.in);
        System.out.println("digite a opção: ");
        int op= sc2.nextInt();


        switch (op){
            case 1:
                System.out.print("o valor convertido é de "+(real/5.50+" dolares."));
                break;
            case 2:
                System.out.print("o valor convertido é de "+(real/6.10+" euros"));
                break;
            case 3:
                System.out.print("o valor convertido é de "+(real/7.25+" libras"));
        }
        sc2.close();
        sc.close();
    }
}