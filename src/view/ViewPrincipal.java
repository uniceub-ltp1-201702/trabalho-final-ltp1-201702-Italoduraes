package view;

import javax.swing.JOptionPane;

public class ViewPrincipal {
	
	//atributos
		private String opcao;
		
		//Metodo para exibir a lista de opcoes
		public String getOpcao(){
			
			this.opcao =  JOptionPane.showInputDialog(
					"Escolha uma opção\n" +
					"1 - Cadastrar artista\n" +
					"2 - Cadastrar musica\n"	+	
					"3 - Listar os artista\n" +
					"4 - Listar as musicas\n" +
					"5 - Buscar artista por nome\n" +
					"6 - Buscar musicas por nome\n" +
					"7 - Bucar musicas por artistas\n" +
					"8 - Sair\n");
			
			return this.opcao;
		}

}
