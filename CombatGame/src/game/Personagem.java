package game;
import javax.swing.JOptionPane;

public class Personagem {

    private String nome;
    private int vida;// pode ser alterado
    private int acao;// pode ser alterado
    private byte modo; // posição de combate
    private String posicao;
    private int atqbase;
    private int defbase;
    private int esqbase;
    private int atq;// pode ser alterado
    private int def;// pode ser alterado
    private int esq;// pode ser alterado

    public Personagem() {
    }
    
    public Personagem(String nom, int atq, int def, int esq) {
        this.setNome(nom);
        this.setVida(200);
        this.setAcao(5);
        this.setModo((byte) 1);
        this.setPosicao("Posição Normal");
        this.setAtqbase(atq);
        this.setDefbase(def);
        this.setEsqbase(esq);
        this.setAtq(atq);
        this.setDef(def);
        this.setEsq(esq);
    }

    public String getNome() {
        return nome;
    }
    public int getVida() {
        return vida;
    }
    public int getAcao() {
        return acao;
    }
    public byte getModo() {
        return modo;
    }
    public String getPosicao() {
        return posicao;
    }
    public int getAtqbase() {
        return atqbase;
    }
    public int getDefbase() {
        return defbase;
    }
    public int getEsqbase() {
        return esqbase;
    }
    public int getAtq() {
        return atq;
    }
    public int getDef() {
        return def;
    }
    public int getEsq() {
        return esq;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setAcao(int acao) {
        this.acao = acao;
    }

    public void setModo(byte modo) {
        this.modo = modo;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    private void setAtqbase(int atqbase) {
        this.atqbase = atqbase;
    }

    private void setDefbase(int defbase) {
        this.defbase = defbase;
    }

    private void setEsqbase(int esqbase) {
        this.esqbase = esqbase;
    }

    public void setAtq(int atq) {
        this.atq = atq;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public void setEsq(int esq) {
        this.esq = esq;
    }
    //mostrar estado do personagem
    public String status() {

        StringBuilder stb = new StringBuilder();
        stb.append("" + this.getNome());
        stb.append(" HP: " + this.getVida());
        stb.append("\nATAQUE: " + this.getAtq());
        stb.append("\nDEFESA: " + this.getDef());
        stb.append("\nESQUIVA: " + this.getEsq());
        stb.append("\nAÇÕES: " + this.getAcao());
        stb.append("\n" + this.getPosicao());
        return stb.toString();
    }

    public static Personagem customizar() {

        String n, valor;
        byte vez = 0;
        int atq = 0, def = 0, esq = 0, total = 0, sub = 0, op = 0;
        boolean max = false, min = false, ValidInput = false;

        n = JOptionPane.showInputDialog(null, "CRIAR PERSONAGEM\nInsira o nome do personagem");
        if(n==null) 
        	sair();	
        JOptionPane.showMessageDialog(null,"Voce tem 100 pontos para distribuir entre ataque, defesa e esquiva\n" + 
        "Nenhum desses atributos pode ficar com menos de 15 pontos","CRIAR PERSONAGEM",JOptionPane.PLAIN_MESSAGE);


        do {
        	
        	ValidInput = false;
            while(! ValidInput) {
                valor = JOptionPane.showInputDialog(null, "Digite\n1 - Ajustar o ataque: ATQ = " + atq + 
            			"\n2 - Ajustar a defesa: DEF = " + def + "\n3 - Ajustar a esquiva: ESQ = " + esq );
                if(valor==null)
                	sair();
                try {
                    op = Integer.parseInt(valor);
                    ValidInput = true; // Se chegou até aqui, o input é válido
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Digite um número válido", "ERRO", JOptionPane.ERROR_MESSAGE);
                }
            }


            switch (op) {
                case 1:
                    atq = ajustAtrib(max, min, atq);
                    vez++;
                    break;
                case 2:
                    def = ajustAtrib(max, min, def);
                    vez++;
                    break;
                case 3:
                    esq = ajustAtrib(max, min, esq);
                    vez++;
                    break;
                default:
                	JOptionPane.showMessageDialog(null, "Opção Inválida", "RECUSADO", JOptionPane.WARNING_MESSAGE);
                    break;
            }
            total = atq + def + esq;
            sub = 100 - total;
            if (total != 100 && vez == 3) {
                vez--;
                if (total > 100) {
                	JOptionPane.showMessageDialog(null, "Distribuiu pontos a mais!\nAtaque " + atq + 
                			" + Defesa " + def + " + Esquiva " + esq + " = Total " + total, "RECUSADO", JOptionPane.WARNING_MESSAGE);
                    max = true;
                    min = false;
                } else {
                	JOptionPane.showMessageDialog(null, "Faltam " + sub + " pontos para distribuir!\nAtaque " + atq + 
                			" + Defesa " + def + " + Esquiva " + esq + " = Total " + total, "CUSTOMIZAR", JOptionPane.WARNING_MESSAGE);
                    max = false;
                    min = true;
                }
            }
        } while (vez < 3 || total != 100);

        Personagem persona = new Personagem(n, atq, def, esq);

        return persona;
    }

    private static int ajustAtrib(boolean max, boolean min, int x) {
        do {
            if (max == true && min == false) {
            	JOptionPane.showMessageDialog(null, "Retire o excesso");
                x -= tratarExcessao();
            } else if (max == false && min == true) {
            	JOptionPane.showMessageDialog(null, "Adicione o que falta");
                x += tratarExcessao();
            } else {
                x = tratarExcessao();
            }
            if (x < 15)
            	JOptionPane.showMessageDialog(null, "Esse atributo não pode ser menor que 15", "RECUSADO", JOptionPane.WARNING_MESSAGE);
        } while (x < 15);
        return x;
    }
    
    private static int tratarExcessao() {
    	int num=0;
    	String valor;
    	boolean ValidInput = false;
    	
        while(! ValidInput) {
            valor = JOptionPane.showInputDialog(null, "Insira o valor");
            if(valor==null)
            	sair();
            try {
                num = Integer.parseInt(valor);
                ValidInput = true; // Se chegou até aqui, o input é válido
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Digite um número válido", "ERRO", JOptionPane.ERROR_MESSAGE);
            }
        }
    	return num;
    }
    
    private static void sair() {
    	JOptionPane.showMessageDialog(null,"","SAINDO",JOptionPane.PLAIN_MESSAGE);
    	System.exit(0); //cancelar e sair
    }
}

