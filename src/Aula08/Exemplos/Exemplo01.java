package Aula08.Exemplos;

import java.io.File;
import java.io.IOException;

public class Exemplo01 {
    public static void main(String[] args) {
        File arquivo = new File("C:\\Users\\Aluno\\IdeaProjects\\AulasJavaSenaiAchieta\\src\\arquivo.txt");

        if (arquivo.exists()) {
            System.out.println("existe");
        } else {
            try {
                if (arquivo.createNewFile()) {
                    System.out.println("arquivo criado com sucesso");
                } else {
                    System.out.println("falha ao criar arquivo");
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
