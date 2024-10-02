package Aula06;

import java.util.Scanner;

public class Exemplo {
    public static void main(String[] args) {
        /*int[]numeros=new int[5];
        numeros[0]=10;
        numeros[1]=20;
        numeros[2]=30;
        numeros[3]=40;
        numeros[4]=50;

        System.out.println("primeiro elemento "+numeros[0]+", segundo elemento "+numeros[1]+", terceiro elemento "+numeros[2]+", quarto elemento "+numeros[3]+", quinto elemento "+numeros[4]);*/

        int[][] matriz={
                {1,2,3},
                {4,5,6}
        };


        for (int i=0;i<matriz.length;i++){
        for (int j=0;j<matriz[i].length;j++){
            System.out.println("elemento na posição ["+i+"]["+j+"]: "+matriz[i][j]);
        }
        }
        /*Scanner scanner=new Scanner(System.in);
        int[]vetor=new int[2];
        System.out.print("digite a posição 0: ");
        vetor[0]=scanner.nextInt();
        System.out.print("digite a posição 1: ");
        vetor[1]=scanner.nextInt();


        System.out.println("vetor{"+vetor[0]+" e "+vetor[1]+"}");*/
    }
}
