package interfaceGrafica;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Janela extends JFrame implements ActionListener{

	//JButton botao1, botao2; 
	JButton botao1 = new JButton("Pegar o texto");
	JButton botao2 = new JButton("Verificar Beneficiário");
	JButton botao3 = new JButton("SAIR");
	JLabel texto1 = new JLabel("Aqui ta escrito algo né?");
	JCheckBox box1 = new JCheckBox("Box",false);
	JRadioButton rad1 = new JRadioButton("Vivo");
	JRadioButton rad2 = new JRadioButton("Morto");
	JTextField caixa1 = new JTextField();
	Color cor = new Color(255,223,204);
	ButtonGroup grupo = new ButtonGroup();
	String cx1, cx2, cx3;
	
	public Janela() {
		setTitle("Minha janela");
		setSize(300,200); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
		setLayout(new GridLayout(8,1));
		getContentPane().setBackground (new Color (100, 200, 200));

		//botao1 = new JButton("1");
		//botao2 = new JButton("2");
		texto1.setFont(new Font("", Font.BOLD, 14));
		texto1.setHorizontalAlignment(SwingConstants.CENTER);
		texto1.setForeground(Color.BLUE);
		//texto1.setBackground(Color.BLUE);
		botao1.addActionListener(this);
		botao1.setFont(new Font("", Font.BOLD, 14));
		botao1.setForeground(Color.BLACK);
		botao1.setBackground(cor);
		botao2.addActionListener(this);
		botao2.setFont(new Font("", Font.BOLD, 14));
		botao2.setForeground(Color.BLACK);
		botao2.setBackground(cor);
		botao3.addActionListener(this);
		botao3.setFont(new Font("", Font.BOLD, 14));
		botao3.setForeground(Color.BLACK);
		botao3.setBackground(cor);
		grupo.add(rad1);
		grupo.add(rad2);
		//rad1.setBounds(300,250,50,50);
		//rad2.setBounds(0,250,30,30);
		//botao2.setBackground(Color.LIGHT_GRAY);
		//botao1.setBounds(0,0,70,40);		
		//botao2.setBounds(0,40,70,40);
		getContentPane().add(texto1);
		getContentPane().add(botao1);
		getContentPane().add(botao2);
		getContentPane().add(botao3);
		getContentPane().add(caixa1);
		getContentPane().add(box1);
		getContentPane().add(rad1);
		getContentPane().add(rad2);

		
		
		
	}

	public void actionPerformed(ActionEvent e) {
		int bt;
		//bt = Integer.parseInt(e.getActionCommand());
		if(e.getSource() == botao1) {
			cx1 = caixa1.getText();
			JOptionPane.showMessageDialog(null, cx1, "Apertou o botão 1", JOptionPane.PLAIN_MESSAGE);
		}else if(e.getSource() == botao2) {
			if(rad1.isSelected() == true) 
				JOptionPane.showMessageDialog(null, "Beneficiário está vivo :)", "Selecionou vivo", JOptionPane.PLAIN_MESSAGE);
			else if(rad2.isSelected() == true) 
				JOptionPane.showMessageDialog(null, "Beneficiário foi dessa para melhor :(", "Selecionou morto", JOptionPane.PLAIN_MESSAGE);
			else 
				JOptionPane.showMessageDialog(null, "Beneficiário está em superposição", "Selecionou nada", JOptionPane.PLAIN_MESSAGE);		
			
		}else if(e.getSource() == botao3) {
			if(box1.isSelected() == false)  
				JOptionPane.showMessageDialog(null, "Selecione a caixa para sair", "Apertou o botão 3", JOptionPane.PLAIN_MESSAGE);
			else 
				System.exit(0);							
		}
	}

	public static void main(String[] args) {
		new Janela();

	}


	


}
