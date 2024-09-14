package Aula04.Exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite suas horas trabalhadas: ");

        float hora = sc.nextFloat();

        if (hora>40){
            System.out.println("voce ganhou "+(hora*0.5+" Reais de hora extra."));
        }
        else {
            System.out.println("voce não ganhou horas extras.");
        }
        sc.close();
    }
}
