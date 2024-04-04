package aplicacao;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Escrever {
	String[] texto = new String[] {"Linha 10","Linha 20","Linha 30\n"};
	String path = "D:/texto2.txt";
	
	public void fimArquivo() {
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
			for(String linha : texto) {
				bw.write(linha + "\n");
				//bw.newLine();	
			}
			System.out.println("Programa iniciado com sucesso");
		} catch (IOException e){
			System.out.println("Ocorreu um erro " + e.getMessage() + "\nSaindo...");
			System.exit(0);
			//e.printStackTrace();	
		}
	}
	
}
