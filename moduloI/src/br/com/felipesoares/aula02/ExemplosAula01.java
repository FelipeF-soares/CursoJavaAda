package br.com.felipesoares.aula02;

import java.util.Scanner;

public class ExemplosAula01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		/*
		 * System.out.println("Digite sua idade"); int nextInt = scanner.nextInt();
		 * System.out.println("Sua idade "+nextInt);
		 * System.out.println("Digite seu nome"); String next = scanner.next();
		 * System.out.println("Seu nome é "+next);
		 */
		
		String emailLogin = "teste@gmail.com";
		
		System.out.println("Digite seu email");
		String email = scanner.nextLine();
		
		System.out.println(emailLogin
				.equals(email
						.toLowerCase()
						.trim()));
		String emailDepoisArroba = email.substring(email.indexOf("@"));
		
		System.out.println("Contem @ " + email.contains("@"));
		System.out.println("Contem . "+ email.contains("."));
		System.out.println("Tamanho do email: " + email.length());
		System.out.println("Tamanho minimo: " + (email.length()>=5));
		System.out.println("Validar caracteres antes do @: " + (email.indexOf("@")>0));
		System.out.println("Validar caracteres antre @ e . " + emailDepoisArroba.indexOf("."));
		System.out.println("Validar caracter depois do . " + (emailDepoisArroba.length()>emailDepoisArroba.indexOf(".")+1));
		String[] teste = email.split("@");
		System.out.println( "Quantidade de Arrobas @" + (teste.length-1));
		
		
		
		
		
		scanner.close();
		
	}
	
}
