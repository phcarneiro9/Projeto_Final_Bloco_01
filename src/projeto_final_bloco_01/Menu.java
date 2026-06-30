package projeto_final_bloco_01;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int opcao;

		do {

			System.out.println("\n======================================");
			System.out.println("      SISTEMA DE PRODUTOS");
			System.out.println("======================================");
			System.out.println("1 - Listar todos os Produtos");
			System.out.println("2 - Buscar Produto por ID");
			System.out.println("3 - Cadastrar Produto");
			System.out.println("4 - Atualizar Produto");
			System.out.println("5 - Deletar Produto");
			System.out.println("6 - Sobre");
			System.out.println("0 - Sair");
			System.out.println("======================================");
			System.out.print("Escolha uma opção: ");
			opcao = leia.nextInt();

			switch (opcao) {

			case 1:
				System.out.println("\nListar todos os produtos.");
				keyPress();
				break;

			case 2:
				System.out.println("\nBuscar produto por ID.");
				keyPress();
				break;

			case 3:
				System.out.println("\nCadastrar produto.");
				keyPress();
				break;

			case 4:
				System.out.println("\nAtualizar produto.");
				keyPress();
				break;

			case 5:
				System.out.println("\nDeletar produto.");
				keyPress();
				break;

			case 6:
				sobre();
				keyPress();
				break;

			case 0:
				System.out.println("\nSistema encerrado!");
				break;

			default:
				System.out.println("\nOpção inválida!");
				keyPress();

			}

		} while (opcao != 0);

		leia.close();

	}

	public static void sobre() {

		System.out.println("\n======================================");
		System.out.println("Projeto Final - Bloco 01");
		System.out.println("Desenvolvido por Patrick Carneiro");
		System.out.println("Sistema de Gerenciamento de Produtos");
		System.out.println("======================================");

	}

	public static void keyPress() {

		try {

			System.out.println("\nPressione ENTER para continuar...");
			System.in.read();

		} catch (Exception e) {

			System.out.println("Erro ao continuar.");

		}

	}

}