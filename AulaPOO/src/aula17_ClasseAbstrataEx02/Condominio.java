package aula17_ClasseAbstrataEx02;

public class Condominio extends Conceito{

	protected String nomeCondominio() {
		return "Vila Nova";
	}
	
	protected double calcula_condominio(double a) {
		return a * 1.066;
	}
	
	@Override
	public void endereco_condominio() {
		System.out.println("Rua: A, nº 22");
	}
	

}
