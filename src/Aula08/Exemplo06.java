package Aula08;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Exemplo06 {
    public static void main(String[] args) {
        try {
            FileWriter filewrit=new FileWriter("src\\arquivo.txt",true);
            BufferedWriter bufferedWriter=new BufferedWriter(filewrit);
            bufferedWriter.write("\nbom dia sistema");
            bufferedWriter.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
