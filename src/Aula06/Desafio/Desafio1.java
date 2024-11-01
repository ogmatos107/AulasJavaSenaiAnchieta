package Aula06.Desafio;

import java.util.Scanner;

public class Desafio1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de pessoas à serem cadastradas: ");
        int quantidade = scanner.nextInt();
        scanner.nextLine();

        String[] cabecalho = {"id", "nome", "telefone", "email"};
        String[][] cadastro = new String[quantidade + 1][4];
       /* cadastro[0][0]= "Id";
        cadastro[0][1]= "Nome";
        cadastro[0][2]= "Telefone";
        cadastro[0][3]= "Email";*/
        cadastro[0] = cabecalho;

        System.out.println("preencha os dados a seguir: ");

        for (int linhas = 1; linhas < cadastro.length; linhas++) {
            for (int colunas = 0; colunas < cabecalho.length; colunas++) {
                System.out.print(cabecalho[colunas] + ": ");
                cadastro[linhas][colunas] = scanner.nextLine();
            }
        }
        String tabela = "";
        for (int linhas = 0; linhas < cadastro.length; linhas++) {
            for (int colunas = 0; colunas < cabecalho.length; colunas++) {
                tabela += cadastro[linhas][colunas];
                tabela += colunas == 0 ? "\t" : "\t\t\t";
            }
            tabela += "\n";
        }
        System.out.println(tabela);
    }
}