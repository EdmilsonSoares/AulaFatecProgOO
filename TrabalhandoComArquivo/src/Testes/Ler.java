package Testes;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import javax.swing.JOptionPane;

public class Ler {
	
	public void allArquivo() {
		File file = new File("teste.txt");
		int cont = 0;
		
		try {
			RandomAccessFile rf = new RandomAccessFile(file, "r");
			byte[] bytes = new byte[30];
			
			
			rf.read(bytes);
			while(rf.read(bytes) != 0) {
				System.out.println(new String(bytes));
				cont++;
				rf.seek(cont*30);
			}
			
			//System.out.println(new String(bytes));
			rf.close();
		}catch(IOException e){
			JOptionPane.showMessageDialog(null, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
		}
		
	}

}
