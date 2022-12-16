package Mercado;

import java.util.ArrayList;

public class Carrinho {

	private ArrayList<Produto> produtos = new ArrayList<Produto>();
	private double totalPreco;
	
	public int size() {
		return this.produtos.size();
	};
	
	//Teste
	public Carrinho() {
		Produto teste = new Alimento("Teste", 0.99);
		this.adicionarItem(teste);
	}
	
	public void adicionarItem(Produto produto) {
		if (this.produtos.contains(produto)) {
			int index = this.produtos.indexOf(produto);
			this.produtos.set(index, produto).adicionarQtd();
		} else {
			this.produtos.add(produto);
		}
	}
	
	public void esvaziarCarrinho() {
		try {
			if(!this.produtos.isEmpty()) {
				this.produtos.clear();
				System.out.println("Carrinho esvaziado com sucesso");
			} else {
				System.out.println("Carrinho já está vazio");
			}
		} catch(Exception error) { System.out.println("O seguinte erro aconteceu: " + error); };
	};
	
	public double calcularPreco() {
		double accumulator = 0;
		for(Produto k : this.produtos) {
			
			accumulator = accumulator + (k.preco * k.quantidade);
		}
		return this.totalPreco = accumulator;
	}
	
	public void getProdutos() {
		for(Produto k : this.produtos) {
			System.out.println("Nome do Item: " + k.nome + "\n Quantidade: " + k.quantidade);
		}
		System.out.println("\n Total do Carrinho: R$"+ this.calcularPreco());
	}
	
}