package Mercado;

public class Cliente {
	private String nome;
	private String cpf;
	Carrinho carrinho;

	
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
	
 	public Carrinho getCarrinho(){
		return this.carrinho;	
	}
}
