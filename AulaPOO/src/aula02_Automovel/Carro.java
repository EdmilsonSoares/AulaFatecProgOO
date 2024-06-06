package aula02_Automovel;
import javax.swing.JOptionPane;

public class Carro {
	//attributes
	private String marca;
	private String modelo;
	private String cor;
	private double preco;
	
	//get method
	public String getMarca() {
		return marca;
	}
	public String getModelo() {
		return modelo;
	}
	public String getCor() {
		return cor;
	}
	public double getPreco() {
		return preco;
	}
	
	//set method
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public void Informa_Automovel(){		
		JOptionPane.showMessageDialog(null, "Marca: " + this.getMarca() + "\nModelo: " + this.getModelo() +
				"\nCor: " + this.getCor() + "\nPreço: R$" + this.getPreco(),"", JOptionPane.PLAIN_MESSAGE);
	}
	public String retorno() {
		return "Marca " + this.getMarca() + "\nModelo " + this.getModelo() + "\nCor " + this.getCor() + "\nPreço " + this.getPreco();
	}
}



