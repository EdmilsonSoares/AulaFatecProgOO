package aula15_Exercicio;

public class MainAcessaLivro {

	public static void main(String[] args) {
		Livro objeto = null;
		
		acessa_classes("x", objeto);
		acessa_classes("y", objeto);
		acessa_classes("z", objeto);

	}
	
	public static void acessa_classes(String a, Livro objeto) {
		if (a == "x")
			objeto = new Livro("Autor: Tanenbaum");
		else if (a == "y") 
			objeto = new Terror("Autor: Stephen King");
		else if (a == "z")
			objeto = new Aventura("Autor: Júlio Verne");
		
		objeto.consulta_livro();
	}

}
