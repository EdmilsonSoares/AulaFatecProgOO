package aula01_memoria;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exer01_Listas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Funcionario func;
		List<Funcionario> lista = new ArrayList<>();
		Integer indice = null;
		int ID=0, n=0;

        //System.out.println(lista);
		System.out.println("Quantos funcionários cadastrar? ");
		n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			sc.nextLine();
			System.out.printf("%d° Funcionário\n", i+1);
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("ID: ");
			ID = sc.nextInt();
			while(verID(lista, ID) != null) {
				System.out.println("ID já existe! Digite outro: ");
				ID = sc.nextInt();
			}
			System.out.print("Salário: ");
			double salario = sc.nextDouble();
			func = new Funcionario(nome,ID,salario);
			lista.add(func);
		}
		imprimir(lista);
		
		System.out.print("Entre com o ID do funcionário que deseja aumentar o salário: ");
		ID = sc.nextInt();
		indice = verID(lista, ID);
		while(indice == null) {
			System.out.println("ID não existe! Digite outro: ");
			ID = sc.nextInt();
			indice = verID(lista, ID);
		}
		System.out.println("Entre com a porcentagem de aumento: ");
		double porce = sc.nextDouble();
		lista.get(indice).aumentaSalario(porce);
		
		imprimir(lista);
		//System.out.println(lista);
		sc.close();
	}//*************************************************************************************************
	
	public static void imprimir(List<Funcionario> lista) {
		for(Funcionario f : lista) {
			System.out.println( f.getId() + ", " + f.getNome() + ", " + f.getSalario());
		}
	}
	
	public static Integer verID(List<Funcionario> lista, int id) {
		for(int i=0; i<lista.size(); i++) {
			if(lista.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}

}
