package aula14_PolimorfismoEx02;

public class Pomar {
	private String arvore;
	private String fruta;
	
	public Pomar() {
		arvore = "macieira";
		fruta = "maça";
	}
	
	public String getArvore() {
		return arvore;
	}
	public void setArvore(String arvore) {
		this.arvore = arvore;
	}
	public String getFruta() {
		return fruta;
	}
	public void setFruta(String fruta) {
		this.fruta = fruta;
	}
	
	//metodos que serão polimorfo
	public double area_pomar(){
		return 390.26;
	}
	public void teste() {
		System.out.println("Da classe Pomar\n");
	}

}
