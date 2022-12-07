package br.com.felipesoares.crud;

public class ProdutoController {
	Produto produto = new Produto();
	
	public Boolean direciona(String retorno) throws Exception {
		String[] splitRetorno = splitRetorno(retorno);
		switch (splitRetorno[0]) {
		case "cadastrarproduto":
			produto.salvarProduto(splitRetorno[1]);
			break;
		case "listarproduto":
			produto.listarProduto();
			break;	
		case "atualizarproduto":
			produto.atualizarProduto(splitRetorno[1]);
			break;
		case "removerproduto":
			produto.removerProduto(splitRetorno[1]);
			break;
		case "procurarproduto":
			produto.procurarProduto(splitRetorno[1]);
			break;	
		case "sair":
			return false;
		default:
			break;
		}
		return true;
	}
	
	private String[] splitRetorno(String retorno) {
		String[] split = retorno.split(":");
		return split;
	}
}
