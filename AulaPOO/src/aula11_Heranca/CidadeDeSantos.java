package aula11_Heranca;

public class CidadeDeSantos {
	private String regiao;
	private int populacao;
	
	CidadeDeSantos(){}
	
	CidadeDeSantos(String s){
		if(s == "re")
			System.out.println("Secretaria de Regionais");
		if(s == "ba")
			System.out.println("Secretaria de Bairros");
	}
	
	public String getRegiao() {
		return regiao;
	}
	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}
	public int getPopulacao() {
		return populacao;
	}
	public void setPopulacao(int populacao) {
		this.populacao = populacao;
	}
	
}
