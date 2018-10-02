package br.edu.ifve.estruturas.pilha;

import java.util.List;

import java.util.LinkedList;

public class Pilha {
	
	List<Peca> pecas = new LinkedList<Peca>();
	
	public void inserir(Peca p1) {
		this.pecas.add(p1);
		
	}
	public Peca remover() {
		return this.pecas.remove(this.pecas.size()-1) ;
	}
	public boolean vazio() {
		return this.pecas.size() == 0;
	}
}
