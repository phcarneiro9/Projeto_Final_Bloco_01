package projeto_final_bloco_01.controller;

import java.util.ArrayList;

import projeto_final_bloco_01.model.Produto;
import projeto_final_bloco_01.repository.ProdutoRepository;

public class ProdutoController implements ProdutoRepository {

	private ArrayList<Produto> listaProdutos = new ArrayList<>();

	private int proximoId = 1;

	private final String VERDE = "\u001B[32m";
	private final String VERMELHO = "\u001B[31m";
	private final String RESET = "\u001B[0m";

	public int gerarId() {
		return proximoId++;
	}

	public void valorTotalEstoque() {

		if (listaProdutos.isEmpty()) {
			System.out.println(VERMELHO + "\n❌ Nenhum produto cadastrado!" + RESET);
			return;
		}

		double total = 0;

		for (Produto produto : listaProdutos) {
			total += produto.getPreco() * produto.getQuantidade();
		}

		System.out.printf(VERDE + "\n✅ Valor total do estoque: R$ %.2f%n" + RESET, total);

	}

	@Override
	public void listarTodos() {

		if (listaProdutos.isEmpty()) {
			System.out.println(VERMELHO + "\n❌ Nenhum produto cadastrado!" + RESET);
			return;
		}

		System.out.println(VERDE + "\n✅ Produtos cadastrados:\n" + RESET);

		for (Produto produto : listaProdutos) {
			produto.visualizar();
		}

	}

	@Override
	public void buscarPorId(int id) {

		for (Produto produto : listaProdutos) {

			if (produto.getId() == id) {

				System.out.println(VERDE + "\n✅ Produto encontrado!\n" + RESET);
				produto.visualizar();
				return;

			}

		}

		System.out.println(VERMELHO + "\n❌ Produto não encontrado!" + RESET);

	}

	@Override
	public void cadastrar(Produto produto) {

		listaProdutos.add(produto);
		System.out.println(VERDE + "\n✅ Produto cadastrado com sucesso!" + RESET);

	}

	@Override
	public void atualizar(Produto produto) {

		for (int i = 0; i < listaProdutos.size(); i++) {

			if (listaProdutos.get(i).getId() == produto.getId()) {

				listaProdutos.set(i, produto);
				System.out.println(VERDE + "\n✅ Produto atualizado com sucesso!" + RESET);
				return;

			}

		}

		System.out.println(VERMELHO + "\n❌ Produto não encontrado!" + RESET);

	}

	@Override
	public void deletar(int id) {

		for (Produto produto : listaProdutos) {

			if (produto.getId() == id) {

				listaProdutos.remove(produto);
				System.out.println(VERDE + "\n✅ Produto removido com sucesso!" + RESET);
				return;

			}

		}

		System.out.println(VERMELHO + "\n❌ Produto não encontrado!" + RESET);

	}

}