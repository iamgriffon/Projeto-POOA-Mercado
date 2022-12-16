package Mercado;

public class Supermercado {

	public static void main(String[] args) {
		
	Cliente joaozinho = new Cliente("Joaozinho", "123.456.789-01");
	Produto feijao = new Alimento("Feijão Preto", 10.00);
	
	joaozinho.carrinho.adicionarItem(feijao);
	joaozinho.getCarrinho();
	
	System.out.println("Joaozinho's CPF: "+joaozinho.getCpf());

	
	}
}
