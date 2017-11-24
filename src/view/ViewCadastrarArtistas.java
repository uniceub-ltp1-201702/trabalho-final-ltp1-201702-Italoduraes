package view;

import javax.swing.JOptionPane;

public class ViewCadastrarArtistas {
	
	// Atributos 
	
	private String nomeDoCantor;
	private String idade;
	
	

	// metodo para obter dados do artista a ser inserido
	
	public void  obterDadosArtistas(){
		// obtendo dados do artistas
		this.setNome(JOptionPane.showInputDialog("Informe o nome do artista: "));
 	    this.setIdade(JOptionPane.showInputDialog("Informe a idade do artista: "));
	}
	

	
	
	public String getNomeDoCantor() {
		return nomeDoCantor;
	}
	public void setNome(String nome) {
		this.nomeDoCantor = nome;
	}
	public String getIdade() {
		return idade;
	}
	public void setIdade(String idade) {
		this.idade = idade;
	}
	
	

}
