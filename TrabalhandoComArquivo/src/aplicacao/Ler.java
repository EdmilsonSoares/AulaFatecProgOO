package aplicacao;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

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
			System.out.println("Erro " + e.getMessage());
		}finally {
			if(sc != null) {
				sc.close();
			}
		}
	}
	
}
