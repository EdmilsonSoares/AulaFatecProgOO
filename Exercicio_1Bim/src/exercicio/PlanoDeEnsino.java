package exercicio;

public class PlanoDeEnsino {

	private String materia;
	private String conteudoProgramatico;
	private String criterioAvaliacao;
	private String bibliografia;

	// get method
	public String getMateria() {
		return materia;
	}
	public String getConteudo() {
		return conteudoProgramatico;
	}
	public String getCriterio() {
		return criterioAvaliacao;
	}
	public String getBibliografia() {
		return bibliografia;
	}

	// set method
	public void setMateria(String materia) {
		this.materia = materia;
	}
	public void setConteudo(String conteudo) {
		this.conteudoProgramatico = conteudo;
	}
	public void setCriterio(String criterio) {
		this.criterioAvaliacao = criterio;
	}
	public void seBibliografia(String bibliografia) {
		this.bibliografia = bibliografia;
	}
	
	public PlanoDeEnsino(String mat, String con, String crt, String bib) {
		this.materia = mat;
		this.conteudoProgramatico = con;
		this.criterioAvaliacao = crt;
		this.bibliografia = bib;
	}

}
