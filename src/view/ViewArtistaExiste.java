package view;

import javax.swing.JOptionPane;

public class ViewArtistaExiste {


	// metodo para exibir mensagem do artista existente 
	public void exibirMensagemArtistaExiste(){
		JOptionPane.showMessageDialog(null,"Artista Já existente!",  "Erro",JOptionPane.ERROR_MESSAGE);
	}
}
