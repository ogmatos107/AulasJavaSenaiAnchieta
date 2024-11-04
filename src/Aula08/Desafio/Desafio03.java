package Aula08.Desafio;
import java.io.*;
import java.util.Scanner;
import java.util.Arrays;

public class Desafio03 {
    public static String[][] matrizRegistrosDeAcesso;
    public static String[][] matrizCadastro;
    public static int idUsuarioRecebidoPorHTTP;
    public static boolean modoCadastrarIdAcesso;

    public static void salvaDadosNoArquivo() {
    }

    public class ControleDeAcesso01 {

        static String[][] matrizCadastro = {null};
        static String[] cabecalho = {"ID", "Nome", "Telefone", "Email"};
        static Scanner scanner = new Scanner(System.in);
        static File bancoDeDados = new File("src\\bancoDeDados.txt");

        public static void main(String[] args) {
            carregarDadosDoArquivo();
            matrizCadastro[0] = cabecalho;
            menuPrincipal();

            scanner.close();
        }

        private static void menuPrincipal() {
            int opcao;
            String menu = """
                    ______________________________________________
                    |  Escolha uma opção:                        |
                    |       1 - Para cadastrar um usuário.       |                    
                    |       2 - Para exibir o cadastro.          |
                    |       3 - Para atualizar um usuário.       |
                    |       4 - Para deletar um usuário.         |
                    |       5 - Sair.                            |
                    |____________________________________________|
                    """;
            do {
                System.out.println(menu);
                opcao = scanner.nextInt();
                scanner.nextLine();

                switch (opcao) {
                    case 1:
                        cadastrarUsuario();
                        break;
                    case 2:
                        exibirCadastro();
                        break;
                    case 3:
                        atualizarUsuario();
                        break;
                    case 4:
                        deletarUsuario();
                        break;
                    case 5:
                        System.out.println("Fim do Programa!");
                        break;
                    default:
                        System.out.println("Opção Inválida!");
                }
            } while (opcao != 5);
        }

        private static void cadastrarUsuario() {
            System.out.print("digite a quantidade de pessoas a serem cadastradas:");
            int qtdPessoas = scanner.nextInt();
            scanner.nextLine();
            String[][] novaMatriz = new String[matrizCadastro.length + qtdPessoas][matrizCadastro[0].length];

            for (int linhas = 0; linhas < matrizCadastro.length; linhas++) {
                novaMatriz[linhas] = Arrays.copyOf(matrizCadastro[linhas], matrizCadastro[linhas].length);
            }

            System.out.println("Preencha os dados a seguir: ");

            for (int linhas = matrizCadastro.length; linhas < novaMatriz.length; linhas++) {

                novaMatriz[linhas][0] = String.valueOf(linhas);
                System.out.println(novaMatriz[0][0] + " - " + linhas);

                for (int colunas = 1; colunas < matrizCadastro[0].length; colunas++) {
                    System.out.print(matrizCadastro[0][colunas] + ": ");
                    novaMatriz[linhas][colunas] = scanner.nextLine();
                }
            }
            matrizCadastro = novaMatriz;
            salvarDadosNoArquivo();
        }

        private static void exibirCadastro() {
            StringBuilder tabela = new StringBuilder();

            for (String[] usuarioLinha : matrizCadastro) {
                for (int colunas = 0; colunas < matrizCadastro[0].length; colunas++) {
                    int larguraColuna = colunas == 0 ? 6 : (colunas == 2 ? 10 : 25);
                    tabela.append(String.format("%-" + larguraColuna + "s |", usuarioLinha[colunas]));
                }
                tabela.append("\n");
            }
            System.out.println(tabela);
        }

        private static void atualizarUsuario() {
            exibirCadastro();
            System.out.print("Digite o id do usuário que deseja atualizar:");
            int idUsuario = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Atualize as informações a seguir:");
            System.out.println(matrizCadastro[0][0] + " - " + idUsuario);

            for (int colunas = 1; colunas < matrizCadastro[0].length; colunas++) {
                System.out.print(matrizCadastro[0][colunas] + ": ");
                matrizCadastro[idUsuario][colunas] = scanner.nextLine();
            }
            System.out.println("Usuário atualizado com sucesso!!");
            exibirCadastro();
            salvarDadosNoArquivo();
        }

        private static void deletarUsuario() {
            exibirCadastro();
            System.out.print("Digite o id do usuário que deseja deletar:");
            int idUsuario = scanner.nextInt();
            scanner.nextLine();

            String[][] novaMatriz = new String[matrizCadastro.length - 1][matrizCadastro[0].length];
            novaMatriz[0] = cabecalho;

            for (int linhaMatrizCadastro = 1, linhaNovaM = 1; linhaMatrizCadastro < matrizCadastro.length; linhaMatrizCadastro++) {
                if (idUsuario == linhaMatrizCadastro)
                    continue;
                novaMatriz[linhaNovaM] = matrizCadastro[linhaMatrizCadastro];
                novaMatriz[linhaNovaM][0] = String.valueOf(linhaNovaM);
                linhaNovaM++;
            }
            matrizCadastro = novaMatriz;
            salvarDadosNoArquivo();
            exibirCadastro();
        }

        private static void salvarDadosNoArquivo() {

            try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(bancoDeDados))) {
                for (String[] linhaMatriz : matrizCadastro) {
                    bufferedWriter.write(String.join(",", linhaMatriz) + "\n");
                }

            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }

        private static void carregarDadosDoArquivo() {
            if (!bancoDeDados.exists())
                return;
            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(bancoDeDados))) {

                String linha = "";
                StringBuilder dados = new StringBuilder();

                while ((linha = bufferedReader.readLine()) != null) {
                    dados.append(linha).append("\n");
                }

                String[] linhaUsuario = dados.toString().split("\n");
                int qtdColunas = linhaUsuario[0].split(",").length;

                matrizCadastro = new String[linhaUsuario.length][qtdColunas];

                for (int linhas = 0; linhas < linhaUsuario.length; linhas++) {
                    matrizCadastro[linhas] = linhaUsuario[linhas].split(",");
                }


            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}
