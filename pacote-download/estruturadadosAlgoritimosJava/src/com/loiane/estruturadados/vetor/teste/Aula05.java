package com.loiane.estruturadados.vetor.teste;

import com.loiane.estruturadados.vetor.Vetor;

public class Aula05 {

	public static void main(String[] args) throws IllegalAccessException {
		Vetor vetor = new Vetor(10);
		
		vetor.adiciona("elemento1");
		vetor.adiciona("elemento2");
		vetor.adiciona("elemento3");
		
		System.out.println(vetor.busca(3));
		
		
		

	}

}
