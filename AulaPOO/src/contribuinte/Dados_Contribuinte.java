package contribuinte;

public class Dados_Contribuinte {
	
	private String nome;
	private String cpf;
	private String cnpj;
	private String cartao;
	
	//metodos get/set
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public void setCartao(String cartao) {
		this.cartao = cartao;
	}
	
	public String getNome() {
		return nome;
	}
	public String getCpf() {
		return cpf;
	}
	public String getCnpj() {
		return cnpj;
	}
	public String getCartao() {
		return cartao;
	}

}
