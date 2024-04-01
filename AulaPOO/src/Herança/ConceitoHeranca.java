package Herança;

public class ConceitoHeranca {

	public static void main(String[] args) {
		ClasseFilha2 a = new ClasseFilha2();
		
		a.setAtributo1("Valor do atributo 1");
		a.setAtributo2("Valor do atributo 2");
		System.out.println(a.getAtributo1());
		System.out.println(a.getAtributo2());
		
		ClasseFilha3 b = new ClasseFilha3();
		b.setAtributo1("Atributo 1 da classeFilha3");
		b.setAtributo2("Atributo 2 da classeFilha3");
		System.out.println();
		System.out.println(b.getAtributo1());
		System.out.println(b.getAtributo2());
	}

}
