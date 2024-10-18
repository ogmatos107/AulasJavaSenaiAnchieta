package Aula08.Exemplos;

import java.io.File;
import java.io.FileReader;

public class Exemplo04 {
    public static void main(String[] args) {
        File arquivo = new File("src\\arquivo.txt");
        try {
            if (arquivo.exists()) {
                FileReader fileReader = new FileReader(arquivo);
                int caracter = fileReader.read();
                while ((caracter = fileReader.read()) != -1)
                    System.out.print((char) caracter);
            } else {
                arquivo.createNewFile();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
