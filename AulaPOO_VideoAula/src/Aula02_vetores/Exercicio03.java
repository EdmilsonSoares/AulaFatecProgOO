package Aula02_vetores;
import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] vectA, vectB, vectC;
		int i=0;
		
		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		vectA = new int[n];
		vectB = new int[n];
		vectC = new int[n];
		
		System.out.println("Digite os valoress de A e B respectivamente: ");
		for(i=0; i<vectA.length; i++) {
			sc.nextLine();
			vectA[i] = sc.nextInt();
			vectB[i] = sc.nextInt();
			vectC[i] = vectA[i] + vectB[i];
		}
		System.out.println("Resultado:");
		for(i=0; i<vectA.length; i++) {
			System.out.println(vectA[i] + " + " + vectB[i] + " = " + vectC[i]);
		}
		
		sc.close();
	}

}
