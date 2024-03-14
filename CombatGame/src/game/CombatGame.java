package game;

public class CombatGame {
    public static void main(String[] args) {
        String vencedor = " ";
        Personagem persona[] = new Personagem[2];
        

        persona[0] = Personagem.customizar(persona[0]);
        System.out.println(persona[0].status());
        persona[1] = Personagem.customizar(persona[1]);

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

        System.out.println("O combate terminou com " + vencedor + " sendo o vencedor!!!");
        System.out.println(persona[0].getNome() + " Vida " + persona[0].getVida());
        System.out.println(persona[1].getNome() + " Vida " + persona[1].getVida());

       
    }

    // ===========================================================================================================================

}
