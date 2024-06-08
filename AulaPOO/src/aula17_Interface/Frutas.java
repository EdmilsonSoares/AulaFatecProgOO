package aula17_Interface;

public class Frutas implements Interface{
	
	protected String fruta_vermelha; 
	protected String fruta_citrica;
	
	//implementação dos métodos
	public String identifica_fruta(String fruta) { 
		return fruta;
	}
	public int quantidade_frutas(int f) { 
		return f;
	}
	public double preco_kilo(double k) { 
		return k;
	}

}
