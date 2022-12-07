package br.com.felipesoares.aula01;

import java.util.Scanner;

public class QuestaoDois {

	public static void main(String[] args) {
		
		final double DECIMAIS = 0.023;
		int idade;
		double numeroDaSorte;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digíte a sua Idade:");
		idade = scanner.nextInt();
		numeroDaSorte = (double)idade + DECIMAIS;
		
		System.out.println("Seu numero da Sorte é "+numeroDaSorte);
		
		scanner.close();
		
	}

}
