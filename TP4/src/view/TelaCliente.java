package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import controle.*;


public class TelaCliente implements ActionListener{
	private static JFrame janela = new JFrame("Gestor de Clientes");
	
	private static JButton listar = new JButton("Listar Clientes");
	private static JButton cadastrar = new JButton("Cadastrar Clientes");
	private static JButton buscar = new JButton("Buscar Cliente");
	private static JList<String> listaNomes = new JList<String>();
	private static ControleDados dados;
	int qtdClientes;
	
	
	
	public void mostrarTela(ControleDados d) {
		dados = d;
		qtdClientes = dados.getDados().getClientes().size();
		String[] nomes = new String[qtdClientes];
		for(int i = 0; i < qtdClientes; i++) {
			nomes[i] = (dados.getDados().getClientes().get(i).getNome());
		}
		
		listaNomes = new JList<String>(nomes);
		listaNomes.setBounds(20, 50, 350, 120);
		listaNomes.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		listaNomes.setVisibleRowCount(10);
		
		listar.setBounds(120, 50, 150 , 60);
		cadastrar.setBounds(120, 100, 150, 60);
		buscar.setBounds(120, 150 , 150, 60);
		janela.setLayout(null);
		
		janela.add(listar);
		janela.add(cadastrar);
		janela.add(buscar);
		janela.setSize(400, 300);
		
		janela.setVisible(true);
		listar.addActionListener(this);
		cadastrar.addActionListener(this);
		buscar.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		if (src == listar) {
			new TelaAuxCliente().auxClient(1, dados);
		}
		
		if (src == cadastrar) {
			
		}
		
		if (src == buscar) {
			
		}
		
	}
}
