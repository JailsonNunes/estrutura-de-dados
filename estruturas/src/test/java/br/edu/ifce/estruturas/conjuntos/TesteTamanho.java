package br.edu.ifce.estruturas.conjuntos;

public class TesteTamanho {
	public static void main(String[] args) {
		ConjuntosEspalhamentos<String> conjunto = new ConjuntosEspalhamentos<String>();
	
		conjunto.adiciona("Hélio");
		conjunto.adiciona("Heitor");

	
	
	
	
		System.out.println(conjunto.tamanho());
	}

}
