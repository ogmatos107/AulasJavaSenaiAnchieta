package Aula04.Exercicios;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite que horas são: ");

        double hora = sc.nextFloat();

        if (hora > 4 && hora < 12) {
            System.out.println("são " + hora + " da manhã");
        } else if (hora > 11 && hora < 18) {
            System.out.println("são " + hora + " da tarde");
        } else if (hora > 17 && hora <= 24) {
            System.out.println("são " + hora + " da noite");
        } else if (hora > 0 && hora < 5) {
            System.out.println("são " + hora + " da madrugada");
        } else {
            System.out.println("digite entre 1hr à 24hrs");
        }
        sc.close();
    }
}
