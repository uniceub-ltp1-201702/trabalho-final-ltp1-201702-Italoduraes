package control;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import model.BD;
import model.Musicas;
import view.ViewBuscarArtistas;
import view.ViewBuscarMusicas;
import view.ViewExcluirMusicas;

public class ControleExcluirMusicas {
	
	// Atributo 
	private BD bd;

	public ControleExcluirMusicas(BD bd) {
		this.bd = bd;
	}

	
	
	public void ExcluirMusicas()
			throws IOException {

		// cria e iniciar o arquivo
		String FileNameM = "Musicas.txt";

		// Recupera o ArrayList de musicas
		ArrayList<Musicas> musicas = bd.getMusicas();

		// instanciar a view
		ViewBuscarMusicas vbm = new ViewBuscarMusicas();
		ViewBuscarArtistas  vba = new ViewBuscarArtistas();

		//Recuperando o artista e a musica digitado pelo usuario
		String musica = vbm.getNome();
		String artista = vba.getNomeDoCantor();

		// percorrer ArrayList
		for (int i = 0; i < musicas.size(); i++) {
			// compara nome passado com os existentes na lista
			if (musicas.get(i).getNome().equals(musica) && musicas.get(i).getArtista().equals(artista)) {
				// Se musica e nome de artista for igual aos passados pelo usuario
				musicas.remove(i);
			}
		}

		// Percorre lista para montagem de String a ser gravada no arquivo
		String listaMusicas = "";
		for (int i = 0; i < musicas.size(); i++) {

			if (i == (musicas.size() - 1)) {
				listaMusicas += musicas.get(i).getNome() + ";" + musicas.get(i).getGenero() + ";"
						+ musicas.get(i).getAnoLancamento() + ";" + musicas.get(i).getArtista();
			} else {
				listaMusicas += musicas.get(i).getNome() + ";" + musicas.get(i).getGenero() + ";"
						+ musicas.get(i).getAnoLancamento() + ";" + musicas.get(i).getArtista() + "\n";

			}
		}

		FileWriter fw = new FileWriter(FileNameM, false);
		PrintWriter pw = new PrintWriter(fw);
		pw.println(listaMusicas);
		pw.close();

		ViewExcluirMusicas vem = new ViewExcluirMusicas();
	}
}
