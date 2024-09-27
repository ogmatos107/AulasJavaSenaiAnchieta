package Aula05.Exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.print("digite um numero: ");

        int fatorial= scanner.nextInt();
        int numero=fatorial;

        do {
            fatorial*=numero;
            fatorial++;
            System.out.println(fatorial);
        }while (fatorial<numero);


    }
}
