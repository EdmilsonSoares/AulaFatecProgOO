package aula12_Heranca;

public class ClasseMain {

	public static void main(String[] args) {
		CineRoxy roxy = new CineRoxy();
		CineCaicara caicara = new CineCaicara("Antigo cinema da\nAv. Conselheiro Nébias - Boqueirão");
		
		caicara.setNome("Cine Caiçara");
		caicara.setLocalizacao("Avenida Conselheiro Nébias com a praia");
		System.out.println("Cinema: " + caicara.getNome() + "\nFicava na esquina da: " + caicara.getLocalizacao());
		
	}

}
