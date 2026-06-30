package projeto_final_bloco_01.model;

public class Eletronico extends Produto {

	private String marca;

	public Eletronico(int id, String nome, double preco, int quantidade, String marca) {
		super(id, nome, preco, quantidade);
		this.marca = marca;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public void visualizar() {

		System.out.println("\n----- Produto -----");
		System.out.println("ID: " + getId());
		System.out.println("Nome: " + getNome());
		System.out.println("Preço: " + getPreco());
		System.out.println("Quantidade: " + getQuantidade());
		System.out.println("Marca: " + marca);

	}

}