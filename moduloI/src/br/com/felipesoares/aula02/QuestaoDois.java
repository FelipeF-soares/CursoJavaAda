package br.com.felipesoares.aula02;

public class QuestaoDois {

	public static void main(String[] args) {
		String nome = "João Mario da Silva";
		String[] divideNome = nome.split(" ");
		
		for(int i = 0; i < divideNome.length; i++) {
			System.out.print(" !"+divideNome[i]);
		}

	}

}
