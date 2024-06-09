package Exercicio01;

public class SetorRH extends DepartamentoFinanceiro{
	private int despesas;
	
	SetorRH(String rede, String hotel) {
		super(rede, hotel);
	}

	public int getDespesas() {
		return despesas;
	}
	public void setDespesas(int despesas) {
		this.despesas = despesas;
	}
	public int calculaDespesa(int num) {
		return num * despesas;
	}
}
