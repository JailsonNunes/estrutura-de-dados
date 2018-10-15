package br.edu.ifce.estruturas.ordem;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifce.estrutras.ordem.OrdenaMenorInteiro;

public class TestaMenorInteiro {

	public static void main(String[] args) {
	 List<Integer> lista = new ArrayList<Integer>();
		OrdenaMenorInteiro inteiro = new OrdenaMenorInteiro();
		
		for(int i = 1000; i>=0; i--) {
			lista.add(i);
		}
		
		System.out.println(lista);
		
		for(int i = 0; i<lista.size(); i++) {
			int indicemenor = buscaMenor(lista, i, lista.size());
			int menorAtual = lista.get(i);
			int menorReal = lista.get(indicemenor);
		
		   lista.set(i, menorReal);
		   lista.set(indicemenor, menorAtual);
		}
		
		
		System.out.println(lista);
		
		
	}
	private static int buscaMenor(List<Integer> lista, int inicio, int fim) {
		
		Integer menor = inicio;
			for(int i=inicio; i<fim; i++) {
			if(lista.get(i) < lista.get(menor))
				menor = i;				
		}
			return menor;
	}

}
