package aula19_Subtipagem;

public class ClasseMain {

	public static void main(String[] args) {
		DefineMamifero df = new DefineMamifero();
		Mamifero f = null;
		
		//1ª iteração
		f = df.tipoMamifero("cachorro");
		df.verificaInstancia(f);
		//2ª iteração
		f = df.tipoMamifero("puma");
		df.verificaInstancia(f);
		//3ª iteração
		f = df.tipoMamifero("onça");
		df.verificaInstancia(f);

	}

}
