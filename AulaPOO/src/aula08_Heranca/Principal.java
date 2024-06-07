package aula08_Heranca;

public class Principal{

	public static void main(String[] args) {

		//ClasseNeta amanda = new ClasseNeta("BlackRock");
		ClasseNeta amanda = new ClasseNeta();
		amanda.setCapital(500000000);
		amanda.setImovel("Casa na praia");
		amanda.setVeiculo("Lamborgini Zentorno");
		amanda.setEmpresa("Amazon Company");
		System.out.println("Amanda herdou R$ " + amanda.getCapital());
		System.out.println("Amanda herdou " + amanda.getImovel());
		System.out.println("Amanda herdou " + amanda.getVeiculo());
		System.out.println("Amanda herdou " + amanda.getEmpresa());
		
	}

}
