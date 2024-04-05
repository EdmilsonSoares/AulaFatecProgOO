package aplicacao;

public class Gerar {
	private String[] ran = new String[] {"0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
	private String random;
		
	public String getRandom() {
		int i=0;
		this.random = "";
		for(int n=0; n<10; n++) {
			i = (int) (Math.random() * 36);
			this.random += ran[i];	
		}
		return this.random;
	}

}
