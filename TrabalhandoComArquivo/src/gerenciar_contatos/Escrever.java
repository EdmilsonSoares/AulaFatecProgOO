package gerenciar_contatos;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;

import javax.swing.JOptionPane;

public class Escrever {
	private String texto;
	private int sizeregistro = 50;
	
	public void fimArq(Registro reg) {
		File file = new File("lista.txt");		
		try{
			FileWriter fw = new FileWriter(file, true);//não passa daqui se houver erro
			BufferedWriter bw = new BufferedWriter(fw);
			texto = String.format("%-50s", reg.toString());
			bw.write(texto);
			bw.close();
		} catch (IOException e){
			JOptionPane.showMessageDialog(null, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
		}
	}//final fimArq
	
	public void entreLinha(Registro reg, int linhalvo) {
		File file = new File("lista.txt");
		long position;
		try {
            RandomAccessFile rf = new RandomAccessFile(file, "rw");
            position = sizeregistro * linhalvo;
            rf.seek(position);
            texto = String.format("%-50s", reg.toString());
            rf.write(texto.getBytes());
            rf.close();
        } catch (IOException e) {
        	JOptionPane.showMessageDialog(null, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }	
	}

}
