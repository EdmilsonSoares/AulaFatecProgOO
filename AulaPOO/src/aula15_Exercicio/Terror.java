package aula15_Exercicio;

public class Terror extends Livro{
	
	Terror(String b) {
		super(b);
	}
	
	//método usado no conceito de polimorfismo
	public void consulta_livro() {
		System.out.println("Gênero Terror");
	}

}
