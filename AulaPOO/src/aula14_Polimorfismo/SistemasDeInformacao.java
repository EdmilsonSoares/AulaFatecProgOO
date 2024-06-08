package aula14_Polimorfismo;

public class SistemasDeInformacao extends Fatec{
	Fatec curso1 = new Fatec();
	
	public SistemasDeInformacao() {
		//método da classe Fatec
		curso1.mostracurso();
		curso1.setNomecurso("Tecnologia em Sistemas de Informação"); 
		curso1.setQuantidadealunos(160);
		curso1.atualizalunos(20);
		//método da classe Fatec
		curso1.mostracurso();
		//método desta classe, polimorfismo
		mostracurso();
	}
	
	//aplicação do polimorfismo
	public void mostracurso() {
		curso1.setNomecurso ("Bacharel em Sistemas de Informação"); 
		curso1.setQuantidadealunos (40);
		System.out.println("1 Nome do curso: " + curso1.getNomecurso() + "\tQuantidade de alunos: " + curso1.getQuantidadealunos());
	}

}
