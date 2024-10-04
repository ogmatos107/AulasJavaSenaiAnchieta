package Aula05;

import java.util.Scanner;

public class Exemplo {
    public static void main(String[] args) {

        int idade = 15;

        while (idade < 18) {
            System.out.println(idade);
            idade++;
        }
        /*espaço*/
        System.out.println("\n");
        /*exemplo do-while*/

        int contador = 20;

        do {
            System.out.println(contador);
            contador--;
        } while (contador > 10);

        /*espaço*/
        System.out.println("\n");
        /*exemplo for*/

        for (int i = 1; i < 10; i++) {
            System.out.println(i);
        }

        /*espaço*/
        System.out.println("\n");
        /*exemplo for-break*/

        for (int i = 1; i < 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }

        /*espaço*/
        System.out.println("\n");
        /*exemplo for-continue*/

        for (int i = 1; i < 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }

        /*espaço*/
        System.out.println("\n");
        /*exemplo while nome*/

        Scanner scanner = new Scanner(System.in);
        /*System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();
        String pedro = "pedro";

        while (!nome.equals("pedro")) {
            System.out.println("nome errado, digite novamente:");
            nome = scanner.nextLine();
        }
        System.out.println("nome certo");

        /*espaço*/
        System.out.println("\n");
        /*exemplo do-while nome*/

        /*do {
            System.out.println("digite seu nome:");
            nome = scanner.nextLine();
        } while (!nome.equals(pedro));
        System.out.println("seu nome ta certo");

        /*espaço*/
        System.out.println("\n");
        /*exemplo for par ou impar*/

        /*int par = 0;
        int imp = 0;

        for (int i = 1; i < 11; i++) {
            System.out.println("digite o " + i + "° número:");
            int numero = scanner.nextInt();
            if (numero % 2 == 0) {
                par += 1;
            } else {
                imp += 1;
            }
        }
        System.out.println("voce digitou "+par+" numeros pares ");
        System.out.println("voce digitou "+imp+" numeros impares");

        /*espaço*/
        System.out.println("\n");
        /*exemplo for fatorial*/

        System.out.println("digite um numero ");
        int fatorial= scanner.nextInt();
        int numero=fatorial;

        for (int i=1;i<numero;i++){
            fatorial*=i;
        }
        System.out.println(fatorial);

    }
}