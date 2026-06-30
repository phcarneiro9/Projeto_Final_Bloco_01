package projeto_final_bloco_01.controller;

import java.util.ArrayList;

import projeto_final_bloco_01.model.Produto;
import projeto_final_bloco_01.repository.ProdutoRepository;

public class ProdutoController implements ProdutoRepository {

	private ArrayList<Produto> listaProdutos = new ArrayList<>();

	@Override
	public void listarTodos() {

		for (Produto produto : listaProdutos) {
			produto.visualizar();
		}

	}

	@Override
	public void buscarPorId(int id) {

		for (Produto produto : listaProdutos) {

			if (produto.getId() == id) {
				produto.visualizar();
				return;
			}

		}

		System.out.println("Produto não encontrado!");

	}

	@Override
	public void cadastrar(Produto produto) {

		listaProdutos.add(produto);
		System.out.println("Produto cadastrado com sucesso!");

	}

	@Override
	public void atualizar(Produto produto) {

		for (int i = 0; i < listaProdutos.size(); i++) {

			if (listaProdutos.get(i).getId() == produto.getId()) {

				listaProdutos.set(i, produto);
				System.out.println("Produto atualizado com sucesso!");
				return;

			}

		}

		System.out.println("Produto não encontrado!");

	}

	@Override
	public void deletar(int id) {

		for (Produto produto : listaProdutos) {

			if (produto.getId() == id) {

				listaProdutos.remove(produto);
				System.out.println("Produto removido com sucesso!");
				return;

			}

		}

		System.out.println("Produto não encontrado!");

	}

}