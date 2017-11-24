package view;

import javax.swing.JOptionPane;

import model.Artistas;
import model.BD;

public class ViewExibirBuscaArtistas {
	//Atributo
			private BD bd;

			// metodo construtor
			public ViewExibirBuscaArtistas(BD bd) {
				super();
				this.bd = bd;
			}
	public ViewExibirBuscaArtistas(Artistas artistas){
		//Verificar se tem artista para mostrar
		if (artistas == null) {
			JOptionPane.showMessageDialog(null, "Artista não existe");
		} else {
			//Exibir com JOptionPane
			JOptionPane.showMessageDialog(null, artistas);			
		}
	}

}
