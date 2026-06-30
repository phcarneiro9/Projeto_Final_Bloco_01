package projeto_final_bloco_01;

import java.util.Scanner;

import projeto_final_bloco_01.controller.ProdutoController;
import projeto_final_bloco_01.model.Eletronico;

public class Menu {

	public static void main(String[] args) {

		final String AZUL = "\u001B[34m";
		final String VERDE = "\u001B[32m";
		final String VERMELHO = "\u001B[31m";
		final String RESET = "\u001B[0m";

		Scanner leia = new Scanner(System.in);
		ProdutoController produtos = new ProdutoController();

		int opcao;
		int id;
		String nome;
		double preco;
		int quantidade;
		String marca;

		do {

			System.out.println(AZUL + "\n=================================================" + RESET);
			System.out.println(AZUL + "              SISTEMA DE PRODUTOS" + RESET);
			System.out.println(AZUL + "=================================================" + RESET);
			System.out.println(AZUL + "1 - Listar todos os Produtos" + RESET);
			System.out.println(AZUL + "2 - Buscar Produto por ID" + RESET);
			System.out.println(AZUL + "3 - Cadastrar Produto" + RESET);
			System.out.println(AZUL + "4 - Atualizar Produto" + RESET);
			System.out.println(AZUL + "5 - Deletar Produto" + RESET);
			System.out.println(AZUL + "6 - Sobre" + RESET);
			System.out.println(AZUL + "7 - Valor total do estoque" + RESET);
			System.out.println(AZUL + "0 - Sair" + RESET);
			System.out.println(AZUL + "=================================================" + RESET);
			System.out.print(AZUL + "Escolha uma opção: " + RESET);

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

				id = produtos.gerarId();

				System.out.println(VERDE + "\n✅ ID gerado automaticamente: " + id + RESET);

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

				System.out.print("Digite o ID do produto: ");
				id = leia.nextInt();
				leia.nextLine();

				System.out.print("Novo nome: ");
				nome = leia.nextLine();

				System.out.print("Novo preço: ");
				preco = leia.nextDouble();

				System.out.print("Nova quantidade: ");
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

			case 7:

				produtos.valorTotalEstoque();

				keyPress();
				break;

			case 0:

				System.out.println(VERMELHO + "\nSistema encerrado!" + RESET);
				break;

			default:

				System.out.println(VERMELHO + "\n❌ Opção inválida!" + RESET);
				keyPress();

			}

		} while (opcao != 0);

		leia.close();

	}

	public static void sobre() {

		final String AZUL = "\u001B[34m";
		final String RESET = "\u001B[0m";

		System.out.println(AZUL + "\n=================================================" + RESET);
		System.out.println(AZUL + "             PROJETO FINAL - BLOCO 01" + RESET);
		System.out.println(AZUL + "=================================================" + RESET);
		System.out.println(AZUL + "Desenvolvido por Patrick Carneiro" + RESET);
		System.out.println(AZUL + "GitHub: https://github.com/phcarneiro9" + RESET);
		System.out.println(AZUL + "Sistema de Gerenciamento de Produtos" + RESET);
		System.out.println(AZUL + "=================================================" + RESET);

	}

	public static void keyPress() {

		try {

			System.out.println("\nPressione ENTER para continuar...");
			System.in.read();

		} catch (Exception e) {

			System.out.println("\u001B[31mErro ao continuar.\u001B[0m");

		}

	}

}