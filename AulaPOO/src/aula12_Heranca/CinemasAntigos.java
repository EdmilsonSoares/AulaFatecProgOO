package aula12_Heranca;

public class CinemasAntigos extends CinemaDeSantos{
	private String nome;
	
	CinemasAntigos(String antigo){
		System.out.println("História dos cinemas de Santos\n" + antigo);
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	//sobrecarga de métodos
	public String salas(String A) {
		return A;
	}
	public String salas(String A, String B) {
		return A + " e " + B;
	}
}
