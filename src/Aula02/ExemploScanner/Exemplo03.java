package Aula02.ExemploScanner;
import java.util.Scanner;

public class Exemplo03 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("digite seu nome: ");
        String nome= scanner.nextLine();
        System.out.println("digite sua idade: ");
        String idade= scanner.nextLine();
        System.out.println("digite seu peso: ");
        double peso= scanner.nextDouble();

        System.out.println("nome: "+nome);
        System.out.println("idade: "+ idade);
        System.out.println("peso: "+ peso+" quilos");
    }
}
