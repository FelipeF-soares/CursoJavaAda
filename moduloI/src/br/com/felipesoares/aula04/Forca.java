package br.com.felipesoares.aula04;

import java.io.IOException;
import java.util.Scanner;

public class Forca {
	static Scanner scanner = new Scanner(System.in);
	static String palavraSecreta;
	static Character[] arraySecreto;
	static Character[] arrayLetraEncontradas;
	static Integer chances = 5;
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		mensagem(6);
		Character[] letrasSecretas = recebePalavra(scanner.nextLine());
		mensagem(7);
		exibir(letrasSecretas);
		mensagem(8);
		arrayLetraEncontradas = new Character[palavraSecreta.length()];
		String letra = scanner.nextLine();
		System.out.println("Suas Chances São: " + placar(letra));
		Character[] arrayLetraEncontradas = letraJogador(letra);
		letrasEncontradas(arrayLetraEncontradas);
			while(chances>0) {
				mensagem(8);
				letra = scanner.nextLine();
				System.out.println("Suas Chances São: " + placar(letra));
				arrayLetraEncontradas = proximaLetra(letra);
				letrasEncontradas(arrayLetraEncontradas);
		}
			
	}
	
	public static void mensagem(Integer numeroMesagem) {
		switch (numeroMesagem) {
		case 6:
			System.out.println("JOGO DA FORCA");
			System.out.println("Escolha uma palavra secreta para o seu adversário:");
			break;
		case 7:	
			System.out.println("JOGO DA FORCA");
			System.out.println("___________");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			break;
		case 8:	
			System.out.print("Escolha uma Letra:");
			break;	
		case 4:	
			System.out.println("JOGO DA FORCA");
			System.out.println("___________");
			System.out.println("|        ()");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			break;
		case 3:	
			System.out.println("JOGO DA FORCA");
			System.out.println("___________");
			System.out.println("|        ()");
			System.out.println("|       /||\\");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			break;	
		case 2:	
			System.out.println("JOGO DA FORCA");
			System.out.println("___________");
			System.out.println("|        ()");
			System.out.println("|       /||\\");
			System.out.println("|        ==");
			System.out.println("|");
			System.out.println("|");
			break;
		case 1:	
			System.out.println("JOGO DA FORCA");
			System.out.println("___________");
			System.out.println("|        ()");
			System.out.println("|       /||\\");
			System.out.println("|        ==");
			System.out.println("|       / \\");
			System.out.println("|");
			break;
		case 0:	
			System.out.println("JOGO DA FORCA");
			System.out.println("___________");
			System.out.println("|        ()");
			System.out.println("|       /||\\");
			System.out.println("|        ==");
			System.out.println("|       / \\");
			System.out.println("|Fim De Jogo!");
			break;	
		default:
			break;
		}
		
	}
	
	public static Character[] recebePalavra(String palavra) {
		palavraSecreta = palavra.toUpperCase().trim();
		arraySecreto = new Character[palavra.length()];
		for(int i = 0; i < palavra.length(); i++) {
			arraySecreto[i] = palavraSecreta.charAt(i);
		}
		return arraySecreto;
	}
	
	public static void exibir(Character[] letrasSecretas ) {
		System.out.println("Tente advinhar a palavra secreta você tem 5 chances.");
		for(int i = 0; i < letrasSecretas.length; i++) {
			System.out.print("_ ");
		}
		System.out.println();
	}
	
	public static Character[] letraJogador(String letra) {
		char charAt = letra.toUpperCase().trim().charAt(0);
		for(int i = 0; i < palavraSecreta.length(); i++ ) {
			if(arraySecreto[i].equals(charAt)) {
				arrayLetraEncontradas[i] = charAt;
			}else {
				arrayLetraEncontradas[i] = '_';
			}
		}
		
		return arrayLetraEncontradas;
	}
	
	public static void letrasEncontradas(Character[] arrayLetraEncontradas) {
		for(int i = 0; i < arrayLetraEncontradas.length; i++) {
			System.out.print(" " + arrayLetraEncontradas[i] + " ");
		}
		System.out.println();
	}
	
	public static Character[] proximaLetra(String letra) {
		char charAt = letra.toUpperCase().trim().charAt(0);
		for(int i=0; i < arrayLetraEncontradas.length; i++) {
			if(arraySecreto[i].equals(charAt) || arrayLetraEncontradas[i] != '_') {
				if(arraySecreto[i].equals(charAt)) {
					arrayLetraEncontradas[i] = charAt;
				}else {
					arrayLetraEncontradas[i] = arrayLetraEncontradas[i];
				}
				
			}else {
				arrayLetraEncontradas[i] = '_';
			}
		}
		return arrayLetraEncontradas;
		
	}
	
	static public Integer placar(String letra) {
		char charAt = letra.toUpperCase().trim().charAt(0);
		for(int i = 0; i < arraySecreto.length; i++) {
			if(arraySecreto[i].equals(charAt)) { 
				return chances;
			}
		}
		--chances;
		mensagem(chances);
		 return chances;
	}
	

}
