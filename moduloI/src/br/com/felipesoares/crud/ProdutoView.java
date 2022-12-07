package br.com.felipesoares.crud;

import java.util.Scanner;

public class ProdutoView {
	Scanner scanner = new Scanner(System.in);
	public String menuPrincipal() {
		Boolean saida;
		String retorno=null;
		do {
			System.out.println("+-------------------------------+");
			System.out.println("+-            MENU             -+");
			System.out.println("+-------------------------------+");
			System.out.println("+    Escolha Uma das Opções     +");
			System.out.println("+ 1. Cadastrar Produto          +");
			System.out.println("+ 2. Listar Produto             +");
			System.out.println("+ 3. Atualizar Produto por Id   +");
			System.out.println("+ 4. Remover Produto por Id     +");
			System.out.println("+ 5. Procurar Produto  por Id   +");
			System.out.println("+ 6. Comprar Produto  por Id    +");
			System.out.println("+ 0. Sair                       +");
			System.out.println("+-------------------------------+");
			try {
				switch (Integer.valueOf(scanner.nextLine())) {
				case 1:
					retorno = menuCadastrarProduto();
					saida = false;
					break;
				case 2:
					retorno = menuListaProduto();
					saida = false;
					break;
				case 3:
					retorno = menuAtualizarProduto();
					saida = false;
					break;
				case 4:
					retorno = menuRemoverProduto();
					saida = false;
					break;
				case 5:
					retorno = menuProcurarProduto();
					saida = false;
					break;
				
				case 6: menuComprarProduto(); 
				saida = false; 
				break;
				 
				case 0:
					retorno = menuSair();
					saida = false;
					break;
				default:
					mensagemValorNaoEncontrado();
					saida = true;
					break;
				}
				
			}catch (Exception e) {
				System.out.println("Dígite apenas numeros para escolher uma opção!");
				saida = true;
			}
			
		}while(saida);
		return retorno;
		
	}

	private String menuCadastrarProduto() {
		System.out.println("Dígite o nome do Produto: ");
		String nome = scanner.nextLine().toLowerCase().trim();
		System.out.println("Dígite o Valor do Produto: ");
		String valor = scanner.nextLine().toLowerCase().trim();
		System.out.println("Dígite o Quantidade do Produto: ");
		String quantidade = scanner.nextLine().toLowerCase().trim();
		return "cadastrarproduto:"+"&"+nome+"&"+valor+"&"+quantidade;
	}

	private String menuListaProduto() {
		return "listarproduto:";
	}

	private String menuAtualizarProduto() {
		System.out.println("Dígite o ID do produto: ");
		String id = scanner.nextLine().toLowerCase().trim();
		System.out.println("Dígite o nome do Produto: ");
		String nome = scanner.nextLine().toLowerCase().trim();
		System.out.println("Dígite o Valor do Produto: ");
		String valor = scanner.nextLine().toLowerCase().trim();
		System.out.println("Dígite o Quantidade do Produto: ");
		String quantidade = scanner.nextLine().toLowerCase().trim();
		return "atualizarproduto:"+id+"&"+nome+"&"+valor+"&"+quantidade;
	}

	private String menuRemoverProduto() {
		System.out.println("Dígite o ID do produto: ");
		String id = scanner.nextLine().toLowerCase().trim();
		return "removerproduto:"+id+"&";
		
	}
	
	private String menuProcurarProduto() {
		System.out.println("Dígite o ID do produto: ");
		String id = scanner.nextLine().toLowerCase().trim();
		return "procurarproduto:"+id+"&";
		
	}

	private String menuSair() {
		return "sair";
		
	}

	private void mensagemValorNaoEncontrado() {
		System.out.println("Valor Inválido Repita a operação");
		
	}
	
	
	  private void menuComprarProduto() { 
		  this.menuListaProduto();
		  Produto produto = new Produto();
		  try {
			Produto comprarProduto = produto.comprarProduto(scanner.nextLine());
			produto.validarCompra(comprarProduto);
		} catch (Exception e) {
			e.printStackTrace();
		}
		  
	  
	  }
	 


}
