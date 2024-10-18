package Aula08.Exercicios;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        try {
            FileWriter alunos = new FileWriter("C:\\Users\\Aluno\\Desktop\\AulasJavaSenaiAchieta\\src\\alunos.txt");
            Scanner scanner=new Scanner(System.in);
            System.out.println("escreva cinco nomes:");
            for (int contagem=0;contagem<5;contagem++){
                String nomes= scanner.nextLine();
                System.out.println(nomes+"\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
