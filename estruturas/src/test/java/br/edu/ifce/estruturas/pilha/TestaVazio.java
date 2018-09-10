package br.edu.ifce.estruturas.pilha;

public class TestaVazio {
	
	public static void main(String[] args) {
		Pilha<String> nome = new Pilha<String>();
	
		   
		  nome.inserir("Livros");
		  
		  nome.vazio();
		
		
		boolean elementos = nome.vazio();
		
		System.out.println(elementos);
	}

}
