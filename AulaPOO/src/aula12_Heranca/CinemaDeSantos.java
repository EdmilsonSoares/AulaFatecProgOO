package aula12_Heranca;

public class CinemaDeSantos {
	private String localizacao;
	

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}
	
	//sobrecarga de métodos
	public void emCartaz(String A) {
		System.out.println("Filmes em cartaz:\n" + A);
	}
	public void emCartaz(String A, String B, String C) {
		System.out.println("Filmes em cartaz:\n" + A + "\n" + B + "\n" + C);
	}



}
