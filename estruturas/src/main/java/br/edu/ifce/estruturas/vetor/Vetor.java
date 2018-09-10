package br.edu.ifce.estruturas.vetor;

public class Vetor {

	private Aluno[] alunos = new Aluno[100];
	private int totalDeAlunos = 0;

	public void adiciona(Aluno aluno) {
		alunos[this.totalDeAlunos]= aluno ;
		totalDeAlunos++;
		
		// implementacao
	}

	public void adiciona(int posicao, Aluno aluno) {
		 for(int i=this.totalDeAlunos; i>=posicao; i--){
		      this.alunos[i]= this.alunos[i-1];
		     }
		      this.alunos[posicao] = aluno;
		       this.totalDeAlunos++;
		
		// implementacao
	}

	public Aluno pega(int posicao) {
		if(posicao >= this.totalDeAlunos || posicao < 0){
		      throw new IllegalArgumentException("Posicao invalida");
		    }
		    return this.alunos[posicao];
		   
	
	}

	public void remove(int posicao) {
		// implementacao
	}

	public boolean contem(Aluno aluno) {
		for (int i = 0; i < this.totalDeAlunos; i++) {
			if (aluno == this.alunos[i]) {
				return true;
			}
		}
		return false;
	}

	public int tamanho() {
		return this.totalDeAlunos;
	}

	public String toString() {
		if (this.totalDeAlunos == 0) {
			return "[]";
		}

		StringBuilder builder = new StringBuilder();
		builder.append("[");

		for (int i = 0; i < this.totalDeAlunos - 1; i++) {
			builder.append(this.alunos[i]);
			builder.append(", ");
		}

		builder.append(this.alunos[this.totalDeAlunos - 1]);
		builder.append("]");

		return builder.toString();
	}

}
