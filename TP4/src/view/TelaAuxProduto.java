package view;

import controle.*;

public class TelaAuxProduto {
	
	private static String[] produtos;
	int opcao;
	
	public void auxProduto(int op, String[] dadosProduto, ControleEstoque e) {
		
		produtos = dadosProduto;
		opcao = op;
		
		switch(opcao) {
		
			case 1:
				System.out.println("Capa");
			break;
			
			case 2:
				System.out.println("Carregador");
			break;
			
			case 3:
				System.out.println("Pelicula");
			break;
			
			case 4:
				System.out.println("Fone");
			break;
		
		}
		
	}
}
