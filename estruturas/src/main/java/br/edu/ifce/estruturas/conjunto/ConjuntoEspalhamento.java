package br.edu.ifce.estruturas.conjunto;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ConjuntoEspalhamento {
	
  private ArrayList<LinkedList<String>> tabelaEspalhamento = new ArrayList<LinkedList<String>>();
	
  public ConjuntoEspalhamento() {
	  for(int i=0; i<26; i++) {
		  LinkedList<String> lista = new LinkedList<String>();
		  tabelaEspalhamento.add(lista);
	  }
  }
  	private int calculaCodigoEspalhamento(String palavra) {
  		int somaCodigo = 1;
  		for(int i=0; i<palavra.length(); i++) {
  			somaCodigo = 31*somaCodigo + palavra.toLowerCase().charAt(i);
  		}
  		return somaCodigo;
  	}
  	public int calculaIndiceDaTabela(String palavra) {
  		int codigoEspalahamento = Math.abs(calculaCodigoEspalhamento(palavra));
  		return codigoEspalahamento % this.tabelaEspalhamento.size();
  		
  	}
  
  //	public int funcaoEspalhamento(String palavra) {
  // return	palavra.toLowerCase().charAt(0) % 26;
  //}
  
	public void adiciona(String palavra) {
		
	if(!this.contem(palavra)) {
	 int indice = this.calculaCodigoEspalhamento(palavra);
	 LinkedList<String> lista = this.tabelaEspalhamento.get(indice);
	 lista.add(palavra);
	}
 }
	
	public void remove(String palavra) {
		
	}
	public boolean contem(String palavra) {
		return false;
	}
	
	public List<String> pegaTodasPalavras(){
	  return null;	
	}
	public int tamanho() {
		return 0;
	}
	private void verificaCarga() {
		int capacidade = this.tabelaEspalhamento.size();
		double carga = this.tamanho() / capacidade;
		
		if(carga > 0.75) {
			this.redimensionaTabela(capacidade * 2);
		}else if (carga <0.25) {
			this.redimensionaTabela(Math.max(capacidade/2, 10));
		}
	}
	
	private void redimensionaTabela(int novaCapacidade) {
		List<String> backup = this.pegaTodasPalavras();
		this.tabelaEspalhamento.clear();
		
		for(int i = 0; i < novaCapacidade; i++) {
			LinkedList<String> lista = new LinkedList<String>();
			  tabelaEspalhamento.add(lista);
		}
		for(String palavra: backup) {
			this.adiciona(palavra);
		}
	}
	
	
	
}