package Aula05.Exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("digite um numero ");
        int contador= scanner.nextInt();
        int fatorial= contador;

        do {
            fatorial*=contador;
            System.out.println(fatorial);
        }while (fatorial<contador);


    }
}
