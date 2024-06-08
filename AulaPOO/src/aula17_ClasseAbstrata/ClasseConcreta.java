package aula17_ClasseAbstrata;

public class ClasseConcreta extends ClasseAbstrata{

	@Override
	protected void mostra_mensagem() {
		System.out.println("MENSAGEM:\t" + getMensagem());
	}

}
