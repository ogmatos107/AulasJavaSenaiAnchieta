package Aula08;

import java.io.*;

public class Exemplo05 {
    public static void main(String[] args) {
        try {
            FileWriter filewrit=new FileWriter("src\\arquivo.txt");
            BufferedWriter bufferedWriter=new BufferedWriter(filewrit);
            bufferedWriter.write("\nbom dia sistema");
            bufferedWriter.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
