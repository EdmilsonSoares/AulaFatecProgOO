package Automóvel;

public class Buss {
	//Attributes
	private String estacao;
	private short linha;
	private int combustivel;
	private String estado;
	public String marca;
	public String modelo;
	public String cor;
	public double preco;
	
	//get method
	public String getEstacao() {
		return estacao;
	}
	
	public short getLinha() {
		return linha;
	}
	
	public int getCombustivel() {
		return combustivel;
	}
	
	public String getEstado() {
		return estado;
	}
	
	//set method
	public void setEstacao(String E) {
		this.estacao = E;
	}
	
	public void setLinha(short L) {
		this.linha = L;
	}
	
	public void setCombustivel(int C) {
		this.combustivel = C;
	}
	
	public void setEstado(boolean I) {
		if(I == true) {
			this.estado = "ligado";
		}else {
			this.estado = "desligado";
		}
	}
	
	//constructor method
	public Buss(String E, short L, int C, boolean I) {
		this.setEstacao(E);
		this.setLinha(L);
		this.setCombustivel(C);
		this.setEstado(I);
	}
	
	public void InformaAutomovel() {
		//System.out.println("Estação: " + this.estacao);
		//System.out.println("Linha: " + this.linha);
		//System.out.println("Combustivel: " + this.combustivel);
		//System.out.println("Estado: " + this.estado);
		System.out.println("MARCA: " + this.marca);
		System.out.println("MODELO: " + this.modelo);
		System.out.println("COR: " + this.cor);
		System.out.println("PREÇO: R$" + this.preco + "\n");
	}
	
}