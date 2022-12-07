package br.com.felipesoares.aula06;

import java.io.File;
import java.io.IOException;

public class ExerciciosEmAula {

	public static void main(String[] args) {
		
		try {
			File arq = new File("D:\\Projetos\\Java\\LetsCodeSantander\\Exercicios\\manipulandoArquivo\\nomeDoArquivo.txt");
			arq.createNewFile();
			pegarDados();
			
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		} catch (NullPointerException e) {
			System.out.println("Executou o Cath2");
		} finally {
			System.out.println("Executou o Finally");
		}
	}
	
	public static void pegarDados() throws IOException {
		File arq = new File("D:\\Projetos\\Java\\LetsCodeSantander\\Exercicios\\manipulandoyArquivo\\nomeDoArquivo.txt");
		arq.createNewFile();
	}

}
