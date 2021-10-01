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
		pelicula.setBounds(140, 190, 100, 30);
		fone.setBounds(140, 240, 100, 30);
		
		janela.add(titulo);
		janela.setLayout(null);
		janela.setSize(400, 400);
		janela.add(capa);
		janela.add(carregador);
		janela.add(fone);
		janela.add(pelicula);
		
		janela.setVisible(true);
		capa.addActionListener(this);
		carregador.addActionListener(this);
		pelicula.addActionListener(this);
		fone.addActionListener(this);
		
		//TESTES NO CONSOLE
		
		//CAPA
		String[] dadosProduto = new String[8];
		dadosProduto[0] = "CAPAO"; 
		dadosProduto[1] = "MUITA PROTECAO";
		dadosProduto[2] = "25.5";
		dadosProduto[3] = "ASD";
		dadosProduto[4] = "GASREH";
		dadosProduto[5] = "ARSDGH";
		dadosProduto[6] = "34";
		dadosProduto[7] = "Vermei";
		
		//Cadastro
		estoque.editarCadastrarProduto(dadosProduto, 1, 0);
		System.out.println("TESTES NO CONSOLE");
		System.out.println("\n\nCadastro de capa: ");
		System.out.println("\nCapa indice 5:\n" + estoque.getEstoque().getCapas().get(5).toString());
		System.out.println("\nCapa indice 0:\n" + estoque.getEstoque().getCapas().get(0).toString());
		//Edição
		estoque.editarCadastrarProduto(dadosProduto, 2, 0);
		System.out.println("\nEdição de capa indice 5 para 0: \n" + estoque.getEstoque().getCapas().get(0).toString());
		
		
		//CARREGADOR
		String[] dadosProduto2 = new String[6];
		dadosProduto2[0] = "CARREGADORZAO"; 
		dadosProduto2[1] = "MUITA CARREGAÇÃO";
		dadosProduto2[2] = "23.0";
		dadosProduto2[3] = "ASD";
		dadosProduto2[4] = "2";
		dadosProduto2[5] = "5";
		
		//Cadastro
		estoque.editarCadastrarProduto(dadosProduto2, 3, 0);
		System.out.println("\n\nCadastro de carregador: ");
		System.out.println("\nCarregador indice 5:\n" + estoque.getEstoque().getCarregadores().get(5).toString());
		System.out.println("\nCarregador indice 0:\n" + estoque.getEstoque().getCarregadores().get(0).toString());
		//Edição
		estoque.editarCadastrarProduto(dadosProduto2, 4, 0);
		System.out.println("\nEdição de carregador indice 5 para 0: \n" + estoque.getEstoque().getCarregadores().get(0).toString());
		
		//Pelicula
		String[] dadosProduto3 = new String[7];
		dadosProduto3[0] = "PELICULAA"; 
		dadosProduto3[1] = "SUPER PROTEÇÃO";
		dadosProduto3[2] = "22.0";
		dadosProduto3[3] = "ASD";
		dadosProduto3[4] = "MATERIAL";
		dadosProduto3[5] = "24.0";
		dadosProduto3[6] = "FON";
		
		//Cadastro
		estoque.editarCadastrarProduto(dadosProduto3, 5, 0);
		System.out.println("\n\nCadastro de Pelicula: ");
		System.out.println("\nPelicula indice 5:\n" + estoque.getEstoque().getPeliculas().get(5).toString());
		System.out.println("\nPelicula indice 0:\n" + estoque.getEstoque().getPeliculas().get(0).toString());
		//Edição
		estoque.editarCadastrarProduto(dadosProduto3, 6, 0);
		System.out.println("\nEdição de Pelicula indice 5 para 0: \n" + estoque.getEstoque().getPeliculas().get(0).toString());
		
		//Fone
		String[] dadosProduto4 = new String[9];
		dadosProduto4[0] = "Fonão"; 
		dadosProduto4[1] = "SUPER Alto";
		dadosProduto4[2] = "55.0";
		dadosProduto4[3] = "ASD";
		dadosProduto4[4] = "2.8";
		dadosProduto4[5] = "In ear";
		dadosProduto4[6] = "s";
		dadosProduto4[7] = "Vermelho";
		dadosProduto4[8] = "Couro";
		
		//Cadastro
		estoque.editarCadastrarProduto(dadosProduto4, 7, 0);
		System.out.println("\n\nCadastro de Fone: ");
		System.out.println("\nFone indice 5:\n" + estoque.getEstoque().getFones().get(5).toString());
		System.out.println("\nFone indice 0:\n" + estoque.getEstoque().getFones().get(0).toString());
		//Edição
		estoque.editarCadastrarProduto(dadosProduto4, 8, 0);
		System.out.println("\nEdição de Fone indice 5 para 0: \n" + estoque.getEstoque().getFones().get(0).toString());
	}
	
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		if(src == capa) {
			aux = 8;
			String[] dadosProduto = new String[aux];
			new TelaAuxProduto().auxProduto(1, dadosProduto, estoque);
		}
		
		if(src == carregador) {
			aux = 6;
			String[] dadosProduto = new String[aux];
			new TelaAuxProduto().auxProduto(2, dadosProduto, estoque);
		}
		
		if(src == pelicula) {
			aux = 8;
			String[] dadosProduto = new String[aux];
			new TelaAuxProduto().auxProduto(3, dadosProduto, estoque);
		}
		
		if(src == fone) {
			aux = 9;
			String[] dadosProduto = new String[aux];
			new TelaAuxProduto().auxProduto(4, dadosProduto, estoque);
		}
	}
}