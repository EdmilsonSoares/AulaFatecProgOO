package aula02_Livraria;
import javax.swing.JOptionPane;

public class Atendente_Livraria {

	public static void main(String[] args) {

		Livraria cultura = new Livraria();

		String ano, a, b, c, d, e, i;
		int f = 0, g;
		double h;

		while (f < 1 || f > 3) {
			JOptionPane.showMessageDialog(null,"Categoria: Digite\n 1 para romance\n 2 para espírita\n 3 para informática","", JOptionPane.PLAIN_MESSAGE);
			a = JOptionPane.showInputDialog(null, "Codigo");
			f = Integer.parseInt(a);
			if (f < 1 || f > 3)
				JOptionPane.showMessageDialog(null, "Código não corresponde a nenhuma categoria");
		}
		b = JOptionPane.showInputDialog(null, "Editora");
		c = JOptionPane.showInputDialog(null, "Autor");
		d = JOptionPane.showInputDialog(null, "Livro");
		ano = JOptionPane.showInputDialog(null, "Ano de lançamento");
		e = JOptionPane.showInputDialog(null, "Quantidade");
		i = JOptionPane.showInputDialog(null, "Preço");

		g = Integer.parseInt(e);
		h = Double.parseDouble(i);

		cultura.editora = b;
		cultura.autor = c;
		cultura.livro = d;
		cultura.ano = ano;
		cultura.quantidade = g;
		cultura.preco = h;

		cultura.Informa_Livros(f);
	}
}
