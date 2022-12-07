package br.com.felipesoares.aula03;

import java.util.Scanner;

public class Questao4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String mensagem;
		Boolean validador;
		do {
			System.out.println("***********************************");
			System.out.println("*        Máquina de Bebidas       *");
			System.out.println("*      Escolha uma das opções:    *");
			System.out.println("***********************************");
			System.out.println("* 1 - Coca-Cola - R$ 5,00         *");
			System.out.println("* 2 - Coca-Cola 0 - R$ 4,50       *");
			System.out.println("* 3 - Pepsi - R$ 4,40             *");
			System.out.println("* 4 - Guaraná Antarctica - R$ 3,50*");
			System.out.println("* 5 - Fanta Laranja - R$ 4,23     *");
			System.out.println("* Água - R$ 2,50                  *");
			System.out.println("***********************************");
			
			validador = false;
			
			String opcao = scanner.nextLine()
					.toUpperCase()
					.trim();
			
			if(opcao.equals("1")) {
				mensagem = "Coca-Cola - R$ 5,00";
			}else if(opcao.equals("2")) {
				mensagem = "Coca-Cola 0 - R$ 4,50";
			}else if(opcao.equals("3")){
				mensagem = "Pepsi - R$ 4,40";
			}else if(opcao.equals("4")){
				mensagem = "Guaraná Antarctica - R$ 3,50";
			}else if(opcao.equals("5")){
				mensagem = "5 - Fanta Laranja - R$ 4,23";
			}else if(opcao.equals("6") || opcao.equals("ÁGUA")){
				mensagem = "Água - R$ 2,50";
			}else {
				mensagem = "Opção não encontrada repita a operação!";
				validador=true;
			}
			System.out.println(mensagem);
		}while(validador);
	
		scanner.close();
	}

}
