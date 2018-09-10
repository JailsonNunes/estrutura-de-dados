package br.edu.ifce.estrutura.fila;

import br.edu.ifce.estruturas.fila.Fila;

public class TestaVazio {
	public static void main(String[] args) {
		 Fila<String> nome = new Fila<String>();
		 
		 nome.adiciona("Jailson");
		 
		 nome.vazio();
		 
		 boolean elementos = nome.vazio();
		System.out.println(elementos);
	}

}
