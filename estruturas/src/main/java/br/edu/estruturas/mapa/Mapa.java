package br.edu.estruturas.mapa;

import java.util.ArrayList;
import java.util.List;

public class Mapa {

	private List<Associacao> associacoes = new ArrayList<Associacao>();
	
	public void adiciona(String placa, Carro carro) {
		if(!contemChave(placa)) {
			Associacao a1 = new Associacao(placa,carro);
			this.associacoes.add(a1);
		}
	}
	
	public void remove(String placa) {
		if(this.contemChave(placa)) {
		   for(int i=0; i<this.associacoes.size(); i++) {
			   Associacao a = this.associacoes.get(i);
			   
			   if(placa.equals(a.getPlaca())) {
				   this.associacoes.remove(i);
				   break;
			   }
		   }
		}
	}
	
	public Carro pega(String placa){
		for(Associacao a : this.associacoes) {
			if(placa.equals(a.getPlaca())) {
			   return a.getCarro();
			}
		}
		return null;
   }
	
	public boolean contemChave(String placa) {
		for(Associacao a: this.associacoes) {
			if(placa.equals(a.getPlaca())) {
				return true;
			}
		}
		return false;
	}
	
	
}
