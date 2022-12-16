package Mercado;

public abstract class Produto {
	  protected String nome;
	  protected double preco;
	  protected int quantidade;
	  
	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = 1;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public double getPreco() {
		return this.preco;
	}
	
	public void adicionarQtd() {
		this.quantidade = this.quantidade + 1;
	}
}