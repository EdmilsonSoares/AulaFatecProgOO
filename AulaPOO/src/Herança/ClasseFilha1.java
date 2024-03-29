package Herança;

public class ClasseFilha1 extends SuperClasse{
	private String atributo2;
	
	ClasseFilha1(){
		super();
		System.out.println("Acesso ao método construtor da ClasseFilha1.");
	}

	public String getAtributo2() {
		return atributo2;
	}

	public void setAtributo2(String atributo2) {
		this.atributo2 = atributo2;
	}



}
