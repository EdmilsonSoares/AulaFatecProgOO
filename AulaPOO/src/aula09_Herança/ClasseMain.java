package aula09_Herança;
import javax.swing.JOptionPane;

public class ClasseMain {

	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario();
		PessoaJuridica juridica = new PessoaJuridica();
		String u, v, t, z;
		int x;
		
		z = JOptionPane.showInputDialog("Digite:\n1 Contribuinte pessoa fisica\n2 Contribuinte pessoa jurídica");
		x = Integer.parseInt(z);
		if(z.length() == 1) {
			switch(x) {
			case 1:
				u = JOptionPane.showInputDialog("Digite o nome do contribuinte");
				v = JOptionPane.showInputDialog("Digite o RG do contribuinte");
				t = JOptionPane.showInputDialog("Digite o cartão do contribuinte");
				funcionario.setNome(u);
				funcionario.setRG(v);
				funcionario.setCartao(t);
				System.out.println("NOME: " + funcionario.getNome());
				System.out.println("RG: " + funcionario.getRG());
				System.out.println("Cartão: " + funcionario.getCartao());
				break;
			case 2:
				u = JOptionPane.showInputDialog("Digite o nome do contribuinte");
				v = JOptionPane.showInputDialog("Digite o CNPJ do contribuinte");	
				juridica.setNome(u);
				juridica.setCNPJ(v);
				System.out.println("NOME: " + juridica.getNome());
				System.out.println("CNPJ: " + juridica.getCNPJ());
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção Inexistente", "ERRO", JOptionPane.ERROR_MESSAGE);
				break;
			}
		}else {
			JOptionPane.showMessageDialog(null, "Opção Inexistente", "ERRO", JOptionPane.ERROR_MESSAGE);
		}
	}//fim main

}
