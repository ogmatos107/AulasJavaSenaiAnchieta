package Aula07;

public class Exercicio03 {
    public static void main(String[] args) {
        int soma = funcaoComParametroComRetorno(5, 5);
        System.out.println(soma);
    }

    public static int funcaoComParametroComRetorno(int parametro01, int parametro02) {
        return parametro01 + parametro02;
    }
}
