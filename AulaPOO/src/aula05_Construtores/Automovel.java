package aula05_Construtores;

public class Automovel {
	
	private String marca;
	private String modelo;
	private int ano;
	private double preco;
	private static String cor;
	
	public Automovel() {}
	
	public Automovel(int ano, String marca, String modelo, double preco) {
		this.ano = ano;
		this.marca = marca;
		this.modelo = modelo;
		this.preco = preco;
	}
	 static {
		 cor = "verde" ;//por ser static será igual para todas as instancias dessa classe
	 }
	 public String mostraCarro() {
		 return "Marca: \t" + marca + "\nModelo: " + modelo + "\nAno: \t" + ano + "\nCor: \t" + cor + "\nPreço: \t" + preco + "\n";
	 }

}
