package control;

import java.util.ArrayList;

import model.Artistas;
import model.BD;
import view.ViewExibirArtistas;

public class ControleExibirArtistas {
	
	// atributos
		 private BD bd;
		 private ViewExibirArtistas vea;
		 
		 public ControleExibirArtistas(BD bd){
			 this.bd = bd;
			 // instanciar a view
			 this.vea = new ViewExibirArtistas();
		 }
		 
		 // metodo que recupera os artistas e exibi
		 
		 public void exibirArtistas(){
			 // retornar o ArrayList de artistas
			 ArrayList<Artistas> artistas = this.bd.getArtistas();
			// Executa o metodo para exibir todos os artistas
			 this.vea.ExibirArtistas(artistas);
		 }

}
