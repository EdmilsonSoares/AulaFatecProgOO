package Testes;

import javax.swing.JOptionPane;

public class MetodoMain {

	public static void main(String[] args) {
		Registro reg = new Registro();
		Escrever esc = new Escrever();
		Ler ler = new Ler();
		String text;
		int idade, opc = 0, op = 0;

		do {
			ler.allArquivo();
			text = JOptionPane.showInputDialog(null, "Digite o nome");
			reg.setNome(text);
			text = JOptionPane.showInputDialog(null, "Digite o CPF");
			reg.setCpf(text);
			text = JOptionPane.showInputDialog(null, "Digite a idade");
			idade = Integer.parseInt(text);
			reg.setIdade(idade);
			
			text = JOptionPane.showInputDialog(null, "1 Anexar\n2 Entre linhas");
			opc = Integer.parseInt(text);
			switch (opc) {
			case 1:
				esc.fimArq(reg);
				break;
			case 2:
				text = JOptionPane.showInputDialog(null, "Digite a linha");
				op = Integer.parseInt(text);
				esc.entreLinha(reg, op);
				break;
			}

		} while (opc != 0);

	}

}
