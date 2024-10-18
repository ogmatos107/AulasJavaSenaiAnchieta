package Aula08.Exemplos;

import java.io.FileWriter;
import java.io.IOException;

public class Exemplo02 {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("C:\\Users\\Aluno\\Desktop\\gh repo clone ogmatos107\\AulasJavaSenaiAchieta7\\src\\arquivo.txt", true);

            fileWriter.write("\noioiio baka");
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
