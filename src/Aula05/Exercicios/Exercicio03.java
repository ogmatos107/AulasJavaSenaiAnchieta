package Aula05.Exercicios;

import java.util.Scanner;

public class  Exercicio03 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.print("digite um numero: ");
        int n1=scanner.nextInt();
        int fatorial=1;
        int contador=1;
        do {
            fatorial*=contador;
            contador++;
        }while (contador<=n1);
        System.out.println(fatorial);

        }

    }

