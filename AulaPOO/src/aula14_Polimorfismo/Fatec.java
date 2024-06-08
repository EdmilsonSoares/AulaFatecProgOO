package aula14_Polimorfismo;

public class Fatec {
	private String nomecurso;
	private int quantidadealunos;
	
	public Fatec(){
		nomecurso = "";
		quantidadealunos = 0;
	}

	public String getNomecurso() {
		return nomecurso;
	}
	public void setNomecurso(String nomecurso) {
		this.nomecurso = nomecurso;
	}
	public int getQuantidadealunos() {
		return quantidadealunos;
	}
	public void setQuantidadealunos(int quantidadealunos) {
		this.quantidadealunos = quantidadealunos;
	}
	
	//metodo que será polimorfo
	public void mostracurso() {
		System.out.println("0 Nome do curso: " + nomecurso + "\tQuantidade de alunos: " + quantidadealunos);
	}
	
	public void atualizalunos(int matriculas) {
		quantidadealunos = quantidadealunos + matriculas;
	}

}
