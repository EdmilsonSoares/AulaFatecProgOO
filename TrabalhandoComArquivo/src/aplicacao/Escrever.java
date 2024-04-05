package aplicacao;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

public class Escrever {
	String path = "D:/lista_de_bruxo.txt";
	Registro reg = new Registro();
	Gerar gerar = new Gerar();
	
	public int inClasse(){
		int r = 0;
		String ident = "";
		
		ident = JOptionPane.showInputDialog(null, "Digite o nome");
		if(ident == null) {
			JOptionPane.showMessageDialog(null, "Cadastro cancelado", "RECUSADO", JOptionPane.WARNING_MESSAGE);
		}else if(ident.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Cadastro cancelado", "RECUSADO", JOptionPane.WARNING_MESSAGE);
		}else {
			reg.setNome(ident);
			ident = gerar.getRandom();
			reg.setId(ident);
			r=1;
		}
		return r;
	}
	
	public void fimArquivo() {
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
				bw.write(reg.getNome() + " ID: " + reg.getId() + "\n");
				//bw.newLine();	
		} catch (IOException e){
			JOptionPane.showMessageDialog(null, e.getMessage() + "\nSaindo...", "ERRO", JOptionPane.ERROR_MESSAGE);
			System.exit(0);	
		}
	}
	public void primeiroContato(String nome, String ID) {
		reg.setNome(nome);
		reg.setId(ID);
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
				bw.write(reg.getNome() + " ID: " + reg.getId() + "\n");
				//bw.newLine();	
		} catch (IOException e){
			JOptionPane.showMessageDialog(null, e.getMessage() + "\nSaindo...", "ERRO", JOptionPane.ERROR_MESSAGE);
			System.exit(0);	
		}
	}
	
}
