package Exercicio01;

public abstract class RedeDeHotelaria {
	private String rede;
	private int unidades;
	
	RedeDeHotelaria(String rede, int unidades){
		this.rede = rede;
		this.unidades = unidades;
	}
	public String getRede() {
		return rede;
	}
	public int getUnidades() {
		return unidades;
	}
	protected abstract String mensagem(String msg);
}
