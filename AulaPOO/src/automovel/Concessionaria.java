package automovel;
import javax.swing.JOptionPane;

public class Concessionaria {

	public static void main(String[] args) {
		
		Carro car = new Carro();
		String mar, mod, pre, cor;
		double prc;
		
		mar = JOptionPane.showInputDialog("Digite a marca:");
		mod = JOptionPane.showInputDialog("Digite o modelo:");
		cor = JOptionPane.showInputDialog("Digite a cor:");
		pre = JOptionPane.showInputDialog("Digite o preço:");
		prc = Double.parseDouble(pre);
		
		car.setMarca(mar);
		car.setModelo(mod);
		car.setCor(cor);
		car.setPreco(prc);

		car.Informa_Automovel();
	}

}
