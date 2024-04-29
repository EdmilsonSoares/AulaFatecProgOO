package gerenciar_contatos;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ClasseMain {

	public static void main(String[] args) {
		JFrame janela = new Janela();
		String t1, t2, t3;
		
		//tanto a janela como os JOptionPane executam ao mesmo tempo
		t1 = JOptionPane.showInputDialog(null, "Digite alguma coisa");
		t2 = JOptionPane.showInputDialog(null, "Digite alguma coisa");
		t3 = JOptionPane.showInputDialog(null, "Digite alguma coisa");
		
		

	}

}
