package aplicacao;
import java.io.*;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		String[] texto = new String[] {"Linha 10","Linha 20","Linha 30\n"};
		String path = "D:/texto2.txt";
		
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
// ler arquivo		
		File file = new File("D:/texto2.txt");
		Scanner sc = null;
		
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
