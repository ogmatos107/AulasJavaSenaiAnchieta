package Aula05.Exercicios;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int par=0;
        int impar=0;
        for (int contador=0;contador<=100;contador++)
            System.out.println("digite 100 numeros, numero "+contador+" :");
        int n1=scanner.nextInt();
            if (n1 %2==0){
                par++;
            }else {
                impar++;
            }
            if (n1>100)
            {
                System.out.println("numero muito grande, leitura interrompida");
            }
            if (n1<0) {
            }
        System.out.println("par " +par);
        System.out.println("impar "+impar);
    }
}
