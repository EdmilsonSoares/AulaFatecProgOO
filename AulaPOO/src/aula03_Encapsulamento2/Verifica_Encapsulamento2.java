package aula03_Encapsulamento2;
import aula03_Encapsulamento1.Acesso_Numeros;

public class Verifica_Encapsulamento2 {
	
	public static void main(String[] args) {
		
		Acesso_Numeros chave = new Acesso_Numeros();
		
		chave.setNumeros("a", 50);//a é protected só acessado por metodos 
		chave.b = 60;//apenas b pode ser acessado assim pois é público
		chave.setNumeros("c", 70);//c é private só acessado por metodos 
		chave.setNumeros("d", 80);//d é protected só acessado por metodos 
		
		chave.mostra_numero();
	}
}
