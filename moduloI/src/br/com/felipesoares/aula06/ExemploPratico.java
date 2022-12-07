package br.com.felipesoares.aula06;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class ExemploPratico {
	static Scanner scanner =  new Scanner(System.in);
	static Path path = Paths.get("D:\\Projetos\\Java\\LetsCodeSantander\\Exercicios\\manipulandoArquivo\\exemploPratico.txt");
	public static void main(String[] args) throws IOException {
		
		boolean continua = true;
		while(continua) {
			System.out.println("Menu");
			System.out.println("1 - Cadastrar contato");
			System.out.println("2 - Listar contato");
			System.out.println("3 - Sair");
			switch (scanner.nextLine()) {
			case "1":
					System.out.println("Digite o nome");
					cadastrarContato(scanner.nextLine());
				break;
			case "2":
					System.out.println("Lista de Contato");
					
				break;
			case "3":
				continua=false;
				break;	
			default:
				break;
			}
		}
		
		
		
	}
	public static void cadastrarContato(String contato) throws IOException {
		Files.writeString(path, contato +"\n",StandardCharsets.UTF_8, StandardOpenOption.APPEND);
	}

}
