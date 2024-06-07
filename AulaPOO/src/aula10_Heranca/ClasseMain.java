package aula10_Heranca;

public class ClasseMain {

	public static void main(String[] args) {
		FaculdadeCEETEPs ceeteps = new FaculdadeCEETEPs();
		DisciplinasCEETEPs disc = new DisciplinasCEETEPs();
		
		ceeteps.setFatec("Fatec Baixada Santista");
		ceeteps.setFaculdade("Administração e Desenvolvimento de Sistemas");
		disc.setDisciplina("Programação Orientada a Objetos");
		System.out.println("Fatec: " + ceeteps.getFatec() + "\nFaculdade: " + ceeteps.getFaculdade());
		System.out.println("Disciplina da faculdade: " + disc.getFaculdade()); 
		//O comando acima imprime null pq não foi setada faculdade para instância de disc mas sim para ceeteps
		System.out.println("Disciplina: " + disc.getDisciplina());
		
	/* Os primeiros prints mostram duas vezes o construtor da superclasse porque foram instânciados dois objetos fazendo referência 
	 * ao construtor da superclasse, mesmo que a classe DisciplinaCEETEPs não faça explicitamente essa refeência o compilador chama 
	 * o super()
	 */	
	}

}
