package ControlFlow;

import java.util.Scanner;

public class exercicio5 {
	public static void main(String args[]) {
		int  quantidade,codigo;
		double valorTotal, preco = 0;
		String produto = null;
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("***Cardapio****");
		System.out.println("1 - Cachorro Quente  R$ 10.00");
		System.out.println("2 - X-Salada         R$ 15.00");
		System.out.println("3 - X-Bacon          R$ 18.00");
		System.out.println("4 - Bauru            R$ 12.00");
		System.out.println("5 - Refrigerante     R$  8.00");
		System.out.println("6 - Suco de laranja  R$ 13.00");
		System.out.println("\nDigite o numero do item que você deseja: ");
	
		codigo = leitor.nextInt();
		
		switch(codigo) {
		 case 1: 
			 produto = "Cachorro quente";
			 preco =  10.00;
			 break;
		 case 2: 
			 produto = "X-Salada ";
			 preco = 15.00;
			 break;
		 case 3:
			 produto = "X-Bacon";
			 preco = 18.00;
			 break;
		 case 4:
			 produto = "Bauru";
			 preco = 12.00;
			 break;
		 case 5:
			 produto = "Refrigerante";
			 preco = 8.00;
			 break;
		 case 6: 
			 produto = "Suco de Laranja";
			 preco = 13.00;
			 break;
		default:
			System.out.println("Opção inválida!");
			break;
			
		
			 
		}
		System.out.println("Digite a quantidade do produto que você deseja: ");
		quantidade = leitor.nextInt();
		valorTotal = quantidade * preco;
		System.out.printf("O produto escolhido foi "+ produto + " valor total e de:  " + valorTotal);
		
	}
}
