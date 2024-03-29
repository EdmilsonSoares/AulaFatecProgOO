package Herança;

public class SuperClasse {
	private String atributo1;
	
	SuperClasse(){
		System.out.println("Acesso ao método construtor da Superclasse.");
	}

	public String getAtributo1() {
		return atributo1;
	}

	public void setAtributo1(String atributo1) {
		this.atributo1 = atributo1;
	}

}
