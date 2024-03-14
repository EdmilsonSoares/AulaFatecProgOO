package exercicio;
import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		PlanoDeEnsino plano1 = new PlanoDeEnsino();
		PlanoDeEnsino plano2 = new PlanoDeEnsino();
		PlanoDeEnsino plano3 = new PlanoDeEnsino();
		PlanoDeEnsino plano4 = new PlanoDeEnsino();
		PlanoDeEnsino plano5 = new PlanoDeEnsino();

		String mat, con, cri, bib, opc;
		int op=0, op1=0, op2=0;

		do {
			opc = JOptionPane.showInputDialog(null, "Digite\n1: Verificar plano de ensino\n2: Mostrar detalhes\n3: Entrada de dados\n4: Sair");
			op = Integer.parseInt(opc);
			switch(op) {
			case 1:
				JOptionPane.showMessageDialog(null, "Plano de ensino 1: " + plano1.getMateria() + 
						"\nPlano de ensino 2: " + plano2.getMateria() + 
						"\nPlano de ensino 3: " + plano3.getMateria() + 
						"\nPlano de ensino 4: " + plano4.getMateria() + 
						"\nPlano de ensino 5: " + plano5.getMateria());
				break;
			case 2:
				opc = JOptionPane.showInputDialog(null, "Visualizar qual plano de ensino, 1, 2, 3, 4 ou 5?");
				op1 = Integer.parseInt(opc);
				switch(op1) {
				case 1: plano1.InformaPlano();
					break;
				case 2: plano2.InformaPlano();
					break;
				case 3: plano3.InformaPlano();
					break;
				case 4: plano4.InformaPlano();
					break;
				case 5: plano5.InformaPlano();
					break;
				default: JOptionPane.showMessageDialog(null,"Nenhum plano de ensino selecionado","ERRO!",JOptionPane.PLAIN_MESSAGE);
					break;
				}
			break;
			
			case 3:
				opc = JOptionPane.showInputDialog(null, "Qual plano de ensino alterar?" + 
						"\nPlano de ensino 1: " + plano1.getMateria() + 
						"\nPlano de ensino 2: " + plano2.getMateria() + 
						"\nPlano de ensino 3: " + plano3.getMateria() + 
						"\nPlano de ensino 4: " + plano4.getMateria() + 
						"\nPlano de ensino 5: " + plano5.getMateria());
				op2 = Integer.parseInt(opc);
				if(op2 < 1 || op2 > 5) {
					JOptionPane.showMessageDialog(null,"Nenhum plano de ensino selecionado","ERRO!",JOptionPane.PLAIN_MESSAGE);
					continue;
				}
				mat = JOptionPane.showInputDialog("Digite a matéria");
				con = JOptionPane.showInputDialog("Digite o conteúdo programático");
				cri = JOptionPane.showInputDialog("Digite o critério de avaliação");
				bib = JOptionPane.showInputDialog("Digite a bibliografia");
				
				switch(op2) {
				case 1:
					plano1.setMateria(mat);
					plano1.setConteudo(con);
					plano1.setCriterio(cri);
					plano1.setBibliografia(bib);
					break;
				case 2:
					plano2.setMateria(mat);
					plano2.setConteudo(con);
					plano2.setCriterio(cri);
					plano2.setBibliografia(bib);
					break;
				case 3:
					plano3.setMateria(mat);
					plano3.setConteudo(con);
					plano3.setCriterio(cri);
					plano3.setBibliografia(bib);
					break;
				case 4:
					plano4.setMateria(mat);
					plano4.setConteudo(con);
					plano4.setCriterio(cri);
					plano4.setBibliografia(bib);
					break;
				case 5:
					plano5.setMateria(mat);
					plano5.setConteudo(con);
					plano5.setCriterio(cri);
					plano5.setBibliografia(bib);
					break;
				default: JOptionPane.showMessageDialog(null,"Nenhum plano de ensino selecionado","ERRO!",JOptionPane.PLAIN_MESSAGE);
					break;		
				}
			break;
			
			case 4: JOptionPane.showMessageDialog(null,null,"SAINDO",JOptionPane.PLAIN_MESSAGE);
			break;
			}
			
		} while (op != 4);
	}
}
