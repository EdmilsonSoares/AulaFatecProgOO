package aula16_Sobrecarga;

public class ClasseMain {

	public static void main(String[] args) {
		
		FichaFuncionarios funcionarios = new FichaFuncionarios(22, 2889.00,"Gisele", "Pedagoga");
		
		System.out.println(funcionarios.mostra_funcionarios());
		concatena_informacao();
		

	}
	
	public static void concatena_informacao() {
		AcessoSecundario A = new AcessoSecundario();
	}

}
