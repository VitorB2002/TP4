package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JList;
import controle.*;

public class TelaAuxCliente implements ActionListener{
	
	private static JFrame janela = new JFrame();
	private static JLabel titulo = new JLabel();
	private static JLabel nome = new JLabel("Nome: ");
	private static JLabel cpf = new JLabel("CPF: ");
	private static JLabel endereco = new JLabel("Endereço: ");
	private static JLabel email = new JLabel("Email: ");
	private static JLabel telefone = new JLabel("Telefone: ");
	private static JButton salvar = new JButton("Salvar");
	private static JButton buscar = new JButton("Buscar");
	private static ControleDados dados;
	private static JList<String> listaNomes = new JList<String>();
	private JTextField inNome;
	private JTextField inCpf;
	private JTextField inEndereco;
	private JTextField inEmail;
	private JTextField inTelefone;
	
	
	int qtdClientes;
	int opcao;
	
	public void auxClient(int op, ControleDados d){
		
		opcao = op;
		dados = d;
		
		String[] dadosCliente = new String[5];
		dadosCliente[0] = "Vitor";
		dadosCliente[1] = "0525324935";
		dadosCliente[2] = "Vila da alegria";
		dadosCliente[3] = "Vitob.santos@gmail.com";
		dadosCliente[4] = "61992151043";
		dados.editarCadastrarCliente(dadosCliente, 1, 2);
		System.out.print("\n\n\n" + dados.getDados().getClientes().get(2).getNome());
		
		switch(opcao) {
			
			//Listar clientes
			case 1:
				
				//Obtendo nomes para a lista
				qtdClientes = dados.getDados().getClientes().size();
				String[] nomes = new String[qtdClientes];
				
				for(int i = 0; i < qtdClientes; i++) {
					nomes[i] = (dados.getDados().getClientes().get(i).getNome());
				}
				
				listaNomes = new JList<String>(nomes);
				listaNomes.setBounds(20, 50, 350, 200);
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
			
			case 2:
				
				janela = new JFrame("CADASTRO");
				titulo = new JLabel("--Cadastrar--");
				salvar.setBounds(120, 290, 75, 25);
				
				inNome = new JTextField(100);
				inCpf = new JTextField(11);
				inEndereco = new JTextField(100);
				inEmail = new JTextField(100);
				inTelefone = new JTextField(11);
				
				inNome.setBounds(120, 80, 200, 25);
				inCpf.setBounds(120, 120, 200, 25);
				inEndereco.setBounds(120, 160, 200, 25);
				inEmail.setBounds(120, 200, 200, 25);
				inTelefone.setBounds(120, 240, 200, 25);
				
				nome.setBounds(50, 80, 200, 25);
				cpf.setBounds(50, 120, 200, 25);
				endereco.setBounds(50, 160, 200, 25);
				email.setBounds(50, 200, 200, 25);
				telefone.setBounds(50, 240, 200, 25);
				
				janela.setLayout(null);
				titulo.setFont(new Font("Arial", Font.BOLD, 20));
				titulo.setBounds(135, 10, 150, 30);
				
				janela.add(titulo);
				janela.add(salvar);
				janela.add(inNome);
				janela.add(inCpf);
				janela.add(inEndereco);
				janela.add(inEmail);
				janela.add(inTelefone);
				janela.add(nome);
				janela.add(cpf);
				janela.add(endereco);
				janela.add(email);
				janela.add(telefone);
				janela.setSize(400, 400);
				janela.setVisible(true);
				
				salvar.addActionListener(this);
				
			break;
			
			case 3:
				
				janela = new JFrame("BUSCAR");
				titulo = new JLabel("--Busca--");
				inNome = new JTextField(100);
				buscar.setBounds(120, 100, 75, 25);
				
				
				nome.setBounds(50, 70, 200, 25);
				inNome.setBounds(120, 70, 200, 25);
				
				janela.setLayout(null);
				titulo.setFont(new Font("Arial", Font.BOLD, 20));
				titulo.setBounds(145, 10, 150, 30);
				
				janela.add(titulo);
				janela.add(buscar);
				janela.add(nome);
				janela.add(inNome);
				janela.setSize(400, 200);
				janela.setVisible(true);
				
				buscar.addActionListener(this);
				
			break;	
		}
	}
	
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		if(src == salvar) {
			String[] dadosCliente = new String[5];
			dadosCliente[0] = inNome.getText();
			dadosCliente[1] = inCpf.getText();
			dadosCliente[2] = inEndereco.getText();
			dadosCliente[3] = inEmail.getText();
			dadosCliente[4] = inTelefone.getText();
			
			dados.editarCadastrarCliente(dadosCliente, 1, 0);
		}
		
		if (src == buscar) {
			String[] dadosCliente = new String[5];
			dadosCliente[0] = inNome.getText();
			qtdClientes = dados.getDados().getClientes().size();
			
			for(int i = 0; i < qtdClientes; i++) {
				if (dadosCliente[0].equals(dados.getDados().getClientes().get(i).getNome())) {
					System.out.println("FODA DEMAIS");
				}
			}
		}
		
		
		
	}
}
