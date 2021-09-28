package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import controle.*;

public class TelaAuxCliente {
	
	private static JFrame janela = new JFrame();
	private static JLabel titulo = new JLabel();
	private static ControleDados dados;
	private static JList<String> listaNomes = new JList<String>();
	int qtdClientes;
	int opcao;
	
	public void auxClient(int op, ControleDados d){
		
		opcao = op;
		dados = d;
		
		
		switch(opcao) {
		
			case 1:
				
				qtdClientes = dados.getDados().getClientes().size();
				String[] nomes = new String[qtdClientes];
				
				for(int i = 0; i < qtdClientes; i++) {
					nomes[i] = (dados.getDados().getClientes().get(i).getNome());
				}
				
				listaNomes = new JList<String>(nomes);
				listaNomes.setBounds(20, 50, 350, 120);
				listaNomes.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
				listaNomes.setVisibleRowCount(10);
				
				janela = new JFrame("LISTA DE CLIENTES");
				titulo = new JLabel("--Lista--");
				titulo.setFont(new Font("Arial", Font.BOLD, 20));
				titulo.setBounds(160, 10, 150, 30);
				
				janela.setLayout(null);
				janela.add(titulo);
				janela.add(listaNomes);
				janela.setSize(400, 400);
				janela.setVisible(true);
				
			break;	
		}
	}
}
