package aula15_Exercicio;

public class Aventura extends Terror{
	
	Aventura(String f) {
		super(f);
	}
	
	//método usado no conceito de polimorfismo
	public void consulta_livro() {
		System.out.println("Gênero Aventura");
	}

}
