package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import controle.*;

public class TelaMenu implements ActionListener {
	
	private static JFrame janela = new JFrame("Acessórios p/ Celular");
	private static JLabel titulo = new JLabel("MENU");
	private static JButton clientes = new JButton("Clientes");
	private static JButton produto = new JButton("Produtos");
	private static JButton relatorio = new JButton("Relatorios");
	private static JButton ajuda = new JButton("Ajuda");
	private static String[] dadosCliente = new String[5];
	private static ControleDados dados = new ControleDados();
	
	public TelaMenu() {
		
		//Titulo inicial
		titulo.setFont(new Font("Arial", Font.BOLD, 20));
		titulo.setBounds(160, 10, 150, 30);
		
		
		//Tamanho e posicionamento dos botões
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
		
		janela.setSize(400, 400);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TelaMenu menu = new TelaMenu();
		System.out.print("TESTE NO CONSOLE");
		System.out.print("\n" + dados.getDados().getClientes().get(0).getNome());
		
		dadosCliente[0] = "Vitor";
		dadosCliente[1] = "0525324935";
		dadosCliente[2] = "Vila da alegria";
		dadosCliente[3] = "Vitob.santos@gmail.com";
		dadosCliente[4] = "61992151043";
		dados.editarCadastrarCliente(dadosCliente, 2, 0);
		
		
		System.out.print("\n" + dados.getDados().getClientes().get(0).getNome());
		System.out.print("\n" + dados.getDados().getClientes().get(1).getNome());
		System.out.print("\n" + dados.getDados().getClientes().get(2).getNome());
		System.out.print("\n" + dados.getDados().getClientes().get(3).getNome());
		System.out.print("\n" + dados.getDados().getClientes().get(4).getNome());
		//Leitor de ação
		clientes.addActionListener(menu);
		relatorio.addActionListener(menu);
		produto.addActionListener(menu);
		ajuda.addActionListener(menu);
	}
	
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		if(src == clientes)
			new TelaCliente().mostrarTela(dados);;
		
		if(src == produto)
			new TelaProduto();
		
		if(src == relatorio)
			new TelaRelatorio();
		
		if(src == ajuda)
			new TelaAjuda();
	
	}

}
