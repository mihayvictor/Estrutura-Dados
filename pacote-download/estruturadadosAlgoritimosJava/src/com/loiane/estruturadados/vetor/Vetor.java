package com.loiane.estruturadados.vetor;

import java.util.Arrays;

public class Vetor {
	
	private String[] elementos;
	private int tamanho;
	
	/*CONSTRUTOR*/
	 
	
	public Vetor(int capacidade) {
		this.elementos = new String[capacidade];
		this.tamanho = 0;	
	} 
	
	/*NÃO É EFICIENTE, POIS PRECISA ITERAR TODO O VETOR
	public void adiciona(String elemento) {
		for (int i=0; i<this.elementos.length; i++ ) {
			if (this.elementos[i] == null) {
				this.elementos[i] = elemento;
				break;
			}
		}
	}
	
	/*public void adiciona(String elemento) throws Exception {
		if (this.tamanho < this.elementos.length){
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
		}else {
			throw new Exception("O vetor já está cheio.");
		
		}
		
		
	}*/
	
	/*ADICIONA AO FINAL*/
	public boolean adiciona(String elemento){
		this.amentaCapacidade();
		if (this.tamanho < this.elementos.length){
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		}
		System.out.println("Vetor cheio");
		return false;
	}
	
	/*ADICIONA EM QUALQUER LUGAR*/
	public boolean adiciona(int posicao, String elemento) throws IllegalAccessException {
		
		if (!(posicao >= 0 && posicao-1 < tamanho)) {
			throw new IllegalAccessException("Posicão inválida");
	}
		for(int i=this.tamanho-1; i>=posicao; i--) {
			this.elementos[i+1] = this.elementos[i];
		}
		this.elementos[posicao] = elemento;
		this.tamanho++;
		
		return true;
	}
	
	public int tamanho() {
		return this.tamanho;
	}

	@Override
	public String toString() {
		
		StringBuilder s = new StringBuilder();
		s.append("[");
		
		
		for (int  i=0; i<this.tamanho-1; i++) {
			s.append(this.elementos[i]); 
			s.append(",") ;
		}
		
		if (this.tamanho > 0) { 
			s.append(this.elementos[this.tamanho-1]) ;
		}
		
		s.append("]");
	
		
	return s.toString();	
	}
	
	
	/*public String busca(int posicão) throws IllegalAccessException {
		
		if (!(posicão >= 0 && posicão < tamanho)) {
			throw new IllegalAccessException("Posicão inválida");
	}
		
		return this.elementos[posicão];
	}*/
	
	/* public boolean busca(String elemento) {
	 * 	for(i=0; i<this.tamanho,i++){
	 * 		if (this.elementos[i].equals(elemento){
	 * 			return true
	 * 	}
	 * }
	 * return false
	 * 
	 * 
		*/
	
	public String busca(String elemento) {
		
		for(int i=0; i<this.tamanho; i++) {
			if(this.elementos[i].equals(elemento)) {
				return  ("posicao: " + i);
			}
		}
		return ("Elemento não Existe");
		
		
	}
	
	private void amentaCapacidade() {
		if (this.tamanho == this.elementos.length) {
			String[] elementosNovos = new String[this.elementos.length * 2];
			for(int i=0; i<this.elementos.length; i++) {
				elementosNovos[i] = this.elementos[i];
			
			}
			this.elementos = elementosNovos;
		}
	}
	
	public void remove(int posicao) throws IllegalAccessException {
		
		if (!(posicao >= 0 && posicao-1 < tamanho)) {
			throw new IllegalAccessException("Posicão inválida");
	}
		for(int i=posicao; i<=tamanho-1; i++) {
			this.elementos[i] = this.elementos[i+1];
		}
		this.tamanho--;
		
	}

}
