package control;


import model.Artistas;
import model.BD;
import view.ViewBuscarArtistas;
import view.ViewExibirBuscaArtistas;


public class ControleBuscarArtistas {
	

	// atributos
		 private BD bd;
		
		 
		 public ControleBuscarArtistas(BD bd){
			 this.bd = bd;
			 
		 }


			//Metodo para buscar o artista
			public void buscarArtistas(){
				
				//Criar a view para buscar o artista
				ViewBuscarArtistas vba = new ViewBuscarArtistas();
				
				//Recuperando o artista digitado pelo usuario
				String artista = vba.getNomeDoCantor();
				
				//Retornar dados do artista de acordo com o nome
				Artistas usu = this.bd.getArtistaPorNome(artista);
				
				//Exibir os dados do artista
				ViewExibirBuscaArtistas veb = new ViewExibirBuscaArtistas(usu);
			}

}
