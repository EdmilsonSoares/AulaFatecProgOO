package Aula02_vetores;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] vect;
		int i=0;
		
		System.out.print("Quantos números você vai digitar (máx 10)? ");
		int n = sc.nextInt();
		
		if (n > 10) {
			System.out.println("Valor excede o tamanho");
			System.exit(0);
		}
		vect = new double[n];
		
		for(i=0; i < vect.length; i++)
			vect[i] = sc.nextDouble();
		
		System.out.print("Números negativos: ");
		for(i=0; i<vect.length; i++) {
			if(vect[i] < 0)
				System.out.printf("%.2f ", vect[i]);
		}
		
		int par = 0;
		System.out.println("\nNúmeros pares: ");
		for(i=0; i<vect.length; i++) {
			if(vect[i] % 2 == 0) {
				par++;
				System.out.printf("%.2f ", vect[i]);
			}	
		}
		System.out.println("\nQuantidade de números pares: " + par);
		
		double maior = 0;
		int posicao = 0;
		System.out.print("Valores = ");
		for(i=0; i<vect.length; i++) {
			System.out.printf("[%.2f] ", vect[i]);
			if(vect[i] > maior) {
				maior = vect[i];
				posicao = i;
			}
		}
		System.out.println("\nMaior valor " + maior + "\nPosição do maior valor " + posicao);
		
		double soma = 0, media = 0;
		for(i=0; i<vect.length; i++)
			soma += vect[i];
		
		System.out.printf("Soma = %.2f\n", soma);
		media = soma/vect.length;
		System.out.printf("Média = %.2f\n", media);
		System.out.println("Números abaixo da média: ");
		for(i=0; i<vect.length; i++) {
			if(vect[i] < media) 
				System.out.println(vect[i]);
		}
		
		sc.close();
	}

}
