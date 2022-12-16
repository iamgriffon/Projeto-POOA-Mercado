package Mercado;

import java.util.Scanner;

public class Supermercado {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int i = 0;
		int escolha;
			
		/*Cliente joaozinho = new Cliente("Joaozinho", "123.456.789-01");
		Produto feijao = new Alimento("Feijão Preto", 10.00);
		Produto arroz = new Alimento("Arroz", 15.00);
		Produto arroz = new Alimento("Carne", 15.00);
		
		joaozinho.adicionarItem(feijao);
		joaozinho.adicionarItem(arroz);
		
		joaozinho.getCarrinho();
		
		System.out.println("Joaozinho's CPF: "+joaozinho.getCpf());*/
		
		
		while(i == 0) {
			System.out.println("Bem vindo ao Mercadinho!!\nO que deseja fazer?");
			System.out.println("\n1- Cadastrar Produto\n2- Cadastrar Cliente\n3- Ver Carrinho\n4- Sair");
			escolha = sc.nextInt();
			
			switch(escolha) {
				case 1:		
				String item;
				double valor;
				
				System.out.println("Informe o nome do produto:");
				item = sc.next();
				//item = produto;
				
				System.out.println("\nInforme o valor do produto:");
				valor = sc.nextDouble();
				
				item  = new Alimento(item, valor).nome;
				
				System.out.println("\nDeseja sair? 1-Sim | 0-Não");
				i = sc.nextInt();
				
				break;
				
			}
		}
	}
}
