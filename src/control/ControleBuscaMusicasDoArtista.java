package control;

import java.util.ArrayList;
import model.BD;
import model.Musicas;
import view.ViewBuscarArtistas;
import view.ViewExibirMusicaString;

public class ControleBuscaMusicasDoArtista {
	

	// atributos
		 private BD bd;
		
		 
		 public ControleBuscaMusicasDoArtista(BD bd){
			 this.bd = bd;
			 
		 }
		 

			//Metodo para buscar o artista
			public void buscarArtistas(){
				
				// Recupera todas as clientes
				ArrayList<Musicas> musicas = this.bd.getMusicas();
				
				//Criar a view para buscar o artista
				ViewBuscarArtistas vba = new ViewBuscarArtistas();
				
				//Recuperando o artista digitado pelo usuario
				String artista = vba.getNomeDoCantor();
				
				//Retornar dados do artista de acordo com o nome
				String a = "<<< " + artista + ">>>\n";
				for (int i = 0; i < musicas.size(); i++) {
					if (musicas.get(i).getArtista().equalsIgnoreCase(artista)) {
						a += "-------------------\n" + musicas.get(i).getNome() + "\n" + musicas.get(i).getGenero() + "\n"
								+ musicas.get(i).getAnoLancamento() + "\n";
					}
				}
				
				//Exibir os dados do artista
				ViewExibirMusicaString veb = new ViewExibirMusicaString(a);
			}

}
