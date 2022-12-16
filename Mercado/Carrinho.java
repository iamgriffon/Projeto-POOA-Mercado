package Mercado;

import java.util.ArrayList;

public class Carrinho {

	ArrayList<Produto> produtos;
	
	public ArrayList<Produto> getProdutos() {
		System.out.println(produtos);
		return produtos;
	}
	
	public void adicionarItem(Produto produto) {
		if (this.produtos.contains(produto)) {
			int index = this.produtos.indexOf(produto);
			this.produtos.set(index, produto).adicionarQtd();
			System.out.println("Adicionado com sucesso");
		} else {
			this.produtos.add(produto);
			System.out.println("Adicionado com sucesso");
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
	
	Produto feijao = new Alimento("Feijão Preto", 10.00);
	
	this.adicionarItem(feijao);
	
}