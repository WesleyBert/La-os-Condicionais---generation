package ControlFlow;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		String nomeDoador;
		int idade;
		boolean primeiraDoacao;
		Scanner leitor = new Scanner(System.in);
		
	System.out.println("Digite o nome do doador: ");
	nomeDoador = leitor.nextLine();
	System.out.println("Digite a idade do doador: ");
	idade = leitor.nextInt();
	System.out.println("Primeira doação de sangue? ");
	primeiraDoacao = leitor.nextBoolean();
	
	if(idade > 18 && idade < 69 ) {
	   if(idade < 60 || primeiraDoacao == false) {
		  System.out.println(nomeDoador +" está apto para doar sangue!");
	   }else{
		  System.out.println(nomeDoador +" não está apto para doar sangue!");
	   }
	}else {
		  System.out.println(nomeDoador +" não está apto para doar sangue!");
		}

	}

}
