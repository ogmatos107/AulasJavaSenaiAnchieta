package Aula06.Exercicios;

import javax.swing.*;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[]vetor={"a","b","c","d","e","f"};

        System.out.print("informe uma letra: ");
        String caracter= scanner.nextLine();

       String aviso="nao encontrado";
       for (int i=0;i< vetor.length;i++) {
           if (vetor.equals(caracter)) {
               System.out.println("hgj");
               break;
           }
       }

    }
}
