package Aula08;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exemplo07 {
    public static void main(String[] args) {
        try {
            BufferedReader  oi=new BufferedReader(new FileReader("src\\Aula08\\arquivo.txt"));
            String texto;
            while ((texto=oi.readLine())!=null)
             System.out.println(texto);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
