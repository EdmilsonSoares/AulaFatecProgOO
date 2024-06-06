package aula05_Construtores;

public class CelularTesteStatic {

	public static void main(String[] args) {
	
		Celular A = new Celular();
		Celular B = new Celular();
		
		A.setNumero("13 99655-8666");
		A.setUsuario("Carla");//atributo usuario é estático
		B.setNumero("11 99777-6688");
		B.setUsuario("Maria");//atributo usuario é estático

		System.out.println("Número: " + A.getNumero() + " Usuário: " + A.getUsuario());
		System.out.println("Número: " + B.getNumero() + " Usuário: " + B.getUsuario());
		
		//atributo ddd é estático
		B.ddd = "17";
		A.ddd = "16";
		System.out.println("DDD de B " + B.ddd);
		System.out.println("DDD de A " + A.ddd);
	//Conclusão: Não existem dois usuários e dois ddd pois usuário e ddd são estáticos, são únicos para ambas as instâncias.

	}

}
