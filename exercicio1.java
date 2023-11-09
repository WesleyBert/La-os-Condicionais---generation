package ControlFlow;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		int A, B, C;
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o Valor de A: ");
		A = leitor.nextInt();
		System.out.println("Digite o Valor de B: ");
		B = leitor.nextInt();
		System.out.println("Digite o Valor de C: ");
		C = leitor.nextInt();
		
		if(A + B > C) {
			System.out.println("A Soma de A + B é Maior do que C\r\n"
					+ "");
		}else if(A + B < C){
			System.out.println("A Soma de A + B é Menor do que C\r\n"
					+ "");
		}else {
			System.out.println("A Soma de A + B é Igual a C");
		}

	}

}
