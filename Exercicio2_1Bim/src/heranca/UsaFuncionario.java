package heranca;
import javax.swing.JOptionPane;

public class UsaFuncionario {

	public static void main(String[] args) {
		
		Funcionario funcionario = new Funcionario();
		PessoaJuridica func = new PessoaJuridica();
		
		String u, v, t, z;
		int x;
		
		z = JOptionPane.showInputDialog("Digite 1 se contribuinte é pessoa física\nDigite 2 se contribuinte é pessoa jurídica");
		x = Integer.parseInt(z);
		if(z.length() == 1) {
			switch(x) {
			case 1:
				u = JOptionPane.showInputDialog("Nome do contribuinte");
				v = JOptionPane.showInputDialog("RG do contribuinte");
				t = JOptionPane.showInputDialog("Cartão do contribuinte");
				funcionario.setNome(u);
				funcionario.setRg(v);
				funcionario.setCartao(t);
				System.out.println("NOME: " + funcionario.getNome());
				System.out.println("RG: " + funcionario.getRg());
				System.out.println("CARTÂO: " + funcionario.getCartao());
				break;
			case 2:
				u = JOptionPane.showInputDialog("Nome do contribuinte");
				v = JOptionPane.showInputDialog("CNPJ do contribuinte");
				t = JOptionPane.showInputDialog("Cartão do contribuinte");
				funcionario.setNome(u);
				func.setCnpj(v);
				funcionario.setCartao(t);
				System.out.println("NOME: " + funcionario.getNome());
				System.out.println("CNPJ: " + func.getCnpj());
				System.out.println("CARTÂO: " + funcionario.getCartao());
				break;
			}
		}

		
		
	}
}
