package br.edu.ifce.estruturas.ListaCircular;

public class ListaCircular {
	nó primeiro;
	nó ultimo;
	
	
	public ListaCircular() {
		
		primeiro=null;
		ultimo=null;
	}
	
	public void adicionar(String x) {
		nó novo=new nó();
		novo.dados=x;
		
		if(primeiro==null) {
			primeiro=novo;
			ultimo=primeiro;
			primeiro.proximo=ultimo;
			
		}else {
			ultimo.proximo = novo;
			novo.proximo=primeiro;
			ultimo=novo;
		}
	
	}
	
	public void verificar() {
		nó atual = new nó();
		atual = primeiro;
		do {
			System.out.println("" + atual.dados);
			atual =atual.proximo;
		}while(atual!=primeiro);
		
	}
}
