package view;

import javax.swing.JOptionPane;

public class ViewCadastrarMusicas {
	

	// Atributos 
	
	private String nome;
	private String genero;
	private String anoLancamento;
	private String artista;
	
	
	

	// metodo para obter dados da musicas a ser inserido
	
	public void  obterDadosMuscias(){
		// obtendo dados da musica
		this.setNome(JOptionPane.showInputDialog("Informe o nome da musica: "));
 	    this.setGenero(JOptionPane.showInputDialog("Informe o genero da musica: "));
 	   this.setAnoLancamento(JOptionPane.showInputDialog("Informe o ano de lançamento da musica: "));
 	  this.setArtista(JOptionPane.showInputDialog("Informe o artista da musica: "));
	}


	


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
