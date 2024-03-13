package encapsulamento_2;
import encapsulamento_1.Acesso_Numeros;

public class Verifica_Encapsulamento_2 {
	
	public static void main(String[] args) {
		
		Acesso_Numeros chave = new Acesso_Numeros();
		
		chave.setNumeros("a", 50);
		chave.b = 60;
		chave.setNumeros("c", 70);
		chave.setNumeros("d", 80);
		
		chave.mostra_numero();
	}
}
