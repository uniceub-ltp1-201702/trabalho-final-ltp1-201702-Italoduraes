package view;

import javax.swing.JOptionPane;

public class ViewExibirMusicaString {

	public ViewExibirMusicaString(String musicas) {

		JOptionPane.showMessageDialog(null, musicas);
		ViewPrincipal vp = new ViewPrincipal();
	}
}
