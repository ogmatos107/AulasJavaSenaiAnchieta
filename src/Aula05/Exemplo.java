package Aula05;

import java.util.Scanner;

public class Exemplo {
    public static void main(String[] args) {

        int idade=15;

        while (idade<18){
            System.out.println(idade);
            idade++;
        }
        /*espaço*/
        System.out.println("\n");
        /*espaço*/
        int contador=20;

        do {
            System.out.println(contador);
            contador--;
        }  while (contador>10);
        /*espaço*/
        System.out.println("\n");
        /*espaço*/
        for (int i=1; i<10;i++){
            System.out.println(i);
        }
        /*espaço*/
        System.out.println("\n");
        /*espaço*/
        for (int i=1; i<10;i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }
        /*espaço*/
        System.out.println("\n");
        /*espaço*/
        for (int i=1; i<10;i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }
        /*espaço*/
        System.out.println("\n");
        /*espaço*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();
        String pedro= "pedro";

        /*while (nome.equals("pedro")) {
            System.out.println("nome bonito");
            break;
        }*/

        while (nome.equals(pedro)) {
            if (nome.equals("pedro")) {
                System.out.println("nome pedro");
            }
            else {
                System.out.println("nome errado");
            }
            break;

        }
    }
}
