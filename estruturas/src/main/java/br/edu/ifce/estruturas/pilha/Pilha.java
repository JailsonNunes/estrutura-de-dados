package br.edu.ifce.estruturas.pilha;

import java.util.LinkedList;
import java.util.List;

public class Pilha<X> {
	
	List<X> elementos = new LinkedList<X>();

	public void inserir(X x) {
		this.elementos.add(x);
	}
	public X remover() {
		return this.elementos.remove(this.elementos.size()-1);
		
	}
	public boolean vazio() {
		return this.elementos.size()==0;
	}
}
