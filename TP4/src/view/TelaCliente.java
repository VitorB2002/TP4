package view;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TelaCliente implements ActionListener{
	private static JFrame janela = new JFrame("Gestor de Clientes");
	private static JLabel titulo = new JLabel("CLIENTES");
	
	
	public TelaCliente() {
		titulo.setFont(new Font("Arial", Font.BOLD, 20));
		titulo.setBounds(160, 10, 150, 30);
		
		
		janela.add(titulo);
		janela.setSize(400, 200);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
	}
}
