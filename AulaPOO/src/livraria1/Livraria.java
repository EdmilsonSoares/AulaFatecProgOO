package livraria1;
import javax.swing.JOptionPane;

public class Livraria {
	
	String editora;
	String autor;
	String livro;
	String ano; //atributo adicionado para o exercicio
	int quantidade;
	double preco;
	
	public void Informa_Livros(int codigo) {

		switch(codigo) {
		
		case 1: JOptionPane.showMessageDialog(null, "CATEGORIA ROMANCE\n" + 
				"\n LIVRO: " + livro + 
				"\n LIVRO: " + ano + 
				"\n EDITORA: " + editora + 
				"\n Autor: " + autor +
				"\n QUANTIDADE: " + quantidade +
				"\n PREÇO: R$ " + preco, "", JOptionPane.PLAIN_MESSAGE);
		break;
		
		case 2: JOptionPane.showMessageDialog(null, "CATEGORIA ESPÍRITA\n" + 
				"\n LIVRO: " + livro + 
				"\n LIVRO: " + ano + 
				"\n EDITORA: " + editora + 
				"\n Autor: " + autor +
				"\n QUANTIDADE: " + quantidade +
				"\n PREÇO: R$ " + preco, "", JOptionPane.PLAIN_MESSAGE);
		break;
		
		case 3: JOptionPane.showMessageDialog(null, "CATEGORIA INFORMÁTICA\n" + 
				"\n LIVRO: " + livro +
				"\n LIVRO: " + ano + 
				"\n EDITORA: " + editora + 
				"\n Autor: " + autor +
				"\n QUANTIDADE: " + quantidade +
				"\n PREÇO: R$ " + preco, "", JOptionPane.PLAIN_MESSAGE);
		break;

		default: System.out.println("Código não corresponde a nenhuma categoria"); 
		}
	}
}
