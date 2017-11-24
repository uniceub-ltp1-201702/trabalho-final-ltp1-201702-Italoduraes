package model;

public class Musicas {
	
	// Atributos 
	
	private String nome;
	private String genero;
	private String anoLancamento;
	private String artista;
	
	
	/* metodo que transforma uma musica na representacao dela em linha 
	  para salvar em um arquivo */

	public String toLinha(){
		return getNome() + ";" + getGenero() + ";" + getAnoLancamento() + ";" + getArtista();
	}
	
	
// metodo toString
	public String toString(){
		return "Nome da musica: " + this.nome + "\n" +
				"Genero: " + this.genero + "\n" +
				"Ano de lançamento: " + this.anoLancamento + "\n" +
				"Artista: " + this.artista + "\n";
	}
	
// metodo construtor
	public Musicas(String nome, String genero, String anoLancamento, String artista) {
		super();
		this.nome = nome;
		this.genero = genero;
		this.anoLancamento = anoLancamento;
		this.artista = artista;
	}
	
	
	
	//metodo get e set
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getAnoLancamento() {
		return anoLancamento;
	}
	public void setAnoLancamento(String anoLancamento) {
		this.anoLancamento = anoLancamento;
	}
	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		this.artista = artista;
	}
	
	
	

}
