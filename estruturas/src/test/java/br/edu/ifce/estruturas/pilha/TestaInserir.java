package br.edu.ifce.estruturas.pilha;

public class TestaInserir {
	
	public static void main(String[] args) {
		Pilha<String> nome = new Pilha<String>();
		   
		  nome.inserir("Livros");
		  
		  String elementos = nome.remover();
		  
		  System.out.println(elementos);
	
	}
}
