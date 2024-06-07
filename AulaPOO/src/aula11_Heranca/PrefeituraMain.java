package aula11_Heranca;

public class PrefeituraMain {

	public static void main(String[] args) {
		BairroDeSantos ba = new BairroDeSantos();
		RegiaoDeSantos re = new RegiaoDeSantos();
		CidadeDeSantos ci = new CidadeDeSantos();
		
		//classes de hierarquia mais inferior da acesso a todos atributos
		ba.setRua("Álvaro Guimarães");
		ba.setBairro("Jardim Rádio Clube");
		ba.setRegiao("Zona Noroeste");
		ba.setPopulacao(100000);
		System.out.println("(ba)BAIRRO: " + ba.getBairro() + "\n(ba)REGIÃO: " + ba.getRegiao() + 
							"\n(ba)RUA: " + ba.getRua() + "\n(ba)POPULAÇÃO: " + ba.getPopulacao());
		
		//não da acesso aos atributos da classe inferior
		re.setBairro("Zona Leste");
		re.setRegiao("Marapé");
		re.setPopulacao(99000);
		System.out.println("(re)BAIRRO: " + re.getBairro() + "\n(re)REGIÃO: " + re.getRegiao() + "\n(re)POPULAÇÃO: " + re.getPopulacao());
		
		ci.setRegiao("Região Central");
		ci.setPopulacao(20000);
		System.out.println("(ci)REGIÃO: " + ci.getRegiao() + "\n(ci)POPULAÇÃO: " + ci.getPopulacao());

	}

}
