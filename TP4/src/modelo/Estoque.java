package modelo;

import java.util.ArrayList;

public class Estoque {
	
	private ArrayList<Capa> capas = new ArrayList<>();
	private ArrayList<Carregador> carregadores = new ArrayList<>();
	private ArrayList<Pelicula> peliculas = new ArrayList<>();
	private ArrayList<Fone> fones = new ArrayList<>();
	private ArrayList<Venda> vendas = new ArrayList<>();

	private int qtdCarregador = 0;
	private int qtdPelicula = 0;
	private int qtdCapa = 0;
	private int qtdFone = 0;
	private int qtdVenda = 0;
	
	public void cadastraCapa(Capa c) {
		this.capas.add(c);
	}
	
	public void editaCapa(Capa c, int pos) {
		this.capas.set(pos, c);
	}
	
	public void gerarDados(){
		int aux;
		aux = 5;
		for (int i = 0; i < aux; i++) {
			capas.add(new Capa("CapaModelo" + i
					, "Proteção"
					, (aux*i)
					, "Marca" + i
					, "Material" + i
					, "Celular" + i
					, (aux*0.4)
					, "Cor" + i));
		}
			
	}
	
	public void relatorioProdutos(int qtdCarregador, int qtdPelicula, int qtdCapa, int qtdFone, int vendas) {
		String saida;
		int qtdProduto = qtdCarregador + qtdPelicula + qtdCapa + qtdFone;
		saida = "\nCarregadores registrados: " + qtdCarregador;
		saida += "\nPeliculas registradas: " + qtdPelicula;
		saida += "\nCapas registradas: " + qtdCapa;
		saida += "\nFones registrados: " + qtdFone;
		saida += "\nTotal de produtos: " + qtdProduto;
		saida += "\nVendas realizadas: " + vendas;
		System.out.println(saida);
	}
	
	public void gerarHistorico(int qtdVenda, Venda venda) {
		String saida;
		saida = "\nComprador: " + venda.getCliente().getNome();
		saida += "\nModelo comprado: " + venda.getProd().getModelo();
		saida += "\nValor: " + venda.getProd().getValor() + " R$";
		System.out.println(saida);
	}
	
	//Getters e Setters
	
	public ArrayList<Capa> getCapas() {
		return capas;
	}
	
	public void setCapas(ArrayList<Capa> capas) {
		this.capas = capas;
	}
	
	public ArrayList<Carregador> getCarregadores() {
		return carregadores;
	}
	
	public void setCarregadores(ArrayList<Carregador> carregadores) {
		this.carregadores = carregadores;
	}
	
	public ArrayList<Pelicula> getPeliculas() {
		return peliculas;
	}
	
	public void setPeliculas(ArrayList<Pelicula> peliculas) {
		this.peliculas = peliculas;
	}
	
	public ArrayList<Fone> getFones() {
		return fones;
	}
	
	public void setFones(ArrayList<Fone> fones) {
		this.fones = fones;
	}
	
	public ArrayList<Venda> getVendas() {
		return vendas;
	}

	public void setVendas(ArrayList<Venda> vendas) {
		this.vendas = vendas;
	}

	public int getQtdCarregador() {
		return qtdCarregador;
	}

	public void setQtdCarregador(int qtdCarregador) {
		this.qtdCarregador = qtdCarregador;
	}

	public int getQtdPelicula() {
		return qtdPelicula;
	}

	public void setQtdPelicula(int qtdPelicula) {
		this.qtdPelicula = qtdPelicula;
	}

	public int getQtdCapa() {
		return qtdCapa;
	}

	public void setQtdCapa(int qtdCapa) {
		this.qtdCapa = qtdCapa;
	}

	public int getQtdFone() {
		return qtdFone;
	}

	public void setQtdFone(int qtdFone) {
		this.qtdFone = qtdFone;
	}
	
	public int getQtdVenda() {
		return qtdVenda;
	}

	public void setQtdVenda(int qtdVenda) {
		this.qtdVenda = qtdVenda;
	}
	
}
