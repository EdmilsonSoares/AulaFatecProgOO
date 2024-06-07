package aula11_HerancaEx02;

public class QuartoCicloSI extends SecretariaEscolar{
	
	public static void main(String[] args) {
		SecretariaEscolar A = new SecretariaEscolar();
		SecretariaEscolar B = new SecretariaEscolar("Maria", 22, 7.7, "Sistemas para Internet");
		ExibeDados(A);
		ExibeDados(B);
	
	}
	
	//static methods are after main
	public static void ExibeDados(SecretariaEscolar objeto) {
		System.out.println("Nome do aluno :\t" + objeto.getNome_aluno());
		System.out.println("Idade do aluno:\t" + objeto.getIdade_aluno());
		System.out.println("Media do aluno:\t" + objeto.getMedia_aluno());
		System.out.println("Curso do aluno:\t" + objeto.getCurso_aluno() + "\n");	
	}

}
