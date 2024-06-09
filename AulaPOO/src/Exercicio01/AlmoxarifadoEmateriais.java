package Exercicio01;

public class AlmoxarifadoEmateriais extends DepartamentoFinanceiro{
	private int materiais;
	
	AlmoxarifadoEmateriais(String rede, String hotel) {
		super(rede, hotel);
	}

	public int getMateriais() {
		return materiais;
	}
	public void setMateriais(int materiais) {
		this.materiais = materiais;
	}
	public int calculaDespesa(int num) {
		return num * materiais;
	}
	

}
