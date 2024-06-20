package Aula02_vetores;
import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Pessoa[] vect;
		String nome;
		int idade, i=0;
		double altura;
		
		System.out.print("Quantos pessoas cadastrar? ");
		int n = sc.nextInt();
		
		vect = new Pessoa[n];
		for(i=0; i < vect.length; i++) {
			sc.nextLine();
			System.out.printf("Digite o nome da %dº pessoa: ", i+1);
			nome = sc.nextLine();
			System.out.printf("Digite a idade da %dº pessoa: ", i+1);
			idade = sc.nextInt();
			System.out.printf("Digite a altura da %dº pessoa: ", i+1);
			altura = sc.nextDouble();
			vect[i] = new Pessoa(nome, idade, altura);
		}
		
		double num = 0, porcentagem = 0, porcento = (double)100/vect.length;
		for(i=0; i < vect.length; i++) {
			num += vect[i].getAltura();
			if(vect[i].getIdade() < 16)
				porcentagem += porcento;
		}
		double media = (double)num/vect.length;
		System.out.println("Média das idades: " + media + "\nPessoas com menos de 16 anos: " + porcentagem + "%");
		for(i=0; i < vect.length; i++) {
			if(vect[i].getIdade() < 16)
				System.out.println(vect[i].getNome());
		}
		
		sc.close();
	}

}
