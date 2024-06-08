package aula16_Sobrecarga;

public class AcessaFuncionarios extends FichaFuncionarios{
	
	static FichaFuncionarios d = new FichaFuncionarios("Sueli", "Professora", 32, 3876.00);
	
	AcessaFuncionarios() {
		super(d);
	}

}
