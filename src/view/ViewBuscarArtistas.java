package view;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Artistas;

public class ViewBuscarArtistas {
	
	//Atributos
		private String nomeDoCantor;
		
		public ViewBuscarArtistas(){
			this.nomeDoCantor =
					JOptionPane.showInputDialog("Digite o nome do cantor:");
		}
		
		
		
		public String getNomeDoCantor() {
			return nomeDoCantor;
		}

		
		
	

	
}
