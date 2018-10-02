package br.edu.ifce.estruturas.fila;

import java.util.LinkedList;
import java.util.List;


public class Fila <E> {
	
	
		
		List<E> aluno = new LinkedList<E>();
		
		public void inserir( E e) {
			this.aluno.add(e);
		}
		public E remover() {
			return ((LinkedList<E>) this.aluno).removeFirst();
		}
		public boolean vazio() {
			return this.aluno.size()==0;
		}
	}


