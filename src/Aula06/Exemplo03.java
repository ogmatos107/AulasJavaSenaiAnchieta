package Aula06;

import java.util.Scanner;

public class Exemplo03 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[][] matriz={
                {1,5,8},
                {2,4,7}
        };
        for (int[] linha:matriz){
            for (int elemento:linha){
                System.out.println(elemento);
            }
        }


    }
}
