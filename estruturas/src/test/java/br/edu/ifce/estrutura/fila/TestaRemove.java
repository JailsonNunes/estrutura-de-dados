package br.edu.ifce.estrutura.fila;

import br.edu.ifce.estruturas.fila.Fila;

 public class TestaRemove {
		
	 public static void main(String[] args) {
		 Fila<String> nome = new Fila<String>();	   
			  
		 nome.adiciona("Jailson");
			  
		System.out.println(nome.remover());
		
		}
}
