package aplicacao;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

public class Escrever {
	String[] ramdo = new String[] {"0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
	String path = "D:/texto2.txt";
	Registro reg = new Registro();
	
	public int inClasse(){
		int i = 0, r = 0;
		String ident = "";
		
		ident = JOptionPane.showInputDialog(null, "Digite o nome");
		if(ident == null) {
			JOptionPane.showMessageDialog(null, "Cadastro cancelado", "RECUSADO", JOptionPane.WARNING_MESSAGE);
		}else if(ident.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Cadastro cancelado", "RECUSADO", JOptionPane.WARNING_MESSAGE);
		}else {
			reg.setNome(ident);
			ident = "";
			for(int n=0; n<10; n++) {
				i = (int) (Math.random() * 36);
				ident += ramdo[i];	
			}
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
	
}
