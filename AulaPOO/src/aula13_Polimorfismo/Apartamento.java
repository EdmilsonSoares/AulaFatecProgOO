package aula13_Polimorfismo;

public class Apartamento extends Construcao{
	Construcao aptm = new Construcao();
	
	Apartamento(){
		aptm.setTipo("Apartamento");
	}
	
	//aplicação do polimorfismo
	public void constroi() {
		System.out.println("Faz-se " + aptm.getTipo());
	}

}
