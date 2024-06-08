package aula18_Interface;

//classe abstrata
public abstract class Feira {
	InterfaceFazerFeira comprar;
	
	public Feira() {}

	public void setar_fruta (InterfaceFazerFeira frut) { 
		comprar = frut;
	}
	public void setar_verdura (InterfaceFazerFeira verd) { 
		comprar = verd;
	}
	public void chama_comprar_fruta() { 
		comprar.comprar_na_barraca();
	}
	public void chama_comprar_verdura () { 
		comprar.comprar_na_barraca();
	}
}
