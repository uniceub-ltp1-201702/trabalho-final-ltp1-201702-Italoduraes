package model;

import java.util.ArrayList;

import util.DocumentReader;
import util.DocumentWriter;

public class BD {
	
	// Atributos 
	
	private ArrayList<Musicas> musicas = new ArrayList<Musicas>() ;
	private ArrayList<Artistas> artistas= new ArrayList<Artistas>();
	private String fileNomeA = "Artistas.txt";
	private String fileNomeM = "Musicas.txt";
	private DocumentWriter dw;
	private DocumentReader dr;
	
	public BD() {
		// instanciar o ArrayList
				this.artistas = new ArrayList<Artistas>();
				this.musicas = new ArrayList<Musicas>();

				// instanciar o documentReader
				this.dr = new DocumentReader();
				// instanciar o DocumentWriter
				this.dw = new DocumentWriter();
		   
	}
	
	// Metodo que carrega todos os artistas do arquivo para o ArrayList
	
	public void carregarArtistas(){
		//ler as linhas do arquivo
		ArrayList<String> linhas = this.dr.read(this.fileNomeA);
		
		//Percorer o ArrayList criando os artistas
		
		for (int i = 0; i <linhas.size(); i++) {
			// Separa a linha em um array de String
			String[] linhaArtista = linhas.get(i).split(";");
			//Cria o artista com os dados da linha
			Artistas c= new Artistas(linhaArtista[0], Integer.parseInt(linhaArtista[1]));
			// Coloca o artista no ArrayList 
			this.artistas.add(c);
		}
	}
	
	// Metodo que carrega todos os artistas do arquivo para o ArrayList
	
		public void carregarMusicas(){
			//ler as linhas do arquivo
			ArrayList<String> linhas = this.dr.read(this.fileNomeM);
			
			//Percorer o ArrayList criando as musicas
			
			for (int i = 0; i <linhas.size(); i++) {
				// Separa a linha em um array de String
				String[] linhaMusica = linhas.get(i).split(";");
				//Cria a musicas com os dados da linha
				Musicas c= new Musicas(linhaMusica[0],linhaMusica[1],linhaMusica[2],linhaMusica[3]);
				// Coloca a musica no ArrayList 
				this.musicas.add(c);
			}
		}
		
	
	// metodo que verificar se ja existe artista com o nome informado
		public boolean existeArtista(String nome){
			
			boolean retorno = false;
			// percorrer a arraylist
			for (int i = 0; i < this.artistas.size(); i++) {
				// verificar se existe artista com mesmo nome
				if (this.artistas.get(i).getNomeDoCantor().equals(nome)){
					retorno = true;
				}
			}
			return retorno;
		}
		
		// metodo que verificar se ja existe musica com o nome informado
				public boolean existeMusica(String nome){
					
					boolean retorno = false;
					// percorrer a arraylist
					for (int i = 0; i < this.musicas.size(); i++) {
						// verificar se existe musica com mesmo nome
						if (this.musicas.get(i).getNome().equals(nome)){
							retorno = true;
						}
					}
					return retorno;
				}

				
				
		// metodo que grava artista
		
		public void gravarArtistas (Artistas c){
			// colocar o Atistas no ArrayList
			this.artistas.add(c);
			
			// gravar o artista no arquivo
			dw.write(this.fileNomeA, c.toLinha());
		}
		
		// metodo que grava musica
		
				public void gravarMusicas (Musicas c){
					// colocar a musicas no ArrayList
					this.musicas.add(c);
					
					// gravar a musicas no arquivo
					dw.write(this.fileNomeM, c.toLinha());
				}

				
				
	// Recuperar o ArrayList de Artistas
	
	public ArrayList<Artistas> getArtistas(){
		return this.artistas;
	}
	
	// Recuperar o ArrayList da musicas
	
	public ArrayList<Musicas> getMusicas(){
		return this.musicas;
	}
	
	
	
	
	
	// Retorna o artista de acordo com o nome
	
	public Artistas getArtistaPorNome(String nome) {
		 Artistas retorno = null;
		 
		 // percorrer a lista de artistas
		 for (int i = 0; i <this.artistas.size(); i++) {
			if (this.artistas.get(i).getNomeDoCantor().equals(nome)) {
				retorno = this.artistas.get(i);
			
		}	
		}
		 return retorno;
	}
	public Musicas getArtistasPorNome(String nome) {
		 Musicas retorno = null;
		 
		 // percorrer a lista de artistas
		 for (int i = 0; i <this.musicas.size(); i++) {
			if (this.musicas.get(i).getArtista().equals(nome)) {
				retorno = this.musicas.get(i);
			
		}	
		}
		 return retorno;
	}
	
	
	// Retorna musica de acordo com o nome da musica
	
	public Musicas getMusicaPorNome( String nome) {
		
		Musicas retorno = null;
		
		// Percorrer a lista de musicas
		for (int i = 0; i < this.musicas.size(); i++) {
			if(this.musicas.get(i).getNome().equals(nome)) {
				retorno = this.musicas.get(i);
			}
		}
		return retorno;
	}
	
	
}
