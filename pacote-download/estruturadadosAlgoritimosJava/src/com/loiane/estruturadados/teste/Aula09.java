package com.loiane.estruturadados.teste;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.loiane.estruturadados.vetor.Vetor;

public class Aula09 {

	public static void main(String[] args) throws IllegalAccessException {
		int capacidade = 0;
		int opc = 0;
		
		
	

	Scanner s = new Scanner(System.in);
	System.out.println("Bem vido a classe Vetor");
	System.out.println("Qual a capacidade do vetor que você quer? ");
	capacidade = s.nextInt();	
	Vetor vetor = new Vetor(capacidade);

	System.out.println("Vetor de capacidade " + capacidade + " criado.");
	System.out.println(" ");

	
		while (true) {
		int n = 0;
			try{	
		
		
		
		System.out.println("---Escoçha uma opção: ---");
		System.out.println("[1] Adicionar novo elemento");
		System.out.println("[2] Vizualizar o vetor");
		System.out.println("[3] Remover Elemento");
		n = s.nextInt();
		
		

		switch (n) {
			case 1:
				System.out.println("O que deseja adicionar? ");
				String novoelemento = s.next();
				vetor.adiciona(novoelemento);
				break;
			
				case 2:
				System.out.println(vetor);
				break;

				case 3:
				System.out.println("Qual o índice do elemento a ser removido? ");
				int remover = s.nextInt();
				vetor.remove(remover);;
				break;
		
			default:
			System.out.println("Número Ínvalido");
				break;
		}

} catch (InputMismatchException e) {
		System.out.println("Opção Ínvalida, tente novamente.");
		
		
	}
		
		
		

		// vetor.adiciona("B");
		// vetor.adiciona("G");
		// vetor.adiciona("D");
		// vetor.adiciona("E");
		// vetor.adiciona("F");
		
		// System.out.println(vetor);
		
		// vetor.remove(1);
		
		
		// System.out.println(vetor);
		
		
		}

	}

}
