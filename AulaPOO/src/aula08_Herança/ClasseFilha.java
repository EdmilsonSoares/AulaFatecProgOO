package aula08_Herança;

public class ClasseFilha extends ClassePai{
	
	private String veiculo;
	private String empresa;
	
	public ClasseFilha() {
		super();
		System.out.println("Construtor vazio da ClasseFilha");
	}
	
	public ClasseFilha(String veiculo, String empresa){
		super(100000000, "Apartamento");//não necessário pois o compilador insere esse super() caso não o encontre aqui
		this.veiculo = veiculo;
		this.empresa = empresa;
		
	}

	public String getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(String veiculo) {
		this.veiculo = veiculo;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	


}
