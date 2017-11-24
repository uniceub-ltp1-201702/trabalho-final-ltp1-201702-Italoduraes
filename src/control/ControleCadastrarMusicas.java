package control;


import model.BD;
import model.Musicas;
import view.ViewCadastrarMusicas;
import view.ViewMusicaExiste;

public class ControleCadastrarMusicas {

	//Atributo
		private BD bd;

		// metodo construtor
		public ControleCadastrarMusicas(BD bd) {
			super();
			this.bd = bd;
		}
		
		// metodo para obter dados da musica e grava no BD
		public void cadastrarMusica(){
			
			// instanciar a view
			ViewCadastrarMusicas vcm = new ViewCadastrarMusicas();
			
			//chamar metodo para obter os dados
			vcm.obterDadosMuscias();
			
			// Verificar se a  musica já existe 
			if(this.bd.existeMusica(vcm.getNome())){
				
				// instanciar a view
				ViewMusicaExiste vme = new ViewMusicaExiste();
				
				// exibir a mensagem
				vme.exibirMensagemMusicaExiste();
				
			}else{
				//instanciar um objeto da classe Musicas com os dados digitados 
				
				Musicas musica= new Musicas(vcm.getNome(), vcm.getGenero(), vcm.getAnoLancamento() , vcm.getArtista());
				
				// guardar musicas no BD
				this.bd.gravarMusicas(musica);
			}	
			}

}
