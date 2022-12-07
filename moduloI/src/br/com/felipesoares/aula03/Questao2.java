package br.com.felipesoares.aula03;

import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String idade;
		Boolean validador = true;
		do {
			System.out.println("*****************************");
			System.out.println("*     Idade para Votar      *");
			System.out.println("*****************************");
			
			System.out.println("Dígite a sua idade");
			idade = scanner.nextLine();
			try {
				Integer idadeValidada = Integer.valueOf(idade);
				validador = false;
				String mensagem = (idadeValidada>=16 && idadeValidada<18 || idadeValidada>70 ? "Voto  facultativo"
						: (idadeValidada>=18 && idadeValidada <=70 ? "Voto obrigatório"
								: "Sem direito a votar" ));
				System.out.println(mensagem);
			}catch (Exception e) {
				System.out.println("Idade inválida erro "+ e.getMessage() +"\nRepita a operação:");
				validador = true;
			}
	}while(validador);
		scanner.close();
	}
}
