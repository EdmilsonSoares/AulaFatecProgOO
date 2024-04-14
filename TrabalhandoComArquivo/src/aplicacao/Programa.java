package aplicacao;
import javax.swing.JOptionPane;

public class Programa {

	public static void main(String[] args) {
		Registro registro = new Registro();
		Escrever escrever = new Escrever();
		Ler ler = new Ler();
		Check check = new Check();
		Gerar gerar = new Gerar();
		int opcao=0, r=0;
		
		if(ler.allArquivo() == 0) {
			registro.setNome("Edmilson");
			registro.setId(gerar.getRandom());
			registro.setBruxo("RED");
			escrever.primeiroContato(registro.getNome(), registro.getId(), registro.getBruxo());
			JOptionPane.showMessageDialog(null, "Nome : " + registro.getNome() 
			+ "\nID: " + registro.getId() + "\nBruxo: " + registro.getBruxo(), "NOVO BRUXO", JOptionPane.PLAIN_MESSAGE);
		}
		
		
		do {
			opcao = check.inputOpcao();
			switch(opcao) {
			case 1://Cadastrar
				r = escrever.inClasse();
				if(r == 1)
					escrever.fimArquivo();
				break;
			case 2://Exibir tudo
				JOptionPane.showMessageDialog(null, "Exibindo registros no terminal", "EXIBIR LISTA", JOptionPane.PLAIN_MESSAGE);
				ler.allArquivo();
				break;
			case 3://Editar
				JOptionPane.showMessageDialog(null, "Em breve", "EDITAR", JOptionPane.PLAIN_MESSAGE);
				break;
			case 4://Apagar
				JOptionPane.showMessageDialog(null, "Em breve", "APAGAR", JOptionPane.PLAIN_MESSAGE);
				break;
			case 0:
				sair();
				break;
			}
		}while(opcao != 0);

	}

	
    private static void sair() {
    	JOptionPane.showMessageDialog(null,"","SAINDO",JOptionPane.PLAIN_MESSAGE);
    	System.exit(0); //cancelar e sair
    }

}
