package aula19_Subtipagem;

public class DefineMamifero {
	String animal;
	int g = 0;
	Mamifero m = null;
	
	public Mamifero tipoMamifero(String animal) {
		this.animal = animal;
		
		if (animal == "cachorro") 
			m = new Mamifero();
		else if (animal == "puma") 
			m = new MamiferoAmerica();	
		else if (animal == "onça") 
			m = new MamiferoAmericaSul();
		else
			m = null;
		return m;
	}

	public void verificaInstancia(Mamifero f) {
		g = g + 1;
		
		if (f instanceof Mamifero)
			System.out.println("animal: cachorro " + g + "º iteração" );
		
		if (f instanceof MamiferoAmerica)
			System.out.println("animal: puma " + g + "º iteração");
		
		if (f instanceof MamiferoAmericaSul)
			System.out.println("animal: onça " + g + "º iteração");
	}
}
