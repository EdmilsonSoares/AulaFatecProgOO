package aula01_memoria;

public class Referencia {

	public static void main(String[] args) {
		//new é semelhante ao & em C
		Produto p1 = new Produto("Teclado", 79.89);
		Produto p2 = new Produto("Mouse", 22.50);
		Produto p3 = p2; //p3 não recebe uma cópia de p2, p3 APONTA para onde p2 aponta
		
		System.out.println("P1 = " + p1.descricao() + "\nP2 = " + p2.descricao() + "\nP3 = " + p3.descricao() + "\n");
		p2.setNome("Headphone");
		System.out.println("P1 = " + p1.descricao() + "\nP2 = " + p2.descricao() + "\nP3 = " + p3.descricao() + "\n");
		System.out.println("P1 referencia " + p1 + "\nP2 referencia " + p2 + "\nP3 referencia " + p3 + "\n");
		
		p3 = metodo();//aqui p3 recebe um endereço vindo de metodo()
		p2.setValor(49.99);
		System.out.println("P1 = " + p1.descricao() + "\nP2 = " + p2.descricao() + "\nP3 = " + p3.descricao() + "\n");
		System.out.println("P1 referencia " + p1 + "\nP2 referencia " + p2 + "\nP3 referencia " + p3 + "\n");
		
	}
	
	static Produto metodo() {
		Produto pro = new Produto("Monitor", 779.89);
		return pro;
	}

}
