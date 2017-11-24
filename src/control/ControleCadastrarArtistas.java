package control;

import java.util.ArrayList;
import model.Artistas;
import model.BD;
import view.ViewArtistaExiste;
import view.ViewCadastrarArtistas;

public class ControleCadastrarArtistas {
	
	//Atributo
		private BD bd;

		// metodo construtor
		public ControleCadastrarArtistas(BD bd) {
			super();
			this.bd = bd;
		}
		
		// metodo para obter dados do Artistas e grava no BD
		public void cadastrarArtistas(){
			
			// instanciar a view
			ViewCadastrarArtistas vca = new ViewCadastrarArtistas();
			
			//chamar metodo para obter os dados
			vca.obterDadosArtistas();
			
			// Verificar se o Artista já existe 
			if(this.bd.existeArtista(vca.getNomeDoCantor())){
				
				// instanciar a view
				ViewArtistaExiste vae = new ViewArtistaExiste();
				
				// exibir a mensagem
				vae.exibirMensagemArtistaExiste();
				
			}else{
				//instanciar um objeto da classe Artistas com os dados digitados 
				// Integer.parseInt()** é converter String para int- numero inteiro
				
				Artistas artistas= new Artistas(vca.getNomeDoCantor(), Integer.parseInt(vca.getIdade()));
				
				// guardar artista no BD
				this.bd.gravarArtistas(artistas);
			}	
			}
}
