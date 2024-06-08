package aula15_Exercicio;

public class Livro {
	private String titulo;
	private String autor;
	
	Livro(){}
	
	Livro(String mensagem) {
		System.out.println(mensagem);
	}

	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	//método usado no conceito de polimorfismo
	public void consulta_livro() {
		System.out.println("Gênero: Ciência da Computação");
	}
	
}
