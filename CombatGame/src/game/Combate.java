package game;
import java.util.Scanner;

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
    public boolean marcarCombat(Personagem p1, Personagem p2) {

        if ((p1.getVida() == 0) || (p2.getVida() == 0)) {
            this.setValidar(false);
            System.out.println("Personagens derrotados (zero vida) não podem participar de combates");
            System.out.println(p1.status() + " " + p2.status());
        } else {
            this.setValidar(true);
            System.out.println(p1.getNome() + " VS " + p2.getNome());
        }
        return validar;
    }

    // ==================================================================================================================================
    public void rodada(Personagem p1, Personagem p2) {
        byte rodada = (byte) 1;

        while (p1.getVida() > 0 && p2.getVida() > 0) {
            System.out.println("\n" + rodada + "º Rodada");
            while (p1.getAcao() > 0 || p2.getAcao() > 0) {
                if (p1.getAcao() > 0) {
                    System.out.println("\nCondição dos lutadores.\n" + p1.status() + "\n" + p2.status());
                    turnoAtivo(p1, p2);
                    if (p2.getVida() <= 0)
                        break;
                }
                if (p2.getAcao() > 0) {
                    System.out.println("\nCondição dos lutadores.\n" + p1.status() + "\n" + p2.status());
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
    private int turnoAtivo(Personagem At, Personagem Ps) {
        byte op;
        int result = 0;

        if (At.getAcao() > 0) {
            System.out.println("===================================================================");
            System.out.println(At.getNome() + " Escolha sua ação:\n1 - Realizar ataque\n2 - Mudar modo de combate");
            System.out.println(At.getNome() + " Ações: " + At.getAcao() + " " + Ps.getNome() + " Ações: " + Ps.getAcao());
            System.out.println("===================================================================");
            op = verificaByte((byte) 2);
            At.setAcao(At.getAcao() - 1); // p1 gasta uma ação

            if (op == 1) { // se p1 escolhe atacar
                if (Ps.getAcao() == 0) { // se p2 não tem ações
                    System.out.println(Ps.getNome() + " não tem ações para esquivar! Passando para defesa...");
                    turnoDefesa(At, Ps, result);
                } else { // se p2 tem ações
                    System.out.println("===================================================================");
                    System.out.println(Ps.getNome() + " Escolha sua ação:\n1 - Defender\n2 - Esquivar");
                    System.out.println(At.getNome() + " Ações: " + At.getAcao() + " " + Ps.getNome() + " Ações: " + Ps.getAcao());
                    System.out.println("===================================================================");
                    op = verificaByte((byte) 2);
                    if (op == 1) { // se p2 escolhe defensa
                        turnoDefesa(At, Ps, result);
                    } else { // se p2 escolhe esquiva
                        turnoEsquiva(At, Ps, result);
                    }
                }
            } else { // se p1 escolher alterar modo de luta
                alteraModo(At, op, result);
            }
            result = 1;
        } else {
            result = 0;
        }
        return result;
    }

    // ==================================================================================================================================
    private void alteraModo(Personagem At, byte op, int result) {

        do {
            System.out.println("1 - Posição normal\n2 - Posição de Ataque\n3 - Posição de Defesa");
            op = verificaByte((byte) 3);
            if (At.getModo() == op)
                System.out.println("Voce ja está nesse modo escolha outro");
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
    private void turnoDefesa(Personagem At, Personagem Ps, int result) {
        int dano = 0;
        result = At.getAtq() + 50 - Ps.getDef();
        setRamdomico();
        if (getRamdomico() <= 15) {
            System.out.print("\nRESULTADO: " + At.getNome() + " obteve um acerto crítico.");
            System.out.println(" Porcentagem " + result + "% Valor obtido " + getRamdomico() + "%");
            Ps.setVida(Ps.getVida() - (At.getAtq() * 2));
            System.out.println("Dano = " + (At.getAtq() * 2));

        } else if (getRamdomico() <= result) {
            System.out.print("\nRESULTADO: " + At.getNome() + " acertou o golpe.");
            System.out.println(" Porcentagem " + result + "% Valor obtido " + getRamdomico() + "%");
            Ps.setVida(Ps.getVida() - At.getAtq());
            System.out.println("Dano = " + At.getAtq());

        } else {
            System.out.print("\nRESULTADO: " + At.getNome() + " teve o golpe bloqueado.");
            System.out.println(" Porcentagem " + result + "% Valor obtido " + getRamdomico() + "%");
            dano = At.getAtq() - Ps.getDef();
            if (dano <= 0) {
                System.out.println(Ps.getNome() + " conseguiu bloquear completamente o ataque.");
            } else {
                System.out.println("Dano = " + dano);
                Ps.setVida(Ps.getVida() - dano);
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
        Scanner imput = new Scanner(System.in);
        byte n = 0;
        if (x == 2) {// aceita somente 1 e 2
            while (n < 1 || n > 2) {
                while (!imput.hasNextByte()) {// impedir caracteres indesejados
                    System.out.println("Dado incorreto");
                    imput.next();// Descartar a entrada inválida
                }
                n = imput.nextByte();
                imput.nextLine();// remover enter do buffer
                if (n < 1 || n > 2)
                    System.out.println("Essa opção não existe digite novamente");
            }
        } else if (x == 3) {// aceita somente 1, 2 e 3
            while (n < 1 || n > 3) {
                while (!imput.hasNextByte()) {// impedir caracteres indesejados
                    System.out.println("Dado incorreto");
                    imput.next();// Descartar a entrada inválida
                }
                n = imput.nextByte();
                imput.nextLine();// remover enter do buffer
                if (n < 1 || n > 3)
                    System.out.println("Essa opção não existe digite novamente");
            }
        }
        return n;
    }

}
