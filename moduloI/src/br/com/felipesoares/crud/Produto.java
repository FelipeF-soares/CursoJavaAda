package br.com.felipesoares.crud;

import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class Produto {
	private String id;
	private String nome;
	private BigDecimal valor;
	private Integer quantidade;
	
	
	
	public Produto(String id, String nome, BigDecimal valor, Integer quantidade) {
		this.id = id;
		this.nome = nome;
		this.valor = valor;
		this.quantidade = quantidade;
	}
	
	public Produto() {
		
	}

	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}


	public Path getPath() {
		return path;
	}


	public void setPath(Path path) {
		this.path = path;
	}


	public static Long getIdSequencia() {
		return idSequencia;
	}


	public static void setIdSequencia(Long idSequencia) {
		Produto.idSequencia = idSequencia;
	}
	Path path = Paths.get("C:\\cadastroprodutos\\produtos.txt");
	
	private static Long idSequencia = 1l;
	
	  public void salvarProduto(String produto) throws Exception { 
		  if(!Files.exists(path)) { 
			  Files.createFile(path); 
			  } 
	  Long size =(long) Files.readAllLines(path).size();
	  List<String> verificaId = Files.readAllLines(path); for(int i = 0; i
	  <verificaId.size(); i++){ String id = verificaId.get(i); id =
	  produto.split("\\|")[0]; if(String.valueOf(size).equals(id)) {
	  
	  }
	  
	  }
	  
	  String[] split = produto.split("&"); 
	  String nomeProduto = split[1]; 
	  String valorProduto = split[2]; 
	  String quantidade = split[3]; 
	  Files.writeString(path, idSequencia + " | " + nomeProduto + " | " + valorProduto + " | " + quantidade + "\n", StandardOpenOption.APPEND); 
	  idSequencia++;
	  }
	 

	public void listarProduto() throws Exception {
		List<String> listaProdutos = Files.readAllLines(path);
		String nomeProduto;
		String valorProduto;
		String id;
		String quantidade;

		for (String produto : listaProdutos) {
			id = produto.split("\\|")[0];
			nomeProduto = produto.split("\\|")[1];
			valorProduto = produto.split("\\|")[2];
			quantidade = produto.split("\\|")[3];
			System.out.println("ID: " + id + " Nome Produto: " + nomeProduto + " Valor R$" + valorProduto
					+ " Quantidade: " + quantidade);
		}

	}

	public void atualizarProduto(String produto) throws Exception {
		String[] split = produto.split("&");
		String id = split[0];
		String nomeProduto = split[1];
		String valorProduto = split[2];
		String quantidade = split[3];
		String novoConteudo = id + " | " + nomeProduto + " | " + valorProduto + " | " + quantidade + "\n";

		List<String> listaProdutos = Files.readAllLines(path);
		listaProdutos.set(Integer.parseInt(id), novoConteudo);

		String valorAtualizado = String.join("\n",
				listaProdutos.toString().substring(1, listaProdutos.toString().length() - 1).split(","));
		Files.writeString(path, valorAtualizado);
	}

	public void removerProduto(String produto) throws Exception {
		String[] split = produto.split("&");
		String id = split[0];

		List<String> listaProdutos = Files.readAllLines(path);
		listaProdutos.remove(Integer.parseInt(id));
		Files.write(path, listaProdutos);

	}

	public void procurarProduto(String produto) throws Exception {
		String[] split = produto.split("&");
		String id = split[0];

		List<String> listaProdutos = Files.readAllLines(path);
		String produtos = listaProdutos.get(Integer.parseInt(id));
		String ids = produtos.split("\\|")[0];
		String nomeProduto = produtos.split("\\|")[1];
		String valorProduto = produtos.split("\\|")[2];
		String quantidade = produto.split("\\|")[3];
		System.out.println("ID: " + ids + " Nome Poduto: " + nomeProduto + " Valor R$" + valorProduto + " Quantidade: "+quantidade);

	}
	
	public Produto comprarProduto(String idProduto) throws Exception {
		String[] split = idProduto.split("&");
		String id = split[0];

		List<String> listaProdutos = Files.readAllLines(path);
		String produtos = listaProdutos.get(Integer.parseInt(id));
		String ids = produtos.split("\\|")[0];
		String nomeProduto = produtos.split("\\|")[1];
		String valorProduto = produtos.split("\\|")[2];
		String quantidade = produtos.split("\\|")[3];
		
		return new Produto(ids,nomeProduto,new BigDecimal(valorProduto),Integer.valueOf(quantidade));
		
		
	}
	 public void validarCompra(Produto produto){
		 List<Produto> listaCompra = new ArrayList<Produto>();
		 
	 }
	

}
