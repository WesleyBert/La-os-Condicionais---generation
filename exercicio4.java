package ControlFlow;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		String palavra1, palavra2, palavra3;
		Scanner leitor = new Scanner(System.in);
		

		System.out.println("Descreva as Caracteristicas de um animal:");
		System.out.println("Digite a primeira caracteristica: ");
		palavra1 = leitor.nextLine();
		System.out.println("Digite a segunda caracteristica: ");
		palavra2 = leitor.nextLine();
		System.out.println("Digite a terceira caracteristica: ");
		palavra3 = leitor.nextLine();
		
		if(palavra1.equalsIgnoreCase("vertebrado") && palavra2.equalsIgnoreCase("ave") && palavra3.equalsIgnoreCase("carnívoro") ) {
			System.out.printf("Águia ");
		}else if(palavra1.equalsIgnoreCase("vertebrado")  && palavra2.equalsIgnoreCase("ave") && palavra3.equalsIgnoreCase("onívoro")) {
			System.out.println("Pomba");
		}
		else if(palavra1.equalsIgnoreCase("vertebrado")  && palavra2.equalsIgnoreCase("mamífero") && palavra3.equalsIgnoreCase("onívoro")) {
			System.out.println("Homem");
		}
		else if(palavra1.equalsIgnoreCase("vertebrado")  && palavra2.equalsIgnoreCase("mamífero") && palavra3.equalsIgnoreCase("herbívoro")) {
			System.out.println("Vaca");
		}
		else if(palavra1.equalsIgnoreCase("invertebrado")  && palavra2.equalsIgnoreCase("inseto") && palavra3.equalsIgnoreCase("hematófago")) {
			System.out.println("pulga");
		}
		else if(palavra1.equalsIgnoreCase("invertebrado")  && palavra2.equalsIgnoreCase("inseto") && palavra3.equalsIgnoreCase("herbívero")) {
			System.out.println("Lagarta");
		}
		else if(palavra1.equalsIgnoreCase("invertebrado")  && palavra2.equalsIgnoreCase("anelídeo") && palavra3.equalsIgnoreCase("hematófago")) {
			System.out.println("Sanguessuga");
		}
		else if(palavra1.equalsIgnoreCase("invertebrado")  && palavra2.equalsIgnoreCase("anelídeo") && palavra3.equalsIgnoreCase("onívoro")) {
			System.out.println("Minhoca");
		}
	else {
			System.out.println("Caracteristicas não identificada!");
		}
	}

}
