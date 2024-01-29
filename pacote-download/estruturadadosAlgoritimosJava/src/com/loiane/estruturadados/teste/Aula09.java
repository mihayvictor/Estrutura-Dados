package com.loiane.estruturadados.teste;

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

		System.out.println("---Escoçha uma opção: ---");
		System.out.println("[1] Adicionar novo elemento");
		System.out.println("[2] Vizualizar o vetor");
		int n = s.nextInt();
		

		switch (n) {
			case 1:
				System.out.println("O que deseja adicionar? ");
				String novoelemento = s.next();
				vetor.adiciona(novoelemento);
				break;
			
				case 2:
				System.out.println(vetor);
				break;
		
			default:
				break;
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
