package Exercicio03;

public abstract class Atividade {
	private String nome;
	private String musica;
	private int duracao;
	
	Atividade(String nome, int duracao){
		this.nome = nome;
		this.duracao = duracao;
	}

	public String getNome() {
		return nome;
	}
	public String getMusica() {
		return musica;
	}
	public void setMusica(String musica) {
		this.musica = musica;
	}
	public int getDuracao() {
		return duracao;
	}
	public abstract String exercicio();
	public abstract String musica();
	
}
