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
	private static ControleDados dados;
	
	public void mostrarTela(ControleDados d) {
		
		dados = d;
		
		//Dimensionamento
		listar.setBounds(120, 40, 150 , 60);
		cadastrar.setBounds(120, 110, 150, 60);
		buscar.setBounds(120, 180 , 150, 60);
		
		//Adicionando componentes ao JFrame
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
			new TelaAuxCliente().auxClient(2, dados);
		}
		
		if (src == buscar) {
			new TelaAuxCliente().auxClient(3, dados);
		}
		
	}
}
