package Aula06.Exercicios;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[][]matriz=new int[2][2];
        System.out.println("insira valores na matriz");
        int n1= scanner.nextInt();
        for (int i=0;i<n1;i++){
            for (int j=0;j<n1;j++){
                System.out.println("elemento na posição ["+i+"]["+j+"]: "+matriz[i][j]);
            }




        }

    }
}
