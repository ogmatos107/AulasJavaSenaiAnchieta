package Aula07.Desafio;

import java.util.Scanner;

public class Desafio03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] cabecalho = {"id", "nome", "telefone", "email"};
        String[][] cadastro = (null);
        int opcao;


        System.out.println("Escolha uma opção: ");
        System.out.println("1- Cadastrar um usuário");
        System.out.println("2- Exibir um cadastro");
        System.out.println("3- Atualizar um usuário");
        System.out.println("4- Deletar um usuário");
        System.out.println("5- Sair");
        System.out.println("Digite aqui");

        opcao = scanner.nextInt();
        scanner.nextLine();

        cadastro = cadastrarUsuario(cabecalho);
        exibirCadastro(cadastro, cabecalho);
    }

    private static String[][] cadastrarUsuario(String[] ocabecalho) {
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
        return cadastro;
    }

    private static void exibirCadastro(String[][] cadastro, String[] cabecalho) {
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