package ControlFlow;

import java.util.Scanner;

public class exercicio8 {

	public static void main(String[] args) {
		int operacao;
		float saldo= (float) 1000.00, saque, novoSaldo = 0, deposito;
		Scanner leitor = new Scanner(System.in);
		
		
		System.out.println("***Conta Bancaria****");
		System.out.println("***Seja bem vindo/a!**");
		System.out.println("Escolha uma operação!");
		System.out.println("1 - Saldo");
		System.out.println("2 - Saque");
		System.out.println("3 - Depósito");
		operacao = leitor.nextInt();
		
		
		
		switch(operacao) {
		case 1:
			saldo = (float) 1000.00;
			System.out.println("Saldo atual é de: " + saldo);
			break;
		case 2:
			System.out.println("Digite o valor que deseja Sacar: ");
			saque = leitor.nextFloat();
			if(saque > saldo) {
				System.out.println("Operação inválida, Saldo insufiente!");
				System.out.println("Saldo atual é de: "+saldo);
			}else {
				novoSaldo = saldo - saque;
				System.out.println("Saldo atual é de: " + novoSaldo);
			}
			break;
		case 3:
			System.out.println("Digite o valor do deposito: ");
			deposito = leitor.nextFloat();
			if(novoSaldo == 0) {
				saldo = saldo + deposito;
				System.out.println("Saldo atual é de: " + saldo);
			}else {
				novoSaldo = deposito + novoSaldo;
				System.out.println("Saldo atual é de: " + novoSaldo);
			}
			break;
		default:
			System.out.println("Operação invalida!");
		}
		
	}

}
