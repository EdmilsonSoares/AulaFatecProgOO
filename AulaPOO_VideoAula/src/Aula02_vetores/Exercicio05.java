package Aula02_vetores;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] aluno;
		double[] semestre1, semestre2;
		int i=0;
		
		System.out.println("Quantos alunos serão digitados? ");
		int n = sc.nextInt();
		
		aluno = new String[n];
		semestre1 = new double[n];
		semestre2 = new double[n];
		
		for(i=0; i<aluno.length; i++) {
			sc.nextLine();
			System.out.printf("Digite o nome, nota1 e nota2 do %d° aluno\n", i+1);
			aluno[i] = sc.nextLine();
			semestre1[i] = sc.nextDouble();
			semestre2[i] = sc.nextDouble();
		}
		System.out.println("Alunos aprovados");
		double media;
		for(i=0; i<aluno.length; i++) {
			media = (semestre1[i] + semestre2[i]) / 2;
			if(media >= 6) {
				System.out.println(aluno[i] + " Média = " + media);
			}
		}
		
		sc.close();
	}

}
