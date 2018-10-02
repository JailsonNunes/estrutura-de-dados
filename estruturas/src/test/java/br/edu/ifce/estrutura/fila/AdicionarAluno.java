package br.edu.ifce.estrutura.fila;

import br.edu.ifce.estruturas.fila.Fila;

public class AdicionarAluno {

	public static void main(String[] args) {
						
				Fila <String> nome=new Fila<String>();
				
				nome.inserir("Nathan");
				nome.inserir("João");
				nome.inserir("Naelia");
				nome.inserir("Gustavo");
				
				System.out.println(nome.remover());
				System.out.println(nome.remover());
				System.out.println(nome.remover());
				System.out.println(nome.remover());
				
				
				System.out.println(nome.vazio());
				
			}
}


