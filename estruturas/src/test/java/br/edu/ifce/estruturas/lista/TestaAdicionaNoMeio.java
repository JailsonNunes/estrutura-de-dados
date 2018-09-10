package br.edu.ifce.estruturas.lista;

public class TestaAdicionaNoMeio {
	public static void main(String[] args) {
		ListaLigada lista = new ListaLigada();
		
		lista.adiciona("Rafael");
		lista.adiciona("Paulo");
		lista.adiciona("Jailson");
		lista.adiciona("Cesar");
		
		lista.adiciona("Paulo");
		System.out.println(lista);
	}
}
