package Aula08.Exemplos;

public class Exemplo08 {
    public static void main(String[] args) {
        String linha = " ID:1;nome:Pedro;idade:18";
        String[] token = linha.split(";"); //split quebra a linha ":" ou ":"

        for (String tokens : token) {
            System.out.println(tokens);
        }
        String[] ID = token[0].split(":");
        String[] nome = token[1].split(":");
        String[] idade = token[2].split(":");
        System.out.println("\n" + ID[1] + "," + nome[1] + "," + idade[1] + "\n");

        int numero = Integer.parseInt(idade[1]); // converte a String em INT
        System.out.println(numero + 5);

    }
}
