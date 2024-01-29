package com.loiane.estruturadados.teste;

import com.loiane.estruturadados.vetor.Vetor;

public class Aula07 {

	public static void main(String[] args) throws IllegalAccessException {
	  
		Vetor vetor = new Vetor(10);

		vetor.adiciona("B");
		vetor.adiciona("C");
		vetor.adiciona("E");
		vetor.adiciona("F");
		vetor.adiciona("G");
		
		System.out.println(vetor);
		
		vetor.adiciona(0, "A");
		vetor.adiciona(3, "D");
		
		System.out.println(vetor);
		
	}

}
