package controle;

import modelo.*;

public class ControleEstoque {
private Estoque e = new Estoque();
	
	public ControleEstoque() {
		e.gerarDados();
	}

	public Estoque getEstoque() {
		return e;
	}

	public void setEstoque(Estoque e) {
		this.e = e;
	}
	
	public boolean editarCadastrarProduto(String[] dadosProduto, int opcao, int pos) {
		
		float valor = Float.parseFloat(dadosProduto[2]);
		
		if(opcao == 1) {
			float peso = Float.parseFloat(dadosProduto[6]);
			Capa c = new Capa(dadosProduto[0]
					, dadosProduto[1]
					, valor
					, dadosProduto[3]
					, dadosProduto[4]
					, dadosProduto[5]
					, peso
					, dadosProduto[7]);
			e.cadastraCapa(c);
		}	else {
			/*Capa c = new Capa(dadosProduto[0],dadosProduto[1],dadosProduto[2],dadosProduto[3],dadosProduto[4]);
			d.editaCliente(c, pos);
			*/
		}
		
		return true;
	}
}
