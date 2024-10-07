package Aula08;

import java.io.File;

public class Exemplo01 {
    public static void main(String[] args) {
        File arquivo=new File("C:\\Users\\Aluno\\IdeaProjects\\AulasJavaSenaiAchieta\\src\\arquivo.txt");

        if (arquivo.exists()){
            System.out.println("existe");
        }else {
            System.out.println("não existe");
        }
    }
}
