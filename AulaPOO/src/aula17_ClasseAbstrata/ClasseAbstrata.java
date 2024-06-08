package aula17_ClasseAbstrata;

public abstract class ClasseAbstrata {
	
	private String mensagem;

	protected String getMensagem() {
		return mensagem;
	}
	protected void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	//método abstrato que será sobrescrito
	protected abstract void mostra_mensagem();

}
