package br.edu.ifce.estruturas.pilha;

import br.edu.ifve.estruturas.pilha.Peca;
import br.edu.ifve.estruturas.pilha.Pilha;

public class TesteInserirPeca {
	
	public static void main(String[] args) {
	
	
		Pilha p = new Pilha();
		
		Peca p1= new Peca();
		
		p.inserir(p1);
		
		System.out.println(p);
	
	}
}