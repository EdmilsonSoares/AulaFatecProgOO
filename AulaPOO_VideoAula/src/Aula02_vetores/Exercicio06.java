package Aula02_vetores;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Pessoa[] hospede = new Pessoa[10];
		int alugado = 0, quarto = 0, opc = 0;
		String op;
		
		do {
			do {
				quartosDisponiveis(hospede);
				System.out.println("Escolha um quarto de 0 a 9 para alugar");
				quarto = sc.nextInt();
				if (hospede[quarto] != null) {
					System.out.println("Quarto já ocupado escolha outro!");
				} else {
					sc.nextLine();
					String nome = sc.nextLine();
					int idade = sc.nextInt();
					double altura = sc.nextDouble();
					hospede[quarto] = new Pessoa(nome, idade, altura);
					alugado++;
					break;
				}
			} while (hospede[quarto] != null);
			System.out.println("Digite: \n1 - Alugar outro quarto \n0 - Sair");
			//sc.nextLine();
			opc = sc.nextInt();
			System.out.println(opc);
		} while (opc != 0 && alugado < 10);
		System.out.println("========== Final do Programa ==========");
		quartosDisponiveis(hospede);
		
		sc.close();
	}
	
	public static void quartosDisponiveis(Pessoa[] hospede) {
		System.out.print("Quartos disponíveis: ");
		for(int i = 0; i <hospede.length; i++) {
			if(hospede[i] == null) {
				System.out.print(i + " ");
			}
		}
		System.out.println("\n");
	}

}
