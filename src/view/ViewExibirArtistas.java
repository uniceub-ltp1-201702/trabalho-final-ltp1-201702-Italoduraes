package view;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import model.Artistas;


public class ViewExibirArtistas {

	
	// Metodo Costrutor 
		public void ExibirArtistas(ArrayList<Artistas> artista){
			// instanciar String para exibicao
			String todosArtistas= "";
			//percorrer o ArrayList 
			for (int i = 0; i < artista.size(); i++) {
				todosArtistas = todosArtistas + artista.get(i).toString() + "\n";
			}
			// exibir todos os artistas
			JOptionPane.showMessageDialog(null, todosArtistas);
		}
}
