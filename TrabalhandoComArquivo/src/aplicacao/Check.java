package aplicacao;
import javax.swing.JOptionPane;

public class Check {
	private String op = "";
	private int opcao = 0;
	private boolean valid = false;
	
	public int inputOpcao () {
		valid = false;
		while(! valid) {
            op = JOptionPane.showInputDialog(null, "Digite\n 1 cadastrar novo bruxo\n 2 mostrar lista de bruxos\n 3 editar bruxo\n 4 apagar bruxo\n 0 sair");
            if(op==null)
            	System.exit(0);
            try {
                opcao = Integer.parseInt(op);
                if(opcao < 0 || opcao > 4) 
                	JOptionPane.showMessageDialog(null, "Digite um número dentro da faixa de valores", "ERRO", JOptionPane.ERROR_MESSAGE);
                else 
                	valid = true; // Se chegou até aqui, o input é válido
                
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Digite um número válido", "ERRO", JOptionPane.ERROR_MESSAGE);
            }
        }
		return opcao;
	}

}
