package br.com.felipesoares.aula02;

import java.util.Scanner;

public class ExemplosAula02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um nome:");
		String nome = scanner.next();
		
		String primeiraLetraMaiscula = nome.substring(0,1).toUpperCase();
		//Character primeiraLetraMaiscula = nome.toUpperCase().charAt(0);
		String nomeSemPrimeiraLetra = nome.substring(1);
		//System.out.println(primeiraLetraMaiscula + nomeSemPrimeiraLetra);
		System.out.println(primeiraLetraMaiscula.concat(nomeSemPrimeiraLetra));
	
		System.out.println("isEmpyt: " + nome.isEmpty());
		System.out.println("isBlanck: " + nome.isBlank());
		
		nome = "pedro bomfin costa";
		
		nome = nome.replace("bomfin", "bomfin da");
		
		/*
		 * String[] split = nome.split(" ");
		 * 
		 * split[1] += " da";
		 * 
		 * nome = String.join(" ", split);
		 * 
		 * 
		 */
		//System.out.println(split[0] + " " + split[1] + " Da " + split[2]);
		
		System.out.println(nome);
		
		scanner.close();
		
		
		
	}

}
