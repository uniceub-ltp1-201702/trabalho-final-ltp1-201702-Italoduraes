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
					"3 - Excluir musica\n" +
					"4 - Excluir artista\n" +
					"5 - Listar os artista\n" +
					"6 - Listar as musicas\n" +
					"7 - Buscar artista por nome\n" +
					"8 - Buscar musicas por nome\n" +
					"9 - Bucar musicas por artistas\n" +
					"10 - Sair\n");
			
			return this.opcao;
		}

}
