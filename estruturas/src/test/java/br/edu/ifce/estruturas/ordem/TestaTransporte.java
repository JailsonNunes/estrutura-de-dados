package br.edu.ifce.estruturas.ordem;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifce.estrutras.ordem.Transporte;

public class TestaTransporte {

	public static void main(String[] args) {
		List<Transporte> listaT = new ArrayList<Transporte>();
		Transporte T1 = new Transporte();
		Transporte T2 = new Transporte();
		Transporte T3 = new Transporte();
		Transporte T4 = new Transporte();
		Transporte T5 = new Transporte();
		
		T1.setNome("Lancha");
		T1.setValor(2000000);
		T2.setNome("Carro");
		T2.setValor(30000);
		T3.setNome("Patinete");
		T3.setValor(100);
		T4.setNome("Moto");
		T4.setValor(4000);
		T5.setNome("Bicicleta");
		T5.setValor(500);
		
		
		listaT.add(T1);
		listaT.add(T2);
		listaT.add(T3);
		listaT.add(T4);
		listaT.add(T5);
		
		Transporte menor = listaT.get(0);
		for(int i=0; i<listaT.size(); i++) {
			if(listaT.get(i).getValor()< menor.getValor() ) {
				menor = listaT.get(i);
			}
		}
		System.out.println("Nome: " +menor.getNome()+ "\nValor: " +menor.getValor());
	}

}
