package aula17_ClasseAbstrata;

public class ClasseMain {

	public static void main(String[] args) {
		ClasseAbstrata A = new ClasseConcreta();
		ClasseConcreta B = new ClasseConcreta();
		
		A.setMensagem("Demonstrando Classe Abstrata\n");
		A.mostra_mensagem();
		System.out.println(A.getMensagem());
		
		B.setMensagem("Demonstrando Classe Concreta\n");
		B.mostra_mensagem();
		System.out.println(B.getMensagem());

	}

}
