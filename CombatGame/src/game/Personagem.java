package game;
import java.util.Scanner;

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

    public String status() {

        StringBuilder stb = new StringBuilder();

        stb.append("Nome " + this.getNome());
        stb.append(" |Vida " + this.getVida());
        stb.append(" |Ataque " + this.getAtq());
        stb.append(" |Defesa " + this.getDef());
        stb.append(" |Esquiva " + this.getEsq());
        stb.append(" |" + this.getPosicao());

        return stb.toString();
    }

    public static Personagem customizar(Personagem persona) {

        String n;
        byte vez = 0;
        int atq = 0, def = 0, esq = 0, total = 0, op = 0;
        boolean max = false, min = false;
        Scanner imput = new Scanner(System.in);

        System.out.println("\nCriar personagem, insira o nome do personagem: ");
        n = imput.nextLine();

        System.out.println("\nVoce tem 100 pontos para distribuir entra ataque, defesa e esquiva.");
        System.out.println("Nenhum desses atributos pode ficar com menos de 15 pontos.");

        do {
            System.out.printf("\nDigite\n1 - Ajustar o ataque, valor[%d]\n2 - Ajustar a defesa, valor[%d]\n", atq, def);
            System.out.printf("3 - Ajustar a esquiva, valor[%d]\n", esq);
            op = verificaInt();

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
                    System.out.println("Opção inválida!");
                    break;
            }
            total = atq + def + esq;
            if (total != 100 && vez == 3) {
                vez--;
                if (total > 100) {
                    System.out.printf("\nDistribuiu pontos a mais! ataque[%d] + defesa[%d] + esquiva[%d] = %d\n", atq,
                            def, esq, total);
                    max = true;
                    min = false;
                } else {
                    System.out.printf("\nDistribuiu pontos a menos! ataque[%d] + defesa[%d] + esquiva[%d] = %d\n", atq,
                            def, esq, total);
                    max = false;
                    min = true;
                }
            }
        } while (vez < 3 || total != 100);

        persona = new Personagem(n, atq, def, esq);

        return persona;
    }

    private static int verificaInt() {
        Scanner imput = new Scanner(System.in);

        while (!imput.hasNextInt()) {// impedir caracteres indesejados
            System.out.println("Dado incorreto");
            imput.next();// Descartar a entrada inválida
        }
        int n = imput.nextInt();
        imput.nextLine();// remover enter do buffer
        return n;
    }

    private static int ajustAtrib(boolean max, boolean min, int x) {
        do {
            if (max == true && min == false) {
                System.out.print("Retire o excesso: ");
                x -= verificaInt();
            } else if (max == false && min == true) {
                System.out.print("Adicione o que falta: ");
                x += verificaInt();
            } else {
                System.out.print("Insira o valor: ");
                x = verificaInt();
            }
            if (x < 15)
                System.out.println("Esse atributo não pode ser menor que 15");
        } while (x < 15);
        return x;
    }
}

