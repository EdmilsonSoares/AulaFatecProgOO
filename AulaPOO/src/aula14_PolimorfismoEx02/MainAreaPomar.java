package aula14_PolimorfismoEx02;

public class MainAreaPomar {

	public static void main(String[] args) {
		Pomar B = null;
		
		B = new Pomar();
		System.out.println("Arvore: " + B.getArvore() + "\tFruta: " + B.getFruta());
		System.out.println("Area do pomar = " + B.area_pomar());
		B.teste();
		
		B = new MainAcessaPomar();
		System.out.println("Arvore: " + B.getArvore() + "\tFruta: " + B.getFruta());
		System.out.println("Area do pomar = " + B.area_pomar());
		B.teste();
		
		/* OBS: Instanciando por MainAcessaPomar as instruções em Main não são executadas
		 * apenas métodos fora da Main que são executados.
		 */
	}

}
