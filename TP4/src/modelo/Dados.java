package modelo;

import java.util.ArrayList;

public class Dados {
	
	private ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	
	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}
	
	public void cadastraCliente(Cliente c) {
		this.clientes.add(c);
	}
	
	public void editaCliente(Cliente c, int pos) {
		this.clientes.set(pos, c);
	}
	
	public void gerarDados(){
		
		clientes.add(new Cliente("A", "B", "C", "D", "E"));
		
	}
}
