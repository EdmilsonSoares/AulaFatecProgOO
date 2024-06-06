package aula05_Construtores;

public class Revendedora1 {

	public static void main(String[] args) {
		Automovel A = new Automovel();
		Automovel B = new Automovel(1977,"Volkswagen","Fusca",12000.00);
		
		System.out.println(A.mostraCarro());
		System.out.println(B.mostraCarro());
		
		B = null;
		System.gc();//garbage collector é como um metodo destrutor, coleta objetos que não estão mais em uso
		
		System.out.println(B.mostraCarro());
	}

}
