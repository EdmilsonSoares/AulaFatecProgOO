package Aula02_vetores;

import java.util.Scanner;

public class ClasseMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Produto[] vect = new Produto[n];
		
		
		String nome; Double valor; 
		for(int i = 0; i < vect.length; i++) {
			sc.nextLine();
			System.out.printf("Digite o %dº produto: ", i+1);
			nome = sc.nextLine();
			System.out.printf("Digite o preço do %dº produto: ", i+1);
			valor = sc.nextDouble();
			vect[i] = new Produto(nome, valor);
		}
		
		for(int i = 0; i < vect.length; i++)
			System.out.println(vect[i].descricao());
			
		
		sc.close();
	}

}
