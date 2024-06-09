package Exercicio03;
import javax.swing.JOptionPane;

public class ClasseMain {

	public static void main(String[] args) {
		AcademiaEsporte academia = null;
		int n; String s;
		
		s = JOptionPane.showInputDialog("Digite\n1 - Artes Marciais\n2 - Corrida\n3 - Boxe\n4 - Musculação");
		n = Integer.parseInt(s);
		switch(n) {
		case 1:
			academia = new AcademiaEsporte("Artes Marciais", 2);
			break;
		case 2:
			academia = new AcademiaEsporte("Corrida", 1);
			break;
		case 3:
			academia = new AcademiaEsporte("Boxe", 3);
			break;
		case 4:
			academia = new AcademiaEsporte("Musculação", 4);
			break;
		}
		
		if(academia != null) {
			System.out.println(academia.exercicio()); 
			System.out.println(academia.musica()); 
		}

	}//final Main

}
