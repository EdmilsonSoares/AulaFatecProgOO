package aula08_Heranca;

public class ClassePai {
	
	private int capital;
	private String imovel;
	
	public ClassePai(){
		System.out.println("Construtor vazio da ClassePai");
	}
	public ClassePai(int capital, String imovel){
		this.capital = capital;
		this.imovel = imovel;
	}
	public int getCapital() {
		return capital;
	}
	public void setCapital(int capital) {
		this.capital = capital;
	}
	public String getImovel() {
		return imovel;
	}
	public void setImovel(String imovel) {
		this.imovel = imovel;
	}
	
	
	
	

}
