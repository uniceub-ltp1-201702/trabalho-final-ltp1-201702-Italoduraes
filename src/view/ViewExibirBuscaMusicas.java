package view;

import javax.swing.JOptionPane;

import model.BD;
import model.Musicas;

public class ViewExibirBuscaMusicas {
	//Atributo
	private BD bd;

	// metodo construtor
	public ViewExibirBuscaMusicas(BD bd) {
		super();
		this.bd = bd;
	}
public ViewExibirBuscaMusicas(Musicas musica){
//Verificar se tem musica para mostrar
if (musica == null) {
	JOptionPane.showMessageDialog(null, "Musica não existe");
} else {
	//Exibir com JOptionPane
	JOptionPane.showMessageDialog(null, musica);			
}
}
}
