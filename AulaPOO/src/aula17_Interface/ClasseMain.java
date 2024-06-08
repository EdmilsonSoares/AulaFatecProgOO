package aula17_Interface;

public class ClasseMain {

	public static void main(String[] args) {
		Frutas a =  new Frutas();
		
		a.fruta_citrica = "laranja";
		a.fruta_vermelha = "maçã";
		
		System.out.println ("Fruta Cítrica: " + a.identifica_fruta(a.fruta_citrica));
		System.out.println ("Fruta Vermelha: " + a.identifica_fruta(a.fruta_vermelha));
		System.out.println ("quantidade de frutas = " + a.quantidade_frutas(12));
		System.out.println ("preco kilo da fruta: R$ " + a.preco_kilo(5.66));
		

	}

}
