package Exercicio03;

public class AcademiaEsporte extends Atividade{

	AcademiaEsporte(String nome, int duracao) {
		super(nome, duracao);
	}
	
	@Override
	public String exercicio() {
		return "Exercício de " + getNome() + " Duração: " + getDuracao() + " horas";
	}
	@Override
	public String musica() {
		if(getNome() == "Artes Marciais")
			setMusica("Glory of Love - Peter Cetera");
		else if(getNome() == "Corrida")
			setMusica("Carruagens de Fogo - Vangelis");
		else if(getNome() == "Boxe")
			setMusica("Eye of the Tiger - Survivor");
		else if(getNome() == "Musculação")
			setMusica("Musclebound - Spandau Ballet");
		
		return "Música tocando: " + getMusica();
	}

}
