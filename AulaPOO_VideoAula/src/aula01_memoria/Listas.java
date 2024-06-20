package aula01_memoria;
import java.util.ArrayList;
import java.util.List;

public class Listas {

	public static void main(String[] args) {
		
		List<String> minhalista = new ArrayList<String>();//ArrayList é a classe que implementa a interface List<>
		
		minhalista.add("Mariana");
		minhalista.add("Marcelo");
		minhalista.add("Marcos");
		minhalista.add("Matheus");
		
		imprimir(minhalista);
		
		minhalista.add(1, "Maresia");
		imprimir(minhalista);
		
		minhalista.remove("Maresia");
		imprimir(minhalista);
		
		minhalista.remove(0);
		imprimir(minhalista);
		System.out.println("Indice do Matheus " + minhalista.indexOf("Matheus"));

	}
	
	public static void imprimir(List<String> lista) {
		System.out.println(lista.size());
		for(String nome : lista) {
			System.out.println(nome);
		}
	}

}
