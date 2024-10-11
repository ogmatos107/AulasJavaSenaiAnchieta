package Aula08;

import java.io.FileWriter;
import java.io.IOException;

public class Exemplo03 {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter=new FileWriter("C:\\Users\\Aluno\\Desktop\\gh repo clone ogmatos107\\AulasJavaSenaiAchieta7\\src\\Aula08\\arquivo.txt",true);

            fileWriter.write("\nbom dia");
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
