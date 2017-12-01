package control;

import java.io.IOException;

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
    private ControleExcluirMusicas cexm;
    private ControleExcluirArtistas cexa;
	
    
	// Metodo contrutor 
	
		public ControlePrincipal() throws IOException{
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
			this.cexm = new ControleExcluirMusicas(bd);
			this.cexa = new ControleExcluirArtistas(bd);
			
			//Exibir a janela de opçoes pela primeira vez 
			
			tratarOpcao(this.vp.getOpcao());
			
		}
		

		// Metodo para tratar a opçao do artista
		
		public void tratarOpcao ( String opcao) throws IOException{
			while (true) {
				switch (opcao) {
				case "1": this.cca.cadastrarArtistas();
					break;
					
				case "2": this.ccm.cadastrarMusica();
				   break;
				   
				case "3": this.cexm.ExcluirMusicas();
				   break;
				   
				case "4": this.cexa.ExcluirArtistas();  

				case "5": this.cea.exibirArtistas();	
					break;
					
				case "6": this.cem.exibirMusicas();
					break;
					
				case "7": this.cba.buscarArtistas();
					break;
					
				case "8": this.cbm.buscarMusica();	
					break;
					
				case "9": this.cbma.buscarArtistas();
				    break;
					
				case "10": JOptionPane.showMessageDialog(null, "Até em breve!" );	
					return;
					
				default: JOptionPane.showMessageDialog(null, "Favor digitar um valor válido! ");
					break;
				}
				
				// Exibir a janela de opçoes 
				
				opcao = this.vp.getOpcao();
				
				
				
			}
		}
		

}
