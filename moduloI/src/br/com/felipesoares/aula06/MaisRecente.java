package br.com.felipesoares.aula06;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class MaisRecente {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("D:\\Projetos\\Java\\LetsCodeSantander\\Exercicios\\manipulandoArquivo\\teste.txt");
		Files.writeString(path, "1�Linha\n",StandardCharsets.UTF_8, StandardOpenOption.APPEND);
		Files.writeString(path, "2�Linha\n",StandardCharsets.UTF_8, StandardOpenOption.APPEND);
		Files.writeString(path, "3�Linha\n",StandardCharsets.UTF_8, StandardOpenOption.APPEND);
		Files.writeString(path, "4�Linha\n",StandardCharsets.UTF_8, StandardOpenOption.APPEND);
		
		List<String> readAllLines = Files.readAllLines(path,StandardCharsets.UTF_8);
		System.out.println(readAllLines);
		
		System.out.println();
		

	}

}
