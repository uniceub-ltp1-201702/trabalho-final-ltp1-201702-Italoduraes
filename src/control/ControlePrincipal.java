package control;

import javax.swing.JOptionPane;

import model.BD;

import view.ViewPrincipal;

public class ControlePrincipal {
	
	//Atributos
	
	private BD bd;
	private ViewPrincipal vp;
	private ControleExibirArtistas cea;
	private ControleExibirMusicas cem;
    private ControleCadastrarArtistas cca;
    private ControleCadastrarMusicas ccm;
    private ControleBuscarArtistas cba;
    private ControleBuscarMusicas cbm;
    private ControleBuscaMusicasDoArtista cbma;
	
	// Metodo contrutor 
	
		public ControlePrincipal(){
			// instanciar o objeto BD
			this.bd = new BD();
			
			//Instanciar a ViewPrincipal
			this.vp = new  ViewPrincipal();
			
			
		// Carregar os artistas do arquivo para jogar no ControleExibirArtistas	
			bd.carregarArtistas();
	   
	    // Carregar musicas do arquivo para jogar no ControleExibirMusicas		
			bd.carregarMusicas();
			
		// Criar controles 
			//this.cee= new ControleExibeEmprestimos(bd);
			this.cea = new ControleExibirArtistas(bd);
			this.cem = new ControleExibirMusicas(bd);
			this.cca = new ControleCadastrarArtistas(bd);
			this.ccm = new ControleCadastrarMusicas(bd);
			this.cba =new ControleBuscarArtistas(bd);
			this.cbm = new ControleBuscarMusicas(bd);
			this.cbma = new ControleBuscaMusicasDoArtista(bd);
			
			//Exibir a janela de opçoes pela primeira vez 
			
			tratarOpcao(this.vp.getOpcao());
			
		}
		

		// Metodo para tratar a opçao do artista
		
		public void tratarOpcao ( String opcao){
			while (true) {
				switch (opcao) {
				case "1": this.cca.cadastrarArtistas();
					break;
					
				case "2": this.ccm.cadastrarMusica();
				   break;

				case "3": this.cea.exibirArtistas();	
					break;
					
				case "4": this.cem.exibirMusicas();
					break;
					
				case "5": this.cba.buscarArtistas();
					break;
					
				case "6": this.cbm.buscarMusica();	
					break;
					
				case "7": this.cbma.buscarArtistas();
				    break;
					
				case "8": JOptionPane.showMessageDialog(null, "Até breve!" );	
					return;
					
				default: JOptionPane.showMessageDialog(null, "Favor digitar um valor válido! ");
					break;
				}
				
				// Exibir a janela de opçoes 
				
				opcao = this.vp.getOpcao();
				
				
				
			}
		}
		

}
