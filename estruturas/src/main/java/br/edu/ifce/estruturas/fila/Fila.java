package br.edu.ifce.estruturas.fila;

import java.util.LinkedList;
import java.util.List;

public class Fila<J> {
	
	List<J> elementos = new LinkedList<J>();
	private int totalDeElementos;
	
	public void adiciona(J x) {
		 this.elementos.add(x);
	}
	public J remover() {
		return ((LinkedList<J>) this.elementos).removeFirst();
		
	}
	public boolean vazio() {
		return this.elementos.size()==0;
	}

	
}
