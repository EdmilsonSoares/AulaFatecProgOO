package aula01_memoria;

public class Teste {

	public static void main(String[] args) {
		int A = 0;
		
		for(int i=0; i<5; i++) {
			int B = 0; //variavel B só exisste nesse escopo
			B += i;
			A += i;
			System.out.println("Valor de B: " + B + "\tValor de A: " + A);
		}//A cada interação B é "esquecido" e um novo B é criado
		
		//Variável A existe no escopo main
		System.out.println(A);
		//Variável B não existe no escopo main
		//System.out.println(B);
		
	}

}
