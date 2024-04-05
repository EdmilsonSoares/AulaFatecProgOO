package aplicacao;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Ler {
	
	File file = new File("D:/texto2.txt");
	Scanner sc = null;
	
	public void allArquivo() {
		try {
			sc = new Scanner(file);
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}catch(IOException e){
			JOptionPane.showMessageDialog(null, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
		}finally {
			if(sc != null) {
				sc.close();
			}
		}
	}
	
}
