package game;
import javax.swing.JOptionPane;

public class Combate {
	private Personagem p1;
	private Personagem p2;
	private boolean validar;
	private int ramdomico;

	public Personagem getP1() {
		return p1;
	}

	public Personagem getP2() {
		return p2;
	}

	public boolean isValidar() {
		return validar;
	}

	public int getRamdomico() {
		return ramdomico;
	}

	public void setP1(Personagem p1) {
		this.p1 = p1;
	}

	public void setP2(Personagem p2) {
		this.p2 = p2;
	}

	public void setValidar(boolean validar) {
		this.validar = validar;
	}

	public void setRamdomico() {
		this.ramdomico = (int) (Math.random() * 100);// De 0 a 99
	}

// ==================================================================================================================================
	public void rodada(Personagem p1, Personagem p2) {
		byte rodada = (byte) 1;

		while (p1.getVida() > 0 && p2.getVida() > 0) {//laço do jogo
			JOptionPane.showMessageDialog(null, "Cada rodada só termina quando todos jogadores\ntiverem esgotado suas ações", rodada + "º Rodada", JOptionPane.PLAIN_MESSAGE);
			while (p1.getAcao() > 0 || p2.getAcao() > 0) {//laço da rodada
				if (p1.getAcao() > 0) {//turno do jogador 1
					JOptionPane.showMessageDialog(null, p1.status() + "\n\n" + p2.status(), "Condição dos Lutadores",JOptionPane.PLAIN_MESSAGE);
					turnoAtivo(p1, p2);
					if (p2.getVida() <= 0)
						break;
				}
				if (p2.getAcao() > 0) {//turno do jogador 2
					JOptionPane.showMessageDialog(null, p1.status() + "\n\n" + p2.status(), "Condição dos Lutadores",JOptionPane.PLAIN_MESSAGE);
					turnoAtivo(p2, p1);
					if (p1.getVida() <= 0)
						break;
				}
			}
			p1.setAcao(5);
			p2.setAcao(5);
			rodada++;
		}
	}

	// ==================================================================================================================================
	private int turnoAtivo(Personagem Ativo, Personagem Passivo) {
		byte op;
		int result = 0;

		if (Ativo.getAcao() > 0) {
			JOptionPane.showMessageDialog(null,"1 - Realizar ataque\n2 - Mudar modo de combate\n\n" + 
					Ativo.getNome() + " Ações: " + Ativo.getAcao() + "\n" + 
					Passivo.getNome() + " Ações: " + Passivo.getAcao(),
					Ativo.getNome() + " Escolha sua ação", JOptionPane.PLAIN_MESSAGE);

			op = verificaByte((byte) 1);
			Ativo.setAcao(Ativo.getAcao() - 1); // p1 gasta uma ação

			if (op == 1) { // se p1 escolhe 1 atacar
				if (Passivo.getAcao() == 0) { // se p2 não tem ações
					System.out.println(Passivo.getNome() + " não tem ações para esquivar! Passando para defesa...");
					turnoDefesa(Ativo, Passivo, result);
				} else { // se p2 tem ações
					
					JOptionPane.showMessageDialog(null,"1 - Defender\n2 - Esquivar\n\n" + 
							Ativo.getNome() + " Ações: " + Ativo.getAcao() + "\n" + 
							Passivo.getNome() + " Ações: " + Passivo.getAcao(),
							Passivo.getNome() + " Escolha sua ação", JOptionPane.PLAIN_MESSAGE);
					
					op = verificaByte((byte) 2);
					if (op == 1) { // se p2 escolhe defensa
						turnoDefesa(Ativo, Passivo, result);
					} else { // se p2 escolhe esquiva
						turnoEsquiva(Ativo, Passivo, result);
					}
				}
			} else { // se p1 escolher 2 alterar modo de luta
				alteraModo(Ativo);
			}
			result = 1;
		} else {// se ativo não tem ação
			result = 0;
		}
		return result;
	}

	// ==================================================================================================================================
	private void alteraModo(Personagem At) {
		int result=0;
		byte op=0;

		do {
			op = verificaByte((byte) 3);
			if (At.getModo() == op)
				JOptionPane.showMessageDialog(null, "Voce ja está nesse modo escolha outro");
		} while (At.getModo() == op);

		switch (op) {
		case 1:
			At.setModo(op); // muda para "1" modo normal
			At.setPosicao("Posição Normal");
			At.setAtq(At.getAtqbase());
			At.setDef(At.getDefbase());
			At.setEsq(At.getEsqbase());
			break;
		case 2:
			At.setModo(op); // muda para "2" modo ataque
			At.setPosicao("Posição de Ataque");
			result = (At.getDefbase() + At.getEsqbase()) / 2;
			At.setAtq(At.getAtqbase() + result);
			At.setDef(At.getDefbase() / 2);
			At.setEsq(At.getEsqbase() / 2);
			// System.out.println(At.status());
			break;
		case 3:
			At.setModo(op); // muda para "3" modo defensivo
			At.setPosicao("Posição de Defesa");
			result = (At.getAtqbase() / 2) / 2;
			At.setDef(At.getDefbase() + result);
			At.setEsq(At.getEsqbase() + result);
			At.setAtq(At.getAtqbase() / 2);
			// System.out.println(At.status());
			break;
		}
	}

	// =================================================================================================================================
	private void turnoDefesa(Personagem Ativo, Personagem Passivo, int result) {
		int dano = 0;
		result = Ativo.getAtq() + 50 - Passivo.getDef();
		setRamdomico();
		if (getRamdomico() <= 15) {
			Passivo.setVida(Passivo.getVida() - (Ativo.getAtq() * 2));//dano
			JOptionPane.showMessageDialog(null, "RESULTADO:\n" + Ativo.getNome() + " obteve um acerto crítico\n" + 
			"Chance de acerto " + result + "% Valor obtido " + getRamdomico() + "\n" +
			Ativo.getNome() + " ATQ: " + Ativo.getAtq() + 
			"\nDano causado = " + (Ativo.getAtq() * 2) );
			
		} else if (getRamdomico() <= result) {
			Passivo.setVida(Passivo.getVida() - Ativo.getAtq());//dano
			JOptionPane.showMessageDialog(null, "RESULTADO:\n" +  Ativo.getNome() + " acertou o golpe\n" + 
			"Chance de acerto " + result + "% Valor obtido " + getRamdomico() + "\n" +
			Ativo.getNome() + " ATQ: " + Ativo.getAtq() + 
			"\nDano causado = " + Ativo.getAtq() );

		} else {
			dano = Ativo.getAtq() - Passivo.getDef();//cálculo da defesa
			if (dano <= 0) {
				JOptionPane.showMessageDialog(null, "RESULTADO:\n" + Ativo.getNome() + 
						" teve o golpe bloqueado e o dano zerado pela defesa do inimigo" + 
						"\nChance de acerto " + result + "% Valor obtido " + getRamdomico() + "\n" +
						Ativo.getNome() + " ATQ: " + Ativo.getAtq() + "\n" +
						Passivo.getNome() + " DEF: " + Passivo.getDef());
				
			} else {
				Passivo.setVida(Passivo.getVida() - dano);//dano
				JOptionPane.showMessageDialog(null, "RESULTADO:\n" + Ativo.getNome() + 
						" teve o golpe bloqueado e o dano reduzido pela defesa do inimigo" + 
						"\nChance de acerto " + result + "% Valor obtido " + getRamdomico() + "\n" +
						Ativo.getNome() + " ATQ: " + Ativo.getAtq() + "\n" +
						Passivo.getNome() + " DEF: " + Passivo.getDef() +
						"\nDano causado = " + dano);
			}
		}
	}

	// ==================================================================================================================================
	private void turnoEsquiva(Personagem At, Personagem Ps, int result) {
		Ps.setAcao(Ps.getAcao() - 1); // p2 gasta uma ação
		result = At.getAtq() + 50 - Ps.getEsq();
		setRamdomico();
		if (getRamdomico() <= 15) {
			System.out.print("\nRESULTADO: " + At.getNome() + " obteve um acerto crítico.");
			System.out.println(" Porcentagem de ataque " + result + "% Valor obtido " + getRamdomico() + "%");
			Ps.setVida(Ps.getVida() - (At.getAtq() * 2));
			System.out.println("Dano = " + (At.getAtq() * 2));

		} else if (getRamdomico() <= result) {
			System.out.print("\nRESULTADO: " + At.getNome() + " acertou o golpe.");
			System.out.println(" Porcentagem de ataque " + result + "% Valor obtido " + getRamdomico() + "%");
			Ps.setVida(Ps.getVida() - At.getAtq());
			System.out.println("Dano = " + At.getAtq());

		} else {
			System.out.print("\nRESULTADO: " + Ps.getNome() + " esquivou e não sofre dano.");
			System.out.println(" Porcentagem de ataque " + result + "% Valor obtido " + getRamdomico() + "%");
		}
	}

	// ==================================================================================================================================
	private static byte verificaByte(byte x) {
		
		boolean ValidInput = false;
		String valor;
		byte op = 0;

		if(x == 1) {
			while (!ValidInput) {
				valor = JOptionPane.showInputDialog(null, "1 - Realizar ataque\n2 - Mudar modo de combate");
				if (valor == null)
					System.exit(0);
				try {
					op = Byte.parseByte(valor);
					if (op < 1 || op > 2)
						JOptionPane.showMessageDialog(null, "Essa opção não existe");
					else
						ValidInput = true;
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Digite um número válido");
				}
			}	
		}else if (x == 2) {
			while (!ValidInput) {
				valor = JOptionPane.showInputDialog(null, "1 - Defender\n2 - Esquivar");
				if (valor == null)
					System.exit(0);
				try {
					op = Byte.parseByte(valor);
					if (op < 1 || op > 2)
						JOptionPane.showMessageDialog(null, "Essa opção não existe");
					else
						ValidInput = true;
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Digite um número válido");
				}
			}
		} else if (x == 3) {
			while (!ValidInput) {
				valor = JOptionPane.showInputDialog(null, "1 - Posição normal\n2 - Posição de Ataque\n3 - Posição de Defesa");
				if (valor == null)
					System.exit(0);
				try {
					op = Byte.parseByte(valor);
					if (op < 1 || op > 3)
						JOptionPane.showMessageDialog(null, "Essa opção não existe");
					else
						ValidInput = true;
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "Digite um número válido");
				}
			}			
		}
		return op;
	}

}
