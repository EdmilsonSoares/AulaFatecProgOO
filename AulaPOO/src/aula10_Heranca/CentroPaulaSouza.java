package aula10_Heranca;

public class CentroPaulaSouza {
	
	private String fatec;
	private String cidade;

	public CentroPaulaSouza(String cidade) {
		this.cidade = cidade;
		System.out.println("Construtor da superclasse. cidade: " + cidade);	
	}

	public String getFatec() {
		return fatec;
	}

	public void setFatec(String fatec) {
		this.fatec = fatec;
	}

}
