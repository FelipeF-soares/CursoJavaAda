package br.com.felipesoares.crud;

import java.io.IOException;

public class CrudComArquivo {

	public static void main(String[] args) throws IOException {
		ProdutoView view = new ProdutoView();
		ProdutoController controller = new ProdutoController();
		Boolean controleDeFluxo = true;
		do {
			try {
				controleDeFluxo = controller.direciona(view.menuPrincipal());
			} catch (Exception e) {
				System.out.println("erro");
			}
		}while(controleDeFluxo);
		
		
	}
	
}
