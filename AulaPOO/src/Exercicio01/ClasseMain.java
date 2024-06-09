package Exercicio01;

public class ClasseMain {

	public static void main(String[] args) {
		SetorRH RH = new SetorRH("OYO", "Real Palace Hotel");
		AlmoxarifadoEmateriais almx = new AlmoxarifadoEmateriais("OYO", "Park Tower");
		
		System.out.println(RH.mensagem("RH"));
		RH.setDespesas(225400);
		System.out.println("Hotel: " + RH.getHotel() + "\nDespesas: R$ " + RH.calculaDespesa(3) + "\n");
		
		System.out.println(almx.mensagem("materiais e almoxarifado"));
		almx.setMateriais(300);
		System.out.println("Hotel: " + almx.getHotel() + "\nDespesas: R$ " + almx.calculaDespesa(70) + "\n");
	}

}
