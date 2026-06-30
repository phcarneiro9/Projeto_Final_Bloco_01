package projeto_final_bloco_01;

import java.util.Scanner;

import projeto_final_bloco_01.controller.ProdutoController;
import projeto_final_bloco_01.model.Eletronico;

public class Menu {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		ProdutoController produtos = new ProdutoController();

		int opcao;
		int id;
		String nome;
		double preco;
		int quantidade;
		String marca;

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
				produtos.listarTodos();
				keyPress();
				break;

			case 2:
				System.out.print("Digite o ID do produto: ");
				id = leia.nextInt();

				produtos.buscarPorId(id);
				keyPress();
				break;

			case 3:
				System.out.print("ID: ");
				id = leia.nextInt();
				leia.nextLine();

				System.out.print("Nome: ");
				nome = leia.nextLine();

				System.out.print("Preço: ");
				preco = leia.nextDouble();

				System.out.print("Quantidade: ");
				quantidade = leia.nextInt();
				leia.nextLine();

				System.out.print("Marca: ");
				marca = leia.nextLine();

				produtos.cadastrar(new Eletronico(id, nome, preco, quantidade, marca));

				keyPress();
				break;

			case 4:
				System.out.print("ID: ");
				id = leia.nextInt();
				leia.nextLine();

				System.out.print("Novo Nome: ");
				nome = leia.nextLine();

				System.out.print("Novo Preço: ");
				preco = leia.nextDouble();

				System.out.print("Nova Quantidade: ");
				quantidade = leia.nextInt();
				leia.nextLine();

				System.out.print("Marca: ");
				marca = leia.nextLine();

				produtos.atualizar(new Eletronico(id, nome, preco, quantidade, marca));

				keyPress();
				break;

			case 5:
				System.out.print("Digite o ID do produto: ");
				id = leia.nextInt();

				produtos.deletar(id);

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