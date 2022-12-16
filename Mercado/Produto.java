package Mercado;

public abstract class Produto implements InterfaceProduto {
	  protected String nome;
	  protected double preco;
	  protected int quantidade;
	  
	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = 1;
	}
	
	@Override
	public String getNome() {
		return this.nome;
	}
	
	@Override
	public double getPreco() {
		return this.preco;
	}
	
	@Override
	public void adicionarQtd() {
		this.quantidade = this.quantidade + 1;
	}
}