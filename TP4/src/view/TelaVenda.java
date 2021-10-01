package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import controle.*;

public class TelaVenda implements ActionListener{
	
	private static ControleEstoque estoque;
	private static ControleDados dados;
	private static JFrame janela = new JFrame("Gestor de Vendas");
	private static JFrame janelaCadastra = new JFrame("Cadastro de Venda");
	private static JLabel titulo = new JLabel("--Vendas--");
	private static JButton cadastra = new JButton("Cadastrar");
	private static JButton edita = new JButton("Editar");
	private static JButton ajuda = new JButton("Ajuda");
	private static JButton escolha = new JButton("Escolha");
	private static String[] dadosCliente = new String[5];
	private static String[] dadosProduto = new String[9];
	private boolean sucesso;
	private JLabel modelo = new JLabel("Modelo:");
	private JLabel nome = new JLabel("Nome:");
	private JTextField inModelo;
	private JTextField inNome;
	
	public void mostrarTela(ControleEstoque e, ControleDados d) {
		
		estoque = e;
		dados = d;
		
		//Titulo inicial
		titulo.setFont(new Font("Arial", Font.BOLD, 20));
		titulo.setBounds(145, 10, 150, 30);
		
		cadastra.setBounds(120, 40, 150, 60);
		edita.setBounds(120, 110, 150, 60);
		ajuda.setBounds(120, 180, 150, 60);
		
		janela.add(titulo);
		janela.add(cadastra);
		janela.add(edita);
		janela.add(ajuda);
		
		janela.setLayout(null);
		janela.setSize(400,300);
		janela.setVisible(true);
		
		edita.addActionListener(this);
		cadastra.addActionListener(this);
		ajuda.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		if(src == cadastra) {
			cadastrarVenda();
		}
		
		if(src == edita) {
			
		}
		
		if(src == ajuda) {
			
		}
		
		if(src == escolha) {
			int tamanho = 0;
			int opcao = 0;
			boolean sucessoCliente = false;
			boolean sucessoProduto = false;
			
			String aux;
			
			dadosCliente[0] = inNome.getText();
			aux = inModelo.getText();
			
			//Buscando capas que deem match
			tamanho = estoque.getEstoque().getCapas().size();
			
			for(int i = 0; i < tamanho; i++) {
				
				if(aux.equals(estoque.getEstoque().getCapas().get(i).getModelo())) {
					sucessoProduto = true;
					dadosProduto[0] = estoque.getEstoque().getCapas().get(i).getModelo();
					dadosProduto[1] = estoque.getEstoque().getCapas().get(i).getDescricao();
					dadosProduto[2] = Double.toString(estoque.getEstoque().getCapas().get(i).getValor());
					dadosProduto[3] = estoque.getEstoque().getCapas().get(i).getMarca();
					dadosProduto[4] = estoque.getEstoque().getCapas().get(i).getMaterial();
					dadosProduto[5] = estoque.getEstoque().getCapas().get(i).getCelularCompativel();
					dadosProduto[6] = Double.toString(estoque.getEstoque().getCapas().get(i).getPeso());
					dadosProduto[7] = estoque.getEstoque().getCapas().get(i).getCor();
					
					opcao = 1;
					i = tamanho;
				}
			}
			
			//Buscando carregadores que deem match
			tamanho = estoque.getEstoque().getCarregadores().size();
			
			for(int i = 0; i < tamanho; i++) {
				
				if(aux.equals(estoque.getEstoque().getCarregadores().get(i).getModelo())) {
					sucessoProduto = true;
					opcao = 2;
					i = tamanho;
				}
			}
			
			//Buscando peliculas que deem match
			tamanho = estoque.getEstoque().getPeliculas().size();
			
			for(int i = 0; i < tamanho; i++) {
				
				if(aux.equals(estoque.getEstoque().getPeliculas().get(i).getModelo())) {
					sucessoProduto = true;
					opcao = 3;
					i = tamanho;
				}
			}
			
			//Buscando fones que deem match
			tamanho = estoque.getEstoque().getFones().size();
			
			for(int i = 0; i < tamanho; i++) {
				
				if(aux.equals(estoque.getEstoque().getPeliculas().get(i).getModelo())) {
					sucessoProduto = true;
					opcao = 4;
					i = tamanho;
				}
			}
			
			
			
			tamanho = dados.getDados().getClientes().size();
			
			for(int i = 0; i < tamanho; i++) {
				
				if(dadosCliente[0].equals(dados.getDados().getClientes().get(i).getNome())) {
					sucessoCliente = true;
					dadosCliente[0] = dados.getDados().getClientes().get(i).getNome();
					dadosCliente[1] = dados.getDados().getClientes().get(i).getCpf();
					dadosCliente[2] = dados.getDados().getClientes().get(i).getEndereco();
					dadosCliente[3] = dados.getDados().getClientes().get(i).getEmail();
					dadosCliente[4] = dados.getDados().getClientes().get(i).getTelefone();
					i = tamanho;
				}
			}
			
			if(sucessoCliente && sucessoProduto) {
				mensagemSucessoCadastro();
				estoque.CadastrarVenda(dadosCliente, dadosProduto, opcao);
				System.out.println(estoque.getEstoque().getVendas().get(0).getCliente().getNome());
				System.out.println(estoque.getEstoque().getVendas().get(0).getProd().getModelo());
			} else {
				mensagemFalhaCadastro();
			}
			
		}

	}
	
	public void cadastrarVenda() {
		
		
		titulo = new JLabel("Cadastro de Venda");
		titulo.setFont(new Font("Arial", Font.BOLD, 20));
		titulo.setBounds(110, 10, 200, 30);
		
		inNome = new JTextField(100);
		inModelo = new JTextField(40);
		
		inNome.setBounds(120, 80, 200, 25);
		inModelo.setBounds(120, 120, 200, 25);
		modelo.setBounds(70, 120, 50, 25);
		nome.setBounds(70, 80, 50, 25);
		escolha.setBounds(120, 160, 200, 25);
		ajuda.setBounds(120, 200, 100, 25);
		
		janelaCadastra.add(nome);
		janelaCadastra.add(modelo);
		janelaCadastra.add(escolha);
		janelaCadastra.add(inModelo);
		janelaCadastra.add(inNome);
		janelaCadastra.add(titulo);
		janelaCadastra.add(ajuda);
		
		janelaCadastra.setLayout(null);
		janelaCadastra.setSize(400, 300);
		janelaCadastra.setVisible(true);
		
		escolha.addActionListener(this);
		ajuda.addActionListener(this);
			
	}
	
	public void mensagemSucessoCadastro() {
		
		JOptionPane.showMessageDialog(null, "A venda foi registrada" 
		+ "", null, 
				JOptionPane.INFORMATION_MESSAGE);
		
	}
	
	public void mensagemFalhaCadastro() {
		
		JOptionPane.showMessageDialog(null, "A venda não foi registrada" 
		+ "\nOs dado inseridos não batem com um cliente ou produto" 
		+ "\n(Ou ambos)", null, 
				JOptionPane.ERROR_MESSAGE);
		
	}
	
}