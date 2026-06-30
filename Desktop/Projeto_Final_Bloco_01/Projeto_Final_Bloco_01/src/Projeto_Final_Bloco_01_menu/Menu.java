package Projeto_Final_Bloco_01_menu;
import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int opcao;

        while (true) {

            System.out.println("====================================");
            System.out.println("     SISTEMA DE PRODUTOS");
            System.out.println("====================================");
            System.out.println("1 - Listar todos os Produtos");
            System.out.println("2 - Buscar Produto por ID");
            System.out.println("3 - Cadastrar Produto");
            System.out.println("4 - Atualizar Produto");
            System.out.println("5 - Deletar Produto");
            System.out.println("6 - Sair");
            System.out.println("====================================");
            System.out.print("Escolha uma opção: ");

            opcao = leia.nextInt();

            switch (opcao) {

            case 1:
                System.out.println("\nListar todos os produtos.\n");
                break;

            case 2:
                System.out.println("\nBuscar produto por ID.\n");
                break;

            case 3:
                System.out.println("\nCadastrar produto.\n");
                break;

            case 4:
                System.out.println("\nAtualizar produto.\n");
                break;

            case 5:
                System.out.println("\nDeletar produto.\n");
                break;

            case 6:
                System.out.println("\nSistema encerrado!");
                leia.close();
                System.exit(0);

            default:
                System.out.println("\nOpção inválida!\n");
            }

        }

    }

}