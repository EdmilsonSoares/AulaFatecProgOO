package aula03_Encapsulamento1;

public class Verifica_Encapsulamento_1 {

	public static void main(String[] args) {

		Acesso_Numeros chave = new Acesso_Numeros();
		chave.a = 10;
		chave.b = 20;
		chave.setNumeros("c", 30);//c is private
		chave.d = 40;
		
		chave.mostra_numero();

	}
}
