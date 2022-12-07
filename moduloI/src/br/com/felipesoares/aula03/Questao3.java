package br.com.felipesoares.aula03;

import java.util.Scanner;

public class Questao3 {

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
			
			switch (scanner.nextLine().toUpperCase().trim()) {
			case "1": mensagem = "Coca-Cola - R$ 5,00";
				break;
			case "2": mensagem = "Coca-Cola 0 - R$ 4,50";
			break;
			case "3": mensagem = "Pepsi - R$ 4,40";
			break;
			case "4": mensagem = "Guaraná Antarctica - R$ 3,50";
			break;
			case "5": mensagem = "5 - Fanta Laranja - R$ 4,23";
			break;
			case "6" : case "ÁGUA": mensagem = "Água - R$ 2,50";
			break;
			default:
				mensagem = "Opção não encontrada repita a operação!";
				validador=true;
				break;
			}
			System.out.println(mensagem);
		}while(validador);
	
		scanner.close();
	}

}
