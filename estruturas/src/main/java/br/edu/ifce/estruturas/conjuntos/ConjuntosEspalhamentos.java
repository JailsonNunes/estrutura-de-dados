package br.edu.ifce.estruturas.conjuntos;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;



public class ConjuntosEspalhamentos<T> {

	  private int tamanho=0;
	  private ArrayList<LinkedList<T>> tabelaEspalhamento = new ArrayList<LinkedList<T>>();
	  
	  public ConjuntosEspalhamentos() {
		  for(int i = 0; i<26; i++) {
			  LinkedList<T> lista = new LinkedList<T>();
			  tabelaEspalhamento.add(lista);
		  }
	  }
	  public int funcaoEspalhamento(T objeto) {
		  return ((String) objeto).toLowerCase().charAt(0)%26;	  
		  }
	
	public void adiciona(T objeto) {
		if(!this.contem(objeto)) {
			int indice = this.funcaoEspalhamento(objeto);
			LinkedList <T>Lista = this.tabelaEspalhamento.get(indice);
			Lista.add(objeto);
			this.tamanho++;
		}	
	  }

	  public void remove(T objeto) {
		  if(this.contem(objeto)) {
			  int indice = this.funcaoEspalhamento(objeto);
			  List<T>Lista=this.tabelaEspalhamento.get(indice);
			  Lista.remove(objeto);
			  this.tamanho--;
		  }
	  }

	  public boolean contem(T objeto) {
		  int indice = this.funcaoEspalhamento(objeto);
		  List<T>Lista=this.tabelaEspalhamento.get(indice);
		  
		  return Lista.contains(objeto);
	  }
	  
	  public List<T> pegaTodas(){
		 List<T> objetos= new ArrayList<T>();
		 for(int i =0; i<this.tabelaEspalhamento.size();i++) {
			 objetos.addAll(this.tabelaEspalhamento.get(i));
		 }
		 return objetos;
	  }
	  
	  public int tamanho() {
	      return this.tamanho;
	  } 
	  public String toString() {
		  
		  StringBuilder builder = new StringBuilder();
		 
		  for (int i = 0; i < tabelaEspalhamento.size(); i++) {
			  
			  LinkedList<T> Lista = tabelaEspalhamento.get(i);
			  
			  if(!Lista.isEmpty()) {
				  String objeto = Lista.toString();
				  
				  builder.append("["+objeto.charAt(1)+"] -->"+objeto);
				  builder.append("\n");
			  }
		  }
		  
		 
		  return builder.toString();
		  }
	  
	  private int calculaCodigoEspalhamento(T objeto){
		int codigo=1;
		  for(int i=0 ; i<((String) objeto).length();i++) {
			codigo= 31 * codigo + ((String) objeto).toLowerCase().charAt(i);
		 }
		 return codigo; 
	  }
	  
	   public int calculaIndiceTabela(T objeto) {
		 int CodigoEpalhamento = Math.abs(calculaCodigoEspalhamento(objeto));
		  return CodigoEpalhamento%this.tabelaEspalhamento.size();
	  }
	   private void verificaCarga() {
		   int capacidade = this.tabelaEspalhamento.size();
		   double carga = this.tamanho/capacidade;
		   
		   if(carga>0.75) {
			   this.redimensionaTabela(capacidade*2);
			   
		   }else if(carga<0.25) {
			   this.redimensionaTabela(Math.max(capacidade/2, 10));
		   }
		   
	   }
	   private void redimensionaTabela(int novaCapacidade) {
		  List<T> objetos = this.pegaTodas();
		  this.tabelaEspalhamento.clear();
		  
		  for(int i=0; i<novaCapacidade; i++) {
			
			  this.tabelaEspalhamento.add(new LinkedList<T>());
		  }
		  for(T objeto : objetos) {
			  this.adiciona(objeto);
		  }
	   }
	   
	}
	
