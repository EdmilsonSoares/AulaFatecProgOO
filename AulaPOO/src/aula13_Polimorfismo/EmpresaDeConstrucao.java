package aula13_Polimorfismo;
import javax.swing.JOptionPane;

public class EmpresaDeConstrucao {

	public static void main(String[] args) {
		Construcao pedreiro = null;
		int tipo_construcao;
		
		tipo_construcao = Integer.parseInt(JOptionPane.showInputDialog("Digite tipo de construção:\n1 CASA, 2 APARTAMENTO ou 3 tudo"));
		switch(tipo_construcao) {
		case 1:
			pedreiro = new Casa();
			break;
		case 2:
			pedreiro = new Apartamento();
			break;
		case 3:
			pedreiro = new Construcao();
			break;
		default:
			System.out.println("CONSTRUÇÃO INDEFINIDA");
			System.exit(0);
			break;
		}//fim switch
		
		pedreiro.constroi();

	}

}
