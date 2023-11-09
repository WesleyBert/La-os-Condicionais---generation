package ControlFlow;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		int numero;
		Scanner leitor =  new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		numero = leitor.nextInt();
		
		if(numero % 2 == 0) {
			if(numero >= 0) {
				System.out.println("O numero " + numero + " e par e possitivo! ");
			}
			else {
				System.out.println("O numero "+ numero + " e par e negativo");;
			}
		}else if(numero % 2 == 1) {
			if(numero < 0) {
				System.out.println("O numero " + numero + " e impar e negativo! ");
		} else {
			System.out.println("O numero " + numero + " e par e negativo" );
		}
		}

	}

}
