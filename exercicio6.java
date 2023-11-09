package ControlFlow;

import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		String nome, cargo;
		int codigoColaborador;
		double salario, reajuste = 0, novoSalario;
		Scanner leitor = new Scanner(System.in);
		
		
		System.out.println("Digite o nome do Colaborador: ");
		nome = leitor.nextLine();
		System.out.println("Digite o numero do Colaborador: ");
		codigoColaborador = leitor.nextInt();
		System.out.println("Digite o Salario do Colaborador: ");
		salario = leitor.nextFloat();

		switch(codigoColaborador){
		case 1:
			cargo = "Gerente";
			reajuste = 0.10;
			break;
		case 2: 
			cargo = "Vendedor";
			reajuste = 0.07;
			break;
		case 3:
			cargo = "Supervisor";
			reajuste = 0.09;
			break;
		case 4:
			cargo = "Motorista";
			reajuste = 0.06;
		case 5:
			cargo = "Estoquista";
			reajuste = 0.05;
			break;
		case 6: 
			cargo = "Técnico de TI";
			reajuste = 0.08;
			break;
		default:
			System.out.println("Inforação incorreta! tente novamente!");
		}
		
		novoSalario = salario + (reajuste * salario);
		System.out.println("O novo Salario com o reajuste ficou " + novoSalario);
	}

}
