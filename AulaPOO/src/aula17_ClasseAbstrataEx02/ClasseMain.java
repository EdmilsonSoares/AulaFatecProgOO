package aula17_ClasseAbstrataEx02;

public class ClasseMain {

	public static void main(String[] args) {
		final double a = 234.08;
		Condominio b = new Condominio();
		Conceito c = new Condominio();
		
		System.out.println("NOME DO CONDOMINIO: " + b.nomeCondominio());
		System.out.println("VAALOR DO CONDOMINIO: R$ " + b.calcula_condominio(a));
		b.endereco_condominio();
		
		System.out.println(c.getNome_condominio());
		System.out.println(c.calcula_condominio(a));
		c.endereco_condominio();

	}

}
