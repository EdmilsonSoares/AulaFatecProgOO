package aula14_PolimorfismoEx02;

public class MainAcessaPomar extends Pomar{

	public static void main(String[] args) {
		Pomar A = new Pomar();
		
		System.out.println("Arvore: " + A.getArvore() + "\tFruta: " + A.getFruta() + "\n");
		
		A.setArvore("laranjeira");
		A.setFruta ("laranja");
		System.out.println("Arvore: " + A.getArvore() + "\tFruta: " + A.getFruta() + "\n");

	}
	
	//aplicação de polimorfismo
	public double area_pomar(){
		return 880.13;
	}
	public void teste() {
		System.out.println("Da classe MainAcessaPomar\n");
	}

}
