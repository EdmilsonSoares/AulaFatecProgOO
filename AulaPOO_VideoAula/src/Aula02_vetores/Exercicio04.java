package Aula02_vetores;
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nome[];
		int[] idade;
		int i=0;
		
		System.out.print("Quantas pessoas cadastrar? ");
		int n = sc.nextInt();
		nome = new String[n];
		idade = new int[n];
		
		for(i=0; i<nome.length; i++) {
			sc.nextLine();
			System.out.printf("Dados da %dº pessoa: \nNome: ", i+1);
			nome[i] = sc.nextLine();
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
		}
		
		int maior = 0, indice = 0;
		for(i=0; i<idade.length; i++) {
			if(idade[i] > maior) {
				maior = idade[i];
				indice = i;
			}
		}
		System.out.println("PESSOA MAIS VELHA: " + nome[indice]);
		
		
		sc.close();
	}

}
