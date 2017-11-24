package model;

public class Artistas {
	
	// Atributos 
	
	private String nomeDoCantor;
	private int idade;

	
	

	/* metodo que transforma um artista na representacao dele em linha 
	  para salvar em um arquivo */

	public String toLinha(){
		return getNomeDoCantor() + ";" + getIdade();
	}

	//Metodo toString
	public String toString(){
		return "Nome do cantor: " + this.nomeDoCantor + "\n" +
				"Idade: " + this.idade+ "\n";
	}
	
	
// metodos construtor
	public Artistas(String nomeDoCantor, int idade) {
		super();
		this.nomeDoCantor = nomeDoCantor;
		this.idade = idade;
	}
	
	// metodos get e set 
	public String getNomeDoCantor() {
		return nomeDoCantor;
	}
	public void setNomeDoCantor(String nomeDoCantor) {
		this.nomeDoCantor = nomeDoCantor;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	

}
