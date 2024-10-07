package Aula06;

import java.util.Scanner;

public class Exemplo02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[6];
        String valorVetor = "vetor {";

        for (int posicao = 0; posicao < vetor.length; posicao++) {
            System.out.println("digite valor " + (posicao) + ":");
            vetor[posicao] = scanner.nextInt();
            valorVetor += vetor[posicao];
            valorVetor += posicao < (vetor.length - 1) ? "," : "}"; //testa se é preciso colocar virgula na ultima casa
        }
        System.out.println(valorVetor);


    }
}
