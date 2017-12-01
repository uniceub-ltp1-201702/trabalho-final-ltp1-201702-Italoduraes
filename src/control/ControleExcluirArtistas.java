package control;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import model.Artistas;
import model.BD;
import view.ViewBuscarArtistas;
import view.ViewExcluirArtistas;

public class ControleExcluirArtistas {
	
	// Atributo 
		private BD bd;

		public ControleExcluirArtistas(BD bd) {
			this.bd = bd;
		}

	
		public void ExcluirArtistas()
				throws IOException {

			// cria e iniciar o arquivo
			String FileNameA = "Artistas.txt";

			// Recupera o ArrayList de artistas
			ArrayList<Artistas> artistas = bd.getArtistas();

			// instanciar a view
			ViewBuscarArtistas  vba = new ViewBuscarArtistas();

			//Recuperando o artista digitado pelo usuario
			String artista = vba.getNomeDoCantor();

			// percorrer ArrayList
			for (int i = 0; i < artistas.size(); i++) {
				// compara nome passado com os existentes na lista
				if (artistas.get(i).getNomeDoCantor().equals(artista)) {
					// Se o nome de artista for igual aos passados pelo usuario
					artistas.remove(i);
				}
			}

			// Percorre lista para montagem de String a ser gravada no arquivo
			String listaArtistas = "";
			for (int i = 0; i < artistas.size(); i++) {

				if (i == (artistas.size() - 1)) {
					listaArtistas += artistas.get(i).getNomeDoCantor() + ";" + artistas.get(i).getIdade();
				} else {
					listaArtistas += artistas.get(i).getNomeDoCantor() + ";" + artistas.get(i).getIdade() + "\n";
				}
			}

			FileWriter fw = new FileWriter(FileNameA, false);
			PrintWriter pw = new PrintWriter(fw);
			pw.println(listaArtistas);
			pw.close();

			ViewExcluirArtistas vea = new ViewExcluirArtistas();
		}

}
