package aplicacao;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ler {
	
	File file = new File("lista.txt");
	Scanner sc = null;
	private int r=0;
	
	public int allArquivo() {//ler com classe scanner
		r = 0;
		try {
			sc = new Scanner(file);
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
				r=1;
			}
		}catch(IOException e){
			JOptionPane.showMessageDialog(null, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
		}finally {
			if(sc != null) {
				sc.close();
			}
		}
		return r;
	}
	
}
