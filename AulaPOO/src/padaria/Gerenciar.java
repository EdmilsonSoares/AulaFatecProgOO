package padaria;
import javax.swing.JOptionPane;

public class Gerenciar {
	static Padaria padaria;

	public static void main(String[] args) {
		
		padaria = new Padaria("Eva Pereira", 50, 0, 2000);
		int opc = 0;

		do {
			JOptionPane.showMessageDialog(null, "Pão " + padaria.getPao() + " Café " + padaria.getCafe() + " ml Caixa " + padaria.getCaixa() + 
					"\nDigite\n 1 gerenciar estoque\n 2 fluxo de caixa\n 3 sair", "PADARIA", JOptionPane.PLAIN_MESSAGE);
			opc = tratarExcessao();
			switch(opc){
			case 1:
				gerenciarEstoque();
				break;
			case 2:
				fluxoCaixa();
				break;
			case 3:
				JOptionPane.showMessageDialog(null, "Saindo...", "SAIR", JOptionPane.ERROR_MESSAGE);
				System.exit(0);
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção inexistente", "ERRO", JOptionPane.ERROR_MESSAGE);
				break;	
			}
		}while(opc != 3);
		
	}//fim metodo main
	
	 private static void gerenciarEstoque() {
		 int num;
		 
		 JOptionPane.showMessageDialog(null, "Digite\n 1 - Pão \n 2 - Café", "GERENCIAR ESTOQUE", JOptionPane.PLAIN_MESSAGE);
		 num = tratarExcessao();
		 switch(num) {
		 case 1:
			 JOptionPane.showMessageDialog(null, "Digite um número para alterar a quantidade, para adicionar digite" +
					 							 "\num número positivo e para reduzir digite um número negativo", 
					 							 "PÃES EM ESTOQUE " + padaria.getPao(), JOptionPane.PLAIN_MESSAGE);
			 num = tratarExcessao();
			 num = padaria.getPao() + num;
			 if(num<0)
				 JOptionPane.showMessageDialog(null, "Operação negada", "ERRO", JOptionPane.ERROR_MESSAGE);
			 else
				 padaria.setPao(num);
			 break;
		 case 2:
			 JOptionPane.showMessageDialog(null, "Digite um número para alterar a quantidade, para adicionar digite" +
						 						 "\num número positivo e para reduzir digite um número negativo", 
						 						 "CAFÉ EM ESTOQUE " + padaria.getCafe() + " ml", JOptionPane.PLAIN_MESSAGE);
			 num = tratarExcessao();
			 num = padaria.getCafe() + num;
			 if(num<0)
				 JOptionPane.showMessageDialog(null, "Operação negada", "ERRO", JOptionPane.ERROR_MESSAGE);
			 else
				 padaria.setCafe(num);
			 break;
		 default:
			 JOptionPane.showMessageDialog(null, "Opção inexistente", "ERRO", JOptionPane.ERROR_MESSAGE);
			 break;	 
		 }		
	 }
	 
	 public static void fluxoCaixa() {
		 int num=0;
		 double valor=0;
		 
			 JOptionPane.showMessageDialog(null, "Digite\n 1 Pão \n 2 Café", "O QUE FOI VENDIDO?", JOptionPane.PLAIN_MESSAGE);
			 num = tratarExcessao();
			 switch(num) {
			 case 1:
				 JOptionPane.showMessageDialog(null, "Vendeu quantos pães?", "", JOptionPane.PLAIN_MESSAGE);
				 num = tratarExcessao();
				 if(num < 1 || num > padaria.getPao())
					 JOptionPane.showMessageDialog(null, "Operação negada", "ERRO", JOptionPane.ERROR_MESSAGE);
				 else {
					 valor = num * 0.25;
					 padaria.setCaixa(padaria.getCaixa() + valor);
					 padaria.setPao(padaria.getPao() - num);
				 }
				 break;
			 case 2:
				 JOptionPane.showMessageDialog(null, "Vendeu quantos ml de café?", "", JOptionPane.PLAIN_MESSAGE);
				 num = tratarExcessao();
				 if(num < 1 || num > padaria.getCafe())
					 JOptionPane.showMessageDialog(null, "Operação negada", "ERRO", JOptionPane.ERROR_MESSAGE);
				 else {
					 valor = num * 0.01;
					 padaria.setCaixa(padaria.getCaixa() + valor);
					 padaria.setCafe(padaria.getCafe() - num);
				 }
				 break;
			 default:
				 JOptionPane.showMessageDialog(null, "Opção inexistente", "ERRO", JOptionPane.ERROR_MESSAGE);
				 break;					 
			 }		 
	 }
	 
	 private static int tratarExcessao() {
	    	int num=0;
	    	String valor;
	    	boolean ValidInput = false;
	    	
	        while(! ValidInput) {
	            valor = JOptionPane.showInputDialog(null, "");
	            if(valor==null)
	            	System.exit(0);
	            try {
	                num = Integer.parseInt(valor);
	                ValidInput = true; // Se chegou até aqui, o input é válido
	            } catch (NumberFormatException e) {
	                JOptionPane.showMessageDialog(null, "Digite um número válido", "ERRO", JOptionPane.ERROR_MESSAGE);
	            }
	        }
	    	return num;
	  }
	
}//fim classe
