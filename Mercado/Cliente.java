package Mercado;

public class Cliente {
	private String nome;
	private String cpf;
	
	Carrinho carrinho = new Carrinho();

	
	//Constructor
	public Cliente(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
		
	//Get+Setter para CPF
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	//Get+Setter para nome
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
 	public void getCarrinho(){
		this.carrinho.getProdutos();
	}
 	
 	public void adicionarItem(Produto produto) {
 		this.carrinho.adicionarItem(produto);
 	}
}
