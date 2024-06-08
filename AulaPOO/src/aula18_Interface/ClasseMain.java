package aula18_Interface;

public class ClasseMain {

	public static void main(String[] args) {
		Feira a = new Fruta();
		Feira b = new Verdura();
		
		a.setar_fruta(a.comprar);
		a.chama_comprar_fruta();
		b.setar_verdura(b.comprar);
		b.chama_comprar_fruta();

	}

}
