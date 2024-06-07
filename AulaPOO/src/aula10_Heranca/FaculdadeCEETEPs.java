package aula10_Heranca;

public class FaculdadeCEETEPs extends CentroPaulaSouza{
	
	private String faculdade;

	public FaculdadeCEETEPs() {
		super("Santos");	
	}

	public String getFaculdade() {
		return faculdade;
	}

	public void setFaculdade(String faculdade) {
		this.faculdade = faculdade;
	}

}
