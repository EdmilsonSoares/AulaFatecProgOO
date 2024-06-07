package aula11_HerancaEx02;

public class Matricula extends QuartoCicloSI{

	public static void main(String[] args) {
		QuartoCicloSI E = new QuartoCicloSI();
		
		E.setMatricula_aluno("RA122000");
		System.out.println("Matrícula:\t" + E.getMatricula_aluno());

	}

}
