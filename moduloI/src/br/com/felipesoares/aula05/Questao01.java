package br.com.felipesoares.aula05;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Questao01 {
	public static void main(String[] args) {
		Boolean direciona;
		do {
			view.menuPrincipal();
			direciona = controller.direciona(scanner.nextLine());
		}while(direciona);
	}
	
	public static class Controller{
		
		public Boolean direciona(String opcao) {
			
			Produto produto = new Produto();
			List<Produto> listaProdutos = produto.listaProdutos();

				switch (opcao) {
				case "1":
						view.telaListaProdutos(listaProdutos);
						break;
				case "2":
						view.telaAdiciona(listaProdutos);
						List<ItensCarrinho> adicionaItemCarrinho = itens.adicionaItemCarrinho(listaProdutos);
						System.out.println(pedidos.gerarPedido(adicionaItemCarrinho));
						break;
				case "0":
						System.out.println("Obrigado Pela Visita!");
						return false;
					
				default:
					System.out.println("Opção Não Encontrada!");
				}
			return true;
		}
		
	}
	
	public static class ItensCarrinho{
		private Produto produto;
		private Integer quantidade;
		
		public ItensCarrinho(Produto produto, Integer quantidade) {
			this.produto = produto;
			this.quantidade = quantidade;
		}
		
		public ItensCarrinho() {
			
		}
		
		public List<ItensCarrinho> adicionaItemCarrinho(List<Produto> listaProdutos) {
			List<ItensCarrinho> itens =  new ArrayList<Questao01.ItensCarrinho>();
			Produto produto = new Produto();
			Integer saida;
			int quantidade;
			 do{
				view.telaIdProduto();
				int id = scanner.nextInt();
					for(int i = 0 ; i < listaProdutos.size(); i++) {
						if(listaProdutos.get(i).getIdProduto().equals(id)) {
							produto = listaProdutos.get(i);
							view.telaQuantidade();
							quantidade = scanner.nextInt();
							scanner.nextLine();
							itens.add(new ItensCarrinho(produto,quantidade));
						}
					}
				view.telaDesejaAdicionarNovoProduto();
				saida = Integer.valueOf(scanner.nextLine().trim());
				
			 	}while(saida.equals(1));
			 
			return itens;
		}
		

		public Produto getProduto() {
			return produto;
		}

		public Integer getQuantidade() {
			return quantidade;
		}
		
		@Override
		public String toString() {
			return "Produto: "+this.produto+", Quantidade: "+this.quantidade+"\n";
		}
	}
	
	public static class Pedidos{
		
		private List<ItensCarrinho> itens;
		private BigDecimal valorPedido;
		
		public String gerarPedido(List<ItensCarrinho> itens) {
			valorPedido = new BigDecimal("0");
			for(int i = 0; i < itens.size(); i++) {
				this.itens = itens;
				BigDecimal preço = itens.get(i).getProduto().getPreço();
				Integer quantidade = itens.get(i).getQuantidade();
				this.valorPedido = valorPedido.add(preço.multiply(new BigDecimal(String.valueOf(quantidade)))); 
			}
			idPedidos++;
			return"ID Pedido: " + idPedidos + " Itens Pedido: \n"+ itens + " Valor R$:" + valorPedido;
		}


		public List<ItensCarrinho> getItens() {
			return itens;
		}


		public BigDecimal getValorPedido() {
			return valorPedido;
		}


		@Override
		public String toString() {
			return "ID Pedido: "+idPedidos+" Lista de Itens: "+this.itens+" Valor do Pedido R$"+this.valorPedido;
		}
		
	}
	
	
	public static class Produto{
		
		private Integer idProduto;
		private String nome;
		private BigDecimal preço;
		
		public Produto() {
			
		}
		
		public  Produto(Integer id, String nome, String preço ) {
			this.nome = nome;
			this.preço = new BigDecimal(preço);
			this.idProduto = id;
		}
		
		public List<Produto> listaProdutos(){
			List<Produto> produtos = new ArrayList<Questao01.Produto>();
			produtos.add(produto0);
			produtos.add(produto1);
			produtos.add(produto2);
			produtos.add(produto3);
			produtos.add(produto4);
			produtos.add(produto5);
			
			return produtos;
		}
				
		
		public Integer getIdProduto() {
			return idProduto;
		}


		public String getNome() {
			return nome;
		}


		public BigDecimal getPreço() {
			return preço;
		}

		@Override
		public String toString() {
			return "Id Produto: "+ idProduto + ", Nome Produto: " + this.nome + ", Preço Produto: R$"+this.preço+"\n";
		}
	}

	public static class View{
		
		public void menuPrincipal() {
			System.out.println("++++++++++++++++++++++++++++");
			System.out.println("+        LOJA ON-LINE      +");
			System.out.println("++++++++++++++++++++++++++++");
			System.out.println("+  ESCOLHA UMA DAS OPÇÕES  +");
			System.out.println("+ 1. Ver Lista de Produtos +");
			System.out.println("+ 2. Adicionar itens       +");
			System.out.println("+ 0. Sair                  +");
			System.out.println("++++++++++++++++++++++++++++");
		}
		
		public void telaAdiciona(List<Produto> listaProdutos) {
			Produto produto = new Produto();
			System.out.println("Escolha um item da lista");
			System.out.println(listaProdutos);
		}
		
		public void telaListaProdutos(List<Produto> listaProdutos) {
			System.out.println("Lista de Produtos:");
			System.out.println(listaProdutos);
		}
		
		public void telaIdProduto() {
			System.out.println("inserir o numero do ID: ");
		}
		
		public void telaQuantidade() {
			System.out.println("Dígite a quantidade: ");
		}
		
		public void telaDesejaAdicionarNovoProduto() {
			System.out.println("Deseja adicionar um novo Produto?");
			System.out.println("1 - SIM.");
			System.out.println("Qualquer Outro Valor - NÃO.");
		}
		
	}
	
	static Produto produto0 = new Produto(0,"Notebook","4000.00");  
	static Produto produto1 = new Produto(1,"Celular","3000.00"); 
	static Produto produto2 = new Produto(2,"Monitor","2500.00");
	static Produto produto3 = new Produto(3,"Cabo HDMI","50.00"); 
	static Produto produto4 = new Produto(4,"Teclado USB","25.00"); 
	static Produto produto5 = new Produto(5,"Teclado USB","20.00");
	static View view = new View();
	static Controller controller = new Controller();
	static ItensCarrinho itens = new ItensCarrinho();
	static Pedidos pedidos = new Pedidos();
	static private Integer idPedidos = 0;
	
	static Scanner scanner = new Scanner(System.in);
}


