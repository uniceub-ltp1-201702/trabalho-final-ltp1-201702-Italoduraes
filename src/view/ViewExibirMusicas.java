package view;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import model.Musicas;

public class ViewExibirMusicas {


	// Metodo Costrutor 
		public void ExibirMusicas(ArrayList<Musicas> musica){
			// instanciar String para exibicao
			String todasMusicas= "";
			//percorrer o ArrayList 
			for (int i = 0; i < musica.size(); i++) {
				todasMusicas = todasMusicas + musica.get(i).toString() + "\n";
			}
			// exibir todas as musicas
			JOptionPane.showMessageDialog(null, todasMusicas);
		}
}
