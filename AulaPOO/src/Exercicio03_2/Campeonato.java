package Exercicio03_2;

public class Campeonato implements Partida{
	@Override
	public void jogarPartida(Time time1, Time time2) {

		System.out.print("Jogo entre " + time1.getNome() + " e " + time2.getNome() + " => ");
		int resultado = (int) (Math.random() * 3);
		
		if(resultado == 0) {//draw
			System.out.println(time1.getNome() + " e " + time2.getNome() + " empataram");
			time1.marcarPonto(2);
			time2.marcarPonto(2);
		}else if(resultado == 1) {//time1 wins
			System.out.println(time1.getNome() + " vençeu a partida");
			time1.marcarPonto(1);
			time2.marcarPonto(3);
		}else if(resultado == 2) {//time2 wins
			System.out.println(time2.getNome() + " vençeu a partida");
			time1.marcarPonto(3);
			time2.marcarPonto(1);	
		}
	}

}
