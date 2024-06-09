package Exercicio01;

public class DepartamentoFinanceiro extends RedeDeHotelaria{
	private String hotel;

	DepartamentoFinanceiro(String rede, String hotel) {
		super(rede,300);
		this.hotel = hotel;
	}
	@Override
	protected String mensagem(String msg) {
		return "Setor de " + msg + " da rede de hotéis " + getRede();
	}
	public String getHotel() {
		return hotel;
	}
	public int calculaDespesa(int num) {
		return num * getUnidades();
	}
}
