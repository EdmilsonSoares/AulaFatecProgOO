package gerenciar_contatos;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;



public class Janela extends JFrame implements ActionListener{
	
	
	JLabel texto1 = new JLabel("Nome");
	JLabel texto2 = new JLabel("Telefone");
	JLabel texto3 = new JLabel("Data nascimento: Dia");
	JLabel texto4 = new JLabel("Mês");
	JLabel texto5 = new JLabel("Ano");
	JTextField caixa1 = new JTextField();
	JTextField caixa2 = new JTextField();
	JTextField caixa3 = new JTextField();
	JTextField caixa4 = new JTextField();
	JTextField caixa5 = new JTextField();
	JButton BTsalv = new JButton("SALVAR");
	JButton BTlist = new JButton("LISTAR");
	JButton BTpesq = new JButton("PESQUISAR");
	JButton BTalte = new JButton("ALTERAR");
	JButton BTexcl = new JButton("EXCLUIR");
	private String nome, telefone, dia, mes, ano;
	
	public Janela() {
		setLayout(new FlowLayout(FlowLayout.LEFT));
		setTitle("Gerenciador de contatos");
		setSize(320,170); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
		//getContentPane().setBackground (new Color (100, 200, 200));
		
		texto1.setFont(new Font("", Font.BOLD, 12));//nome
		texto1.setHorizontalAlignment(SwingConstants.LEFT);
		texto1.setForeground(Color.black);
		texto2.setFont(new Font("", Font.BOLD, 12));//tele
		texto2.setHorizontalAlignment(SwingConstants.LEFT);
		texto2.setForeground(Color.black);
		texto3.setFont(new Font("", Font.BOLD, 12));//dia
		texto3.setHorizontalAlignment(SwingConstants.LEFT);
		texto3.setForeground(Color.black);
		texto4.setFont(new Font("", Font.BOLD, 12));//mes
		texto4.setHorizontalAlignment(SwingConstants.LEFT);
		texto4.setForeground(Color.black);
		texto5.setFont(new Font("", Font.BOLD, 12));//ano
		texto5.setHorizontalAlignment(SwingConstants.LEFT);
		texto5.setForeground(Color.black);
		
		caixa1.setPreferredSize(new Dimension(258, 20));//nome
		caixa2.setPreferredSize(new Dimension(242, 20));//tele
		caixa3.setPreferredSize(new Dimension(27, 20));//dia
		caixa4.setPreferredSize(new Dimension(27, 20));//mes
		caixa5.setPreferredSize(new Dimension(50, 20));//ano
		
		BTsalv.setPreferredSize(new Dimension(95, 20));
		BTsalv.setFont(new Font("", Font.BOLD, 10));
		BTsalv.setForeground(Color.BLUE);
		BTsalv.addActionListener(this);
		BTlist.setPreferredSize(new Dimension(95, 20));
		BTlist.setFont(new Font("", Font.BOLD, 10));
		BTlist.setForeground(Color.BLACK);
		BTlist.addActionListener(this);
		BTpesq.setPreferredSize(new Dimension(95, 20));
		BTpesq.setFont(new Font("", Font.BOLD, 10));
		BTpesq.setForeground(Color.BLACK);
		BTpesq.addActionListener(this);
		BTalte.setPreferredSize(new Dimension(95, 20));
		BTalte.setFont(new Font("", Font.BOLD, 10));
		BTalte.setForeground(Color.BLACK);
		BTalte.addActionListener(this);
		BTexcl.setPreferredSize(new Dimension(95, 20));
		BTexcl.setFont(new Font("", Font.BOLD, 10));
		BTexcl.setForeground(Color.RED);
		BTexcl.addActionListener(this);
		
		getContentPane().add(texto1);
		getContentPane().add(caixa1);
		getContentPane().add(texto2);
		getContentPane().add(caixa2);
		getContentPane().add(texto3);
		getContentPane().add(caixa3);
		getContentPane().add(texto4);
		getContentPane().add(caixa4);
		getContentPane().add(texto5);
		getContentPane().add(caixa5);
		getContentPane().add(BTsalv);
		getContentPane().add(BTlist);
		getContentPane().add(BTpesq);
		getContentPane().add(BTalte);
		getContentPane().add(BTexcl);	
	}//final construct
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Registro reg = new Registro();
		Escrever esc = new Escrever();
		LerArqui ler = new LerArqui();
		Alterar alter = new Alterar();
		
		int num, erro=0;
		
		if(e.getSource() == BTsalv) {
			nome = caixa1.getText();
			telefone = caixa2.getText();
			dia = caixa3.getText();
			mes = caixa4.getText();
			ano = caixa5.getText();
			if(nome.isEmpty() || dia.isEmpty() || mes.isEmpty() || ano.isEmpty()) {
				JOptionPane.showMessageDialog(null,"Dados ausentes", "ERRO", JOptionPane.ERROR_MESSAGE);
			}else {
				reg.setNome(nome);
				reg.setTelefone(telefone);
				if((num = excecoes(dia)) != -1) {
					reg.setDia(num);
				}else {erro += 1;}
				if((num = excecoes(mes)) != -1) {
					reg.setMes(num);
				}else {erro += 1;}	
				if((num = excecoes(ano)) != -1) {
					reg.setAno(num);
				}else {erro += 1;}
				if(erro == 0) {
					caixa1.setText(null);
					caixa2.setText(null);
					caixa3.setText(null);
					caixa4.setText(null);
					caixa5.setText(null);
					esc.fimArq(reg);//chama metodo escrever
					
				}else {
					JOptionPane.showMessageDialog(null, "Digite um número válido", "ERRO", JOptionPane.ERROR_MESSAGE);
				}
			}	
		}else if(e.getSource() == BTlist) {
			ler.allArquivo();
		}else if(e.getSource() == BTpesq) {
			ler.pesquisar();	
		}else if(e.getSource() == BTalte) {
			num = ler.pesquisar();
			if(num != -1) {
				int r = alter.registro(reg);
				if(r==0) {
					esc.entreLinha(reg, num);
					JOptionPane.showMessageDialog(null, "Alteração concluida", "", JOptionPane.WARNING_MESSAGE);
				}	
			}
		}else if(e.getSource() == BTexcl) {
			num = ler.pesquisar();
			if(num != -1) {
				reg.setNome("*");
				reg.setTelefone("0");
				reg.setDia(0);
				reg.setMes(0);
				reg.setAno(0);
				esc.entreLinha(reg, num);
				JOptionPane.showMessageDialog(null, "Contato excluido", "", JOptionPane.WARNING_MESSAGE);
			}	
		}	
	}//fim actionPerformed
	
	private int excecoes(String data) {
		int num = -1;
		 try {
             num = Integer.parseInt(data);
         } catch (NumberFormatException e) {
             //JOptionPane.showMessageDialog(null, "Digite um número válido", "ERRO", JOptionPane.ERROR_MESSAGE);
         }
		return num;
	}
	

}
