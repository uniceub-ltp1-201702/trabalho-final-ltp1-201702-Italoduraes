package control;

import model.BD;
import model.Musicas;
import view.ViewBuscarMusicas;
import view.ViewExibirBuscaMusicas;

public class ControleBuscarMusicas {
	

	// atributos
		 private BD bd;
		
		 
		 public ControleBuscarMusicas(BD bd){
			 this.bd = bd;
			 
		 }


			//Metodo para buscar a musica
			public void buscarMusica(){
				
				//Criar a view para buscar a musica
				ViewBuscarMusicas vbm = new ViewBuscarMusicas();
				
				//Recuperando a musica digitado pelo usuario
				String musicas = vbm.getNome();
				
				//Retornar dados da musica de acordo com o nome
				Musicas usu = this.bd.getMusicaPorNome(musicas);
				
				//Exibir os dados da musica
				ViewExibirBuscaMusicas vebm = new ViewExibirBuscaMusicas(usu);
			}

}
