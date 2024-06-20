package game;
import javax.swing.JOptionPane;

public class StartCombat {
    public static void main(String[] args) {
        String vencedor = " ";
        Personagem persona[] = new Personagem[2];
        
        
        //persona[0].customizar(persona[0]);
        persona[0] = Personagem.customizar();//não posso fazer essa atribuição se não mudar o customizar para static
        JOptionPane.showMessageDialog(null, persona[0].status(),"Personagem construido",JOptionPane.PLAIN_MESSAGE);
        
        persona[1] = Personagem.customizar();//não posso fazer essa atribuição se não mudar o customizar para static
        JOptionPane.showMessageDialog(null, persona[1].status(),"Personagem construido",JOptionPane.PLAIN_MESSAGE);

        Combate luta = new Combate();
        int b = (int) (Math.random() * 2);
        if (b == 0) {
            luta.rodada(persona[0], persona[1]);
        } else {
            luta.rodada(persona[1], persona[0]);
        }

        
        if (persona[0].getVida() > 0 && persona[1].getVida() < 1)
            vencedor = persona[0].getNome();
        if (persona[1].getVida() > 0 && persona[0].getVida() < 1)
            vencedor = persona[1].getNome();

        JOptionPane.showMessageDialog(null, "O combate terminou com " + vencedor + " sendo vencedor!!!\n" + 
        		persona[0].getNome() + " HP " + persona[0].getVida() + "\n" +
        		persona[1].getNome() + " HP " + persona[1].getVida(), 
        		"FIM DE JOGO",JOptionPane.PLAIN_MESSAGE);
 
    }

    // ===========================================================================================================================

}
