package Aula08.Exercicios;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("C:\\Users\\Aluno\\Documents\\AulasJavaSenaiAchieta\\src\\alunos.txt");
            fileWriter.write("Pedro\nMatos\nGabriella\nFreitas\nJesus Cristp");
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    }

