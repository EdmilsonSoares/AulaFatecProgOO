package aula12_Heranca;

public class ClasseMain {

	public static void main(String[] args) {
		CineRoxy roxy = new CineRoxy();
		CineCaicara caicara = new CineCaicara("Antigo cinema da\nAv. Conselheiro Nébias - Boqueirão");
		
		caicara.setNome("Cine Caiçara");
		caicara.setLocalizacao("Avenida Conselheiro Nébias com a praia");
		System.out.println("Cinema: " + caicara.getNome() + "\nFicava na esquina da: " + caicara.getLocalizacao());
		
		System.out.println("Salas em atividade: " + caicara.salas("Sala 5")); 
		System.out.println("Salas em atividade: " + caicara.salas("Sala 4", "Sala 7"));
		
		roxy.emCartaz("Planeta dos Macacos");
		roxy.emCartaz("Divertidamente 2", "Godzilla Minus One", "Duna 2");
		
	}

}
