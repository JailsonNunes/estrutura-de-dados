package br.edu.ifce.estruturas.lista;

public class TesteAdicionaNoComeco {

	public static void main(String[] args) {

		ListaLigada lista = new ListaLigada();
		
		lista.adicionaNoComeco("Rafael");
		lista.adicionaNoComeco("Paulo");
		lista.adicionaNoComeco("Jailson");
				
		System.out.println(lista);
	}

}
