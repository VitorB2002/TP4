package modelo;

import java.util.ArrayList;

public class Menu {
	static Estoque estoque;
	public static void main(String[] args) {
		
		int qtdCarregador = 0, qtdPelicula = 0, qtdCapa = 0, qtdFone = 0;
		int qtdVenda = 0;
		ArrayList<Cliente> listaCliente = new ArrayList<>();
		Estoque estoque = new Estoque();
		Estoque estoqueCapas = new Estoque();
		Estoque estoqueCarregadores = new Estoque();
		Estoque estoquePeliculas = new Estoque();
		Estoque estoqueFones = new Estoque();
		
		//Criando objetos filhos
		Carregador car = new Carregador("Usb - c", "Carregador voltado para celulares com plug c", 15.5, "Inova", 100, 2.5);
		qtdCarregador++;
		Pelicula peli = new Pelicula("3D", "Película protetora anti-impacto", 30.0, "nanoshield", "Vidro", 0.5, "Samsung A8");
		qtdPelicula++;
		Capa cap = new Capa("Anti-Impacto", "Capa anti-impacto para evitar acidentes", 20, "Incase", "Silicone2", "J7 e J5", 1.98, "Azul");
		qtdCapa++;
		Fone fon = new Fone("Headset", "Fone de qualidade", 50.0, "TWS", 0.500, "bluetooth", true, "Vermelho", "Silicone");
		qtdFone++;
		
		//Criando cliente
		Cliente cliente = new Cliente("Cleiton", "0549258234921", "Vila Mimosa", "cleiton@gmail2000.com", "61992341041");
		
		//Criando venda
		Venda venda1 = new Venda(cliente, cap);
		qtdVenda++;
		//Registrando venda no estoque
		estoqueCapas.setVendas(venda1);
		estoqueCapas.setQtdVenda(qtdVenda);
		
		listaCliente.add(cliente);
		
		//Registrando os produtos no estoque
		
		estoqueCapas.setCapas(cap);
		estoqueCapas.setQtdCapa(qtdCapa);
		
		estoqueCarregadores.setCarregadores(car);
		estoqueCarregadores.setQtdCarregador(qtdCarregador);
		
		estoquePeliculas.setPeliculas(peli);
		estoquePeliculas.setQtdPelicula(qtdPelicula);
		
		estoqueFones.setFones(fon);
		estoqueFones.setQtdFone(qtdFone);
		
		System.out.println(estoqueCapas.getCapas().get(0).toString());
		System.out.println("\n");
		System.out.println(estoqueCarregadores.getCarregadores().get(0).toString());
		System.out.println("\n");
		System.out.println(estoquePeliculas.getPeliculas().get(0).toString());
		System.out.println("\n");
		System.out.println(estoqueFones.getFones().get(0).toString());
		
		//Teste do metodo relatorio
		estoque.relatorioProdutos(estoqueCarregadores.getQtdCarregador(), estoquePeliculas.getQtdPelicula(), estoqueCapas.getQtdCapa(), estoqueFones.getQtdFone(), estoqueCapas.getQtdVenda());
		
		//Teste geração de histórico
		estoque.gerarHistorico(qtdVenda, venda1);
	}

}

