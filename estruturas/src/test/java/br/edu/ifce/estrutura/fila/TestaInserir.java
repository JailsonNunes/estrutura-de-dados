package br.edu.ifce.estrutura.fila;

import br.edu.ifce.estruturas.fila.Fila;

public class TestaInserir {
	
	public static void main(String[] args) {
	 Fila<String> nome = new Fila<String>();	   
		  
	 nome.adiciona("Jailson");
	 nome.adiciona("Junior");
	 nome.adiciona("Gustavo");
	 nome.adiciona("Cleziana");
	 
	 
	 System.out.println(nome.remover());
	 System.out.println(nome.remover());
	 System.out.println(nome.remover());
	 System.out.println(nome.remover());
	 
	 System.out.println(nome.vazio());
	}
}
