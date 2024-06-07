package aula13_Polimorfismo;

public class Casa extends Construcao{
	Construcao house = new Construcao();
		
	public Casa() {
		house.setTipo("Casa");
	}
	
	//aplicação do polimorfismo
	public void constroi() {
		System.out.println("Faz-se " + house.getTipo());
	}

}
