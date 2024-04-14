package Testes;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;

import javax.swing.JOptionPane;

public class Escrever {
	private String nome;
	private String cpf;
	private String idade;
	
	public void fimArq(Registro reg) {
		File file = new File("teste.txt");
		
		try{
			/*RandomAccessFile rf = new RandomAccessFile(file, "rw");
			rf.seek(rf.length());
			nome = String.format("%-10s", reg.getNome());
			cpf = String.format("%-10s", reg.getCpf());
			idade = String.format("%-10s", reg.getIdade());
			rf.write(nome.getBytes()); 
            rf.write(cpf.getBytes());
            //idade = String.valueOf(reg.getIdade());
            rf.write(idade.getBytes());
            rf.close();*/
			//=====================================================================================
			FileWriter fw = new FileWriter(file, true);//não passa daqui se houver erro
			BufferedWriter bw = new BufferedWriter(fw);
			nome = String.format("%-10s", reg.getNome());
			cpf = String.format("%-10s", reg.getCpf());
			idade = String.format("%-10s", reg.getIdade());
			bw.write(nome);
			bw.write(cpf);
			//idade = String.valueOf(reg.getIdade());
			bw.write(idade);
			bw.close();
		} catch (IOException e){
			JOptionPane.showMessageDialog(null, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
		}
	}//final fimArq
	
	public void entreLinha(Registro reg, int linhalvo) {
		File file = new File("teste.txt");
		long position;
		//int cont;
		
		try {
            RandomAccessFile rf = new RandomAccessFile(file, "rw");
            //cont = 0;
            //String line;
 
            /*while ((line = rf.readLine()) != null) {
                cont++;
                if (linhalvo == cont) { 
                    position = rf.getFilePointer() - line.length() ; // -1 para o caractere de nova linha
                    rf.seek(position);
                    break;
                }
            }*/
            position = 30 * linhalvo;
            rf.seek(position);
            nome = String.format("%-10s", reg.getNome());
            cpf = String.format("%-10s", reg.getCpf());
            idade = String.format("%-10s", reg.getIdade());
            rf.write(nome.getBytes()); 
            rf.write(cpf.getBytes());
            //idade = String.valueOf(reg.getIdade());
            rf.write(idade.getBytes());
            rf.close();
        } catch (IOException e) {
        	JOptionPane.showMessageDialog(null, e.getMessage(), "ERRO", JOptionPane.ERROR_MESSAGE);
        }
		
	}

}
