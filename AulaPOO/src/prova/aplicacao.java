package prova;

public class aplicacao {

	public static void main(String[] args) {
		
		Carrinho car = new Carrinho("Camaro", 10, "Amarelo");
		
		System.out.println("Nome: " + car.getNome() + " Tamanho: " + car.getTamanho() + " Cor: " + car.getCor());

	}

}
