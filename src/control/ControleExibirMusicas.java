package control;

import java.util.ArrayList;

import model.BD;
import model.Musicas;
import view.ViewExibirMusicas;

public class ControleExibirMusicas {
	
	

	// atributos
		 private BD bd;
		 private ViewExibirMusicas vea;
		 
		 public ControleExibirMusicas(BD bd){
			 this.bd = bd;
			 // instanciar a view
			 this.vea = new ViewExibirMusicas();
		 }
		 
		 // metodo que recupera os artistas e exibi
		 
		 public void exibirMusicas(){
			 // retornar o ArrayList de musicas
			 ArrayList<Musicas> musicas = this.bd.getMusicas();
			// Executa o metodo para exibir todas as musicas 
			 this.vea.ExibirMusicas(musicas);
		 }
}
