package aula11_Heranca;

public class RegiaoDeSantos extends CidadeDeSantos{
	
	private String bairro;
	
	RegiaoDeSantos(){
		super("re");
	}
	RegiaoDeSantos(String bairro){
		super(bairro);
	}
	
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

}
