package Exercicio03_2;

public class ClasseMain {

	public static void main(String[] args) {
		Time A = new Time("Santos");
		Time B = new Time("Palmeiras");
		Time C = new Time("São Paulo");
		Time D = new Time("Corinthians");
		Campeonato camp = new Campeonato();
		
		camp.jogarPartida(A, B);
		camp.jogarPartida(B, A);
		camp.jogarPartida(C, D);
		camp.jogarPartida(D, C);
		
		System.out.println(A.getNome() + "\t\t" + A.exibirPonto());
		System.out.println(B.getNome() + "\t" + B.exibirPonto());
		System.out.println(C.getNome() + "\t" + C.exibirPonto());
		System.out.println(D.getNome() + "\t" + D.exibirPonto());
		

		

	}

}
