package prova;

public class Brinquedo {
	
	private String nome;
	private String cor;
	private int tamanho;
	
	public Brinquedo(){}
	
	public Brinquedo(String nome, int tamanho, String cor){
		this.nome = nome;
		this.tamanho = tamanho;
		this.cor = cor;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getTamanho() {
		return tamanho;
	}
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	
	

}
