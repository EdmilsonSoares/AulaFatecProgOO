package aula13_Polimorfismo;

public class Construcao {
	private String tipo;

	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	//metodo que será polimorfo
	public void constroi() {
		System.out.println("Faz-se qualquer tipo de construção");
	}
	

}
