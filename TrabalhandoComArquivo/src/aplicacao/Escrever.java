package aplicacao;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

public class Escrever {
	Registro reg = new Registro();
	Gerar gerar = new Gerar();
	File file = new File("lista.txt");
	
	
	public int inClasse(){
		int r = 0;
		String identN = "";
		String identB = "";
		
		identN = JOptionPane.showInputDialog(null, "Digite o nome");
		identB = JOptionPane.showInputDialog(null, "Digite o nome de bruxo");
		if(identN == null || identB == null) {
			JOptionPane.showMessageDialog(null, "Cadastro cancelado", "RECUSADO", JOptionPane.WARNING_MESSAGE);
		}else if(identN.isEmpty() || identB.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Cadastro cancelado", "RECUSADO", JOptionPane.WARNING_MESSAGE);
		}else {
			reg.setNome(identN);
			reg.setBruxo(identB);
			identN = gerar.getRandom();
			reg.setId(identN);
			r=1;
		}
		return r;
	}
	
	public void fimArquivo() {
		
		try{
			FileWriter fw = new FileWriter(file, true);//não passa daqui se houver erro
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(reg.getNome() + " ID: " + reg.getId() + " Bruxo: " + reg.getBruxo());
			bw.newLine();
			bw.close();
					
		} catch (IOException e){
			JOptionPane.showMessageDialog(null, e.getMessage() + "\nSaindo...", "ERRO", JOptionPane.ERROR_MESSAGE);
			System.exit(0);	
		}
	}
	public void primeiroContato(String nome, String ID, String bruxo) {
		reg.setNome(nome);
		reg.setId(ID);
		reg.setBruxo(bruxo);
		
		try{
			FileWriter fw = new FileWriter(file, true);//não passa daqui se houver erro
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(reg.getNome() + " ID: " + reg.getId() + " Bruxo: " + reg.getBruxo());
			bw.newLine();
			bw.close();
		} catch (IOException e){
			JOptionPane.showMessageDialog(null, e.getMessage() + "\nSaindo...", "ERRO", JOptionPane.ERROR_MESSAGE);
			System.exit(0);	
		}
	}
	
}
