package aula03_Contribuinte;
import javax.swing.JOptionPane;

public class Informa_Dados {

	public static void main(String[] args) {
		
		Dados_Contribuinte contri = new Dados_Contribuinte();
		String nome, cpf, cnpj, cart;
		
		JOptionPane.showMessageDialog(null,"Digite os dados do contribuinte");
		//entrada de dados
		nome = JOptionPane.showInputDialog("Digite o nome:");
		cpf = JOptionPane.showInputDialog("Digite o CPF:");
		cnpj = JOptionPane.showInputDialog("Digite o CNPJ:");
		cart = JOptionPane.showInputDialog("Digite o cartão:");
		
		contri.setNome(nome);
		contri.setCpf(cpf);
		contri.setCnpj(cnpj);
		contri.setCartao(cart);
		
		System.out.println("Nome do contribuinte: " + contri.getNome());
		System.out.println("CPF do contribuinte: " + contri.getCpf());
		System.out.println("CNPJ do contribuinte: " + contri.getCnpj());
		System.out.println("Cartão do contribuinte: " + contri.getCartao());

	}

}
