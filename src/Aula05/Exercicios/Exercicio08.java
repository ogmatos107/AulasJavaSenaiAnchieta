package Aula05.Exercicios;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int par=0;
        int impar=0;
        for (int contador=1;contador<=10;contador++){
            System.out.print("digite "+contador+" numeros inteiros: ");
            int n1=scanner.nextInt();
            if (n1 %2==0){
           par++;
        }else {
                impar++;
            }
            System.out.println("numero par: "+par);
            System.out.println("numero impar: "+impar);
    }
}
    }
