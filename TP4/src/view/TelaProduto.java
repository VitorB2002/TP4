package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import controle.*;

public class TelaProduto implements ActionListener{
	private static JFrame janela = new JFrame("Gestor de Produtos");
	private static JLabel titulo = new JLabel("PRODUTOS");
	private static JButton capa = new JButton("Capa");
	private static JButton carregador = new JButton("Carregador");
	private static JButton fone = new JButton("Fone");
	private static JButton pelicula = new JButton("Pelicula");
	private static ControleEstoque estoque;
	
	int aux;
	
	public void mostrarTela(ControleEstoque e) {
		estoque = e;
		titulo.setFont(new Font("Arial", Font.BOLD, 20));
		titulo.setBounds(135, 30, 150, 30);
		
		capa.setBounds(140, 90, 100, 30);
		carregador.setBounds(140, 140, 100, 30);
		fone.setBounds(140, 190, 100, 30);
		pelicula.setBounds(140, 240, 100, 30);
		
		janela.add(titulo);
		janela.setLayout(null);
		janela.setSize(400, 400);
		janela.add(capa);
		janela.add(carregador);
		janela.add(fone);
		janela.add(pelicula);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
		String[] dadosProduto = new String[8];
		dadosProduto[0] = "CAPAO"; 
		dadosProduto[1] = "MUITA PROTECAO";
		dadosProduto[2] = "25.5";
		dadosProduto[3] = "ASD";
		dadosProduto[4] = "GASREH";
		dadosProduto[5] = "ARSDGH";
		dadosProduto[6] = "34";
		dadosProduto[7] = "Vermei";
		estoque.editarCadastrarProduto(dadosProduto, 1, 0);
		System.out.println(estoque.getEstoque().getCapas().get(5).toString());
	}
	
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		if(src == capa) {
			aux = 8;
			String[] dadosProduto = new String[aux];
			
		}
	}
}