package Aula06.Exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        boolean[] vetor=new boolean[8];
        String valorvetor= "vetor { ";
        int contador=0;

        for (int posicao=0;posicao< vetor.length;posicao++){
            System.out.printf("preenche o vetor"+posicao+":");
            vetor[posicao]=scanner.nextBoolean();
            valorvetor+=vetor[posicao];
            valorvetor+=posicao<(vetor.length-1)?",":"}";
        }
        System.out.printf(valorvetor);
    }
}
