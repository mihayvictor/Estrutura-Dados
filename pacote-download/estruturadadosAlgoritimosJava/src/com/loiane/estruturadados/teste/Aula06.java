package com.loiane.estruturadados.teste;

import com.loiane.estruturadados.vetor.Vetor;

public class Aula06 {

	public static void main(String[] args) {
Vetor vetor = new Vetor(10);
		
		vetor.adiciona("elemento1");
		vetor.adiciona("elemento2");
		vetor.adiciona("elemento3");
		
		System.out.println(vetor.busca("elemento10"));
		System.out.println(vetor.tamanho());
		System.out.println(vetor);

	}

}
