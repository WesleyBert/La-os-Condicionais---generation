package ControlFlow;

import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		float n1,n2, resposta = 0;
		int cod = 0;
		String op = null;
		
		
		
		System.out.println("Bem vindo a calculadora inteligente");
		System.out.println("\nDigite o primeiro numero: ");
		n1 = leitor.nextFloat();
		System.out.println("Digite o segundo numero: ");
		n2 = leitor.nextFloat();
		System.out.println("Digite qual operação você deseja fazer: ");
		cod = leitor.nextInt();
		
		switch(cod){
		case 1:
			op = "+";
			resposta =  n1 + n2 ;
			break;
		case 2:
			op = "-";
			resposta = n1 - n2;
			break;
		case 3:
			op = "*";
			resposta = n1 * n2;
			break;
		case 4:
			op = "/";
			resposta = n1 / n2;
			break;
		default:
			System.out.println("Opção inválida!");
			break;
		}

		if(cod >= 5) {
			System.out.println("Operação Invalida!");
		}else {
		System.out.println("A resposta é: " +n1+" "+ op+" "+ n2 +" :" + resposta);
		}}

}
