package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class TelaMenu implements ActionListener {
	
	private static JFrame janela = new JFrame("Acess�rios p/ Celular");
	private static JLabel titulo = new JLabel("MENU");
	private static JButton clientes = new JButton("Clientes");
	private static JButton produto = new JButton("Produtos");
	private static JButton relatorio = new JButton("Relatorios");
	private static JButton ajuda = new JButton("Ajuda");
	
	public TelaMenu() {
		
		//Titulo inicial
		titulo.setFont(new Font("Arial", Font.BOLD, 20));
		titulo.setBounds(160, 10, 150, 30);
		
		
		//Tamanho e posicionamento dos bot�es
		produto.setBounds(140, 100, 100, 30);
		relatorio.setBounds(140, 150, 100, 30);
		clientes.setBounds(140, 50, 100, 30);
		ajuda.setBounds(140, 200, 100, 30);
		
		//Adicionando componentes ao Jframe
		janela.setLayout(null);
		janela.add(ajuda);
		janela.add(titulo);
		janela.add(clientes);
		janela.add(produto);
		janela.add(relatorio);
		
		janela.setSize(400, 200);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TelaMenu menu = new TelaMenu();
		
		//Leitor de a��o
		clientes.addActionListener(menu);
		relatorio.addActionListener(menu);
		produto.addActionListener(menu);
	}
	
	public void actionPerformed(ActionEvent e) {
		
	}

}