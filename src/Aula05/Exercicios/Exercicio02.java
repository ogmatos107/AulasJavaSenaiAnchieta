package Aula05.Exercicios;
public class Exercicio02 {
    public static void main(String[] args) {

        int somaPares = 0;
        int numero = 1;
        while (numero <= 100) {

            if (numero % 2 == 0) {
                somaPares += numero;
            }
            numero++;
        }
        System.out.println("A soma dos números pares de 1 a 100 é: " + somaPares);
    }
}
