package Exercicio03_2;

public class Time implements Pontuacao{
	private String nome;
	private int vitoria;
	private int empate;
	private int derrota;
	
	Time(String nome){
		this.nome = nome;
	}

	@Override
	public void marcarPonto(int n) {
		if(n == 1)
			this.vitoria += 1 ;
		else if(n == 2)
			this.empate += 1;
		else if(n == 3)
			this.derrota += 1;
	}
	@Override
	public String exibirPonto() {
		return " Vitórias: " + vitoria + " Derrotas: " + derrota + " Empates: " + empate;
		
	}

	public String getNome() {
		return nome;
	}
	public int getVitoria() {
		return vitoria;
	}
	public int getEmpate() {
		return empate;
	}
	public int getDerrota() {
		return derrota;
	}



}
