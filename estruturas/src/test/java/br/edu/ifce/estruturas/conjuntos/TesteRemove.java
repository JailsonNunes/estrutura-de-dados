package br.edu.ifce.estruturas.conjuntos;

import java.util.List;

public class TesteRemove {

	public static void main(String[] args) {
		
		ConjuntosEspalhamentos<String> conjunto = new ConjuntosEspalhamentos<String>();
		
		conjunto.adiciona("Hélio");
		conjunto.adiciona("Heitor");
		conjunto.adiciona("Humberto");
		conjunto.adiciona("Ilclemar");
		conjunto.adiciona("Jabesmar");
		conjunto.adiciona("Keroleen");
		conjunto.adiciona("Leomildo");
		conjunto.adiciona("Fologênio");
		conjunto.adiciona("Grivelda");
		conjunto.adiciona("Gladistone");
		conjunto.adiciona("Gêngis");
		
		conjunto.remove("Ilclemar");
		
		List<String>palavras = conjunto.pegaTodas();
		
		for(String palavra : palavras) {
			System.out.println(palavra);
			
		}
	}

}


