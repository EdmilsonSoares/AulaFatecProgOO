package gerenciar_contatos;
import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class ListaContato {
	JFrame janela = new JFrame("Todos contatos");
	DefaultListModel<String> listaModelo = new DefaultListModel<>();
	JList<String> listaContatos;
	JScrollPane barraRolagem;
	 
	public void adiciona(String contato) {
		listaModelo.addElement(contato);
	}
	
	public void exibir() {
		listaContatos = new JList<>(listaModelo);
		barraRolagem = new JScrollPane(listaContatos);
		barraRolagem.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		listaContatos.setFont(new Font("", Font.BOLD, 12));
		janela.add(barraRolagem, BorderLayout.CENTER);
		janela.setLocationRelativeTo(null);
		janela.setSize(500, 200);
		janela.setVisible(true);
	}

}
