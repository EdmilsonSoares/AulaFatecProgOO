package aula16_Sobrecarga;

public class FichaFuncionarios {
	private String nome;
	private String profissao;
	private int idade;
	private double salario;
	FichaFuncionarios e;
	
	FichaFuncionarios(String nome, String profissao, int idade, double salario) {
		this.nome = nome;
		this.profissao = profissao;
		this.idade = idade;
		this.salario = salario;
	}
	
	//recebe os mesmos parâmetros mas em outra ordem, portanto tem assinatura diferente comparado com o método acima
	FichaFuncionarios(int idade, double salario, String nome, String profissao){
		this.nome = nome;
		this.profissao = profissao;
		this.idade = idade;
		this.salario = salario;
	}
	FichaFuncionarios(FichaFuncionarios e){
		this.e = e;
		mostra_funcionarios(e);
	}
	
	public String mostra_funcionarios() {
		return ("1) Nome: " + nome + "\nIdade: " + idade + "\nProfissão: " + profissao + "\nSalário:" + salario + "\n");
	}
	public void mostra_funcionarios(FichaFuncionarios f) {
		System.out.println("2) Nome: " + f.nome + "\nIdade: " + f.idade + "\nProfissão: " + f.profissao + "\nSalário: " + f.salario + "\n");
	}


}
