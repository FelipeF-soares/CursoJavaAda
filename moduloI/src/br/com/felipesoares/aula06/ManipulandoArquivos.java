package br.com.felipesoares.aula06;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ManipulandoArquivos {

	public static void main(String[] args) throws IOException {
		File arq = new File("D:\\Projetos\\Java\\LetsCodeSantander\\Exercicios\\manipulandoArquivo\\nomeDoArquivo.txt");
		arq.createNewFile();
		
		PrintWriter pWrite = new PrintWriter(new FileOutputStream(arq,false)); // O new FileOutputStream(arq,true) serve para manter o texto
		pWrite.println("1º Linha");
		pWrite.println("2º Linha");
		pWrite.println("3º Linha");
		pWrite.println("4º Linha");
		pWrite.close();
		
		BufferedReader bufferedReader = new BufferedReader(new FileReader(arq));
		while(bufferedReader.ready()) {
			String readLine = bufferedReader.readLine();
			System.out.println(readLine);
		}
		
		bufferedReader.close();
		
	//	FileReader fileReader = new FileReader(arq);
	
		
		
		/*
		 * FileWriter writer = new FileWriter(arq); writer.write("Primeira Escrita \n");
		 * writer.append("Segunda Linha \n").append("Terceira Linha \n");
		 * writer.close();
		 */
		

	}

}
