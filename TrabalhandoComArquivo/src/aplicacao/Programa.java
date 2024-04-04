package aplicacao;

import java.io.*;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Programa {

	public static void main(String[] args) {
		Check check = new Check();
		Escrever escrever = new Escrever();
		Ler ler = new Ler();
		
	
		int opcao=0;
		
		do {
			opcao = check.inputOpcao();
			switch(opcao) {
			case 1:// Cadastrar
				JOptionPane.showMessageDialog(null, "Entre com o registro", "Novo Registro", JOptionPane.PLAIN_MESSAGE);
				escrever.fimArquivo();
				break;
			case 2://Exibir tudo
				JOptionPane.showMessageDialog(null, "Exibindo registros no terminal", "Exibir Registros", JOptionPane.PLAIN_MESSAGE);
				ler.allArquivo();
				break;
			case 3://Editar
				JOptionPane.showMessageDialog(null, "Digitou " + opcao, "BELEZA", JOptionPane.PLAIN_MESSAGE);
				break;
			case 4://Apagar
				JOptionPane.showMessageDialog(null, "Digitou " + opcao, "BELEZA", JOptionPane.PLAIN_MESSAGE);
				break;
			case 0:
				sair();
				break;
			}
		}while(opcao != 0);


		/*public static void lerArquivo() {
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
		}*/

	}
	
    private static void sair() {
    	JOptionPane.showMessageDialog(null,"","SAINDO",JOptionPane.PLAIN_MESSAGE);
    	System.exit(0); //cancelar e sair
    }

}
