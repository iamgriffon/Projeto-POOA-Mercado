package Mercado;

public class Alimento extends Produto {

	public Alimento(String nome, double preco) {
		super(nome, preco);
		this.nome = nome;
		this.preco = preco;
		this.quantidade = 1;
	}

}
