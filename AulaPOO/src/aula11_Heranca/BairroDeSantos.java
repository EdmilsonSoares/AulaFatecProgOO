package aula11_Heranca;

public class BairroDeSantos extends RegiaoDeSantos{
	
	private String rua;
	
	BairroDeSantos(){
		super("ba");
	}

	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}

}
