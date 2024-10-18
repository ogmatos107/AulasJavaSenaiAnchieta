package Aula08.Exercicios;

import java.io.*;

public class Exercicio02 {
    public static void main(String[] args) throws IOException {
       /* File alunos = new File("src\\alunos.txt");
        try {
            if (alunos.exists()) {
                FileReader fileReader = new FileReader(alunos);
                int caracter = fileReader.read();
                while ((caracter = fileReader.read()) != -1)
                    System.out.print((char) caracter);
            } else {
                alunos.createNewFile();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }*/
        try {
            BufferedReader oi = new BufferedReader(new FileReader("src\\alunos.txt"));
            String texto;
            while ((texto = oi.readLine()) != null)
                System.out.println(texto);
        } catch (Exception e) {
            throw new RuntimeException(e);

        }
    }
}
