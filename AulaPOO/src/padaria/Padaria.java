package padaria;

public class Padaria {
	private String nome;
	private int pao;
	private int cafe;
	private double caixa;
	
	Padaria(){}
	
	Padaria(String nome, int pao, double caixa){
		setNome(nome);
		setPao(pao);
		setCaixa(caixa);
	}
	Padaria(String nome, int pao, double caixa, int cafe){
		setNome(nome);
		setPao(pao);
		setCaixa(caixa);
		setCafe(cafe);
	}
	
	public int getCafe() {
		return cafe;
	}
	public void setCafe(int cafe) {
		this.cafe = cafe;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getPao() {
		return pao;
	}
	public void setPao(int pao) {
		this.pao = pao;
	}
	public double getCaixa() {
		return caixa;
	}
	public void setCaixa(double caixa) {
		this.caixa = caixa;
	}
	
}



