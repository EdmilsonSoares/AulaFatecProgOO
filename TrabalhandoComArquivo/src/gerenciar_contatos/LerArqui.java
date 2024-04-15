package gerenciar_contatos;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.StandardCharsets;

import javax.swing.JOptionPane;

public class LerArqui {
	private File file = new File("lista.txt");
	private byte[] bytes = new byte[50];
	private int separador = 6, sizeregistro = 50;
	
	public void allArquivo() {
		int cont = 0;
		String[] vreg;
		String registro;
		try {
			RandomAccessFile rf = new RandomAccessFile(file, "r");
			
			while(rf.read(bytes) != -1) {
				if(bytes[0] != 42) {
					registro = new String(bytes, StandardCharsets.UTF_8);
					vreg = registro.split("_", separador);
					System.out.println("Nome: "+vreg[0]+"  Telefone: "+vreg[1]+"  Nascimento: " +vreg[2]+"/"+vreg[3]+"/"+vreg[4]);
				}
				cont++;
				rf.seek(cont * sizeregistro);
			}
			rf.close();
		}catch(IOException e){
			JOptionPane.showMessageDialog(null, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
		}
		
	}
	
	public int pesquisar() {
		String nome, registro;
		String[] vreg;
		int found = 0, cont = 0;
		
		try {
			RandomAccessFile rf = new RandomAccessFile(file, "r");
			nome = JOptionPane.showInputDialog(null,"Digite o nome");
			while(rf.read(bytes) != -1) {
				if(bytes[0] != 42) {
					registro = new String(bytes, StandardCharsets.UTF_8);
					vreg = registro.split("_", separador);
					if(vreg[0].equalsIgnoreCase(nome)) {
						JOptionPane.showMessageDialog(null, "Nome: " + vreg[0] + 
								"\nTelefone: " + vreg[1] + 
								"\nNascimento: " + vreg[2] + 
								"/" + vreg[3] + "/" + vreg[4], "Contato", JOptionPane.PLAIN_MESSAGE);
						found++;
						break;
					}
				}
				cont++;
				rf.seek(cont * sizeregistro);
			}
			rf.close();
			if(found==0) {
				JOptionPane.showMessageDialog(null, "Nenhum registro encontrado", "", JOptionPane.WARNING_MESSAGE);
				cont = -1;
			}
		}catch(IOException e){
			JOptionPane.showMessageDialog(null, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
			cont = -1;
		}
		return cont;	
	}

}
