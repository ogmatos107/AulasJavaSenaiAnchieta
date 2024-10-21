package Aula06.Desafio;

import java.util.Scanner;

public class Desafio01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de pessoas à serem cadastradas: ");
        int quantidade = scanner.nextInt();
        scanner.nextInt();
        /*String[]cabecalho = {"id","nome","telefone","email"};*/
        String[][] cadastro = new String[quantidade + 1][4];
        cadastro[0][0] = "Id";
        cadastro[0][1] = "Nome";
        cadastro[0][2] = "Telefone";
        cadastro[0][3] = "Email";
        /*cadastro[0]=cabecalho;*/

        System.out.println("preencha os dados a seguir: ");

        for (int linha = 0; linha < cadastro.length; linha++) {
            System.out.print("ID - ");
            cadastro[linha][0] = scanner.nextLine();
            System.out.print("Nome - ");
            cadastro[linha][1] = scanner.nextLine();
            System.out.print("Telefone - ");
            cadastro[linha][2] = scanner.nextLine();
            System.out.print("Email - ");
            cadastro[linha][3] = scanner.nextLine();
        }
        for (int linhas = 0; linhas < cadastro.length; linhas++) {
            System.out.println(cadastro[linhas][0] = "\t" + cadastro[1] + "\t\t\t" + cadastro[linhas][2] + "\t\t\t" + cadastro[linhas][3]);
        }
    }
}
