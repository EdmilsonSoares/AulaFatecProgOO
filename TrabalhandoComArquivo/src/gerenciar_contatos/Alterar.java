package gerenciar_contatos;

import javax.swing.JOptionPane;

public class Alterar {
	
	public int registro(Registro reg) {
		String nome, telefone, dia, mes, ano;
		int num = 0, erro = 0, r = 0;
		
		nome = JOptionPane.showInputDialog(null, "Alterar: Digite o nome");
		telefone = JOptionPane.showInputDialog(null, "Alterar: Digite o número de telefone");
		dia = JOptionPane.showInputDialog(null, "Alterar: Digite o dia de nascimento");
		mes = JOptionPane.showInputDialog(null, "Alterar: Digite o mês de nascimento");
		ano = JOptionPane.showInputDialog(null, "Alterar: Digite o ano de nascimento");
		
		if(nome == null || telefone== null) {
			JOptionPane.showMessageDialog(null, "Alteração cancelada", "RECUSADO", JOptionPane.WARNING_MESSAGE);
			r = -1;
		}else if(nome.isEmpty() || telefone.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Alteração cancelada", "RECUSADO", JOptionPane.WARNING_MESSAGE);
			r = -1;
		}else {
			reg.setNome(nome);
			reg.setTelefone(telefone);
			if((num = excessoes(dia)) != -1) {
				reg.setDia(num);
			}else {erro += 1;}
			if((num = excessoes(mes)) != -1) {
				reg.setMes(num);
			}else {erro += 1;}
			if((num = excessoes(ano)) != -1) {
				reg.setAno(num);
			}else {erro += 1;}
			if(erro > 0) {
				JOptionPane.showMessageDialog(null, "Alteração cancelada", "RECUSADO", JOptionPane.WARNING_MESSAGE);
				r = -1;
			}				
		}
		return r;
	}
	
	private int excessoes(String data) {
		int num = -1;
		 try {
             num = Integer.parseInt(data);
         } catch (NumberFormatException e) {
             //JOptionPane.showMessageDialog(null, "Digite um número válido", "ERRO", JOptionPane.ERROR_MESSAGE);
         }
		return num;
	}
	
	

}
