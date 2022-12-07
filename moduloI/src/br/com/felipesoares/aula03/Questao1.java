package br.com.felipesoares.aula03;

import java.util.Scanner;

public class Questao1 {

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
					if(idadeValidada>=16 && idadeValidada<18 || idadeValidada>70) {
						System.out.println("Voto  facultativo");
					}else if (idadeValidada>=18 && idadeValidada <=70) {
						System.out.println("Voto obrigatório");
					}else {
						System.out.println("Sem direito a votar");
					}
				}catch (Exception e) {
					System.out.println("Idade inválida erro "+ e.getMessage() +"\nRepita a operação:");
					validador = true;
				}
	}while(validador);
		
		scanner.close();
	}
}
