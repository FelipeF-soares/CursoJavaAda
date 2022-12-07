package br.com.felipesoares.aula04;

import java.util.List;

public class ExerciciosAula {

	public static void main(String[] args) {
		/*
		 * Scanner scanner = new Scanner(System.in); boolean controle = false;
		 * 
		 * while(controle) { System.out.println("1.Cadastra Produto \n 0.Sair"); int
		 * entrada = scanner.nextInt(); if(entrada == 0) controle = true; }
		 */
		/*
		 * int[] lista = {1,2,3,4,5,6,7,8,9,10}; repetir(lista, 0);
		 */
		/*
		 * int[] lista = {1,2,3,4,5,6,7,8,9,10};
		 * 
		 * for(int numero : lista) { System.out.println(numero); }
		 */
		
		/*
		 * List<String> outraLista = List.of("enzo", "agamenon", "amanda","pedro");
		 * outraLista.forEach(nome -> { String primeiraLetra =
		 * nome.substring(0,1).toUpperCase(); String restoDoNome =
		 * nome.substring(1,nome.length()); String nomeTodo = primeiraLetra +
		 * restoDoNome; System.out.println(nomeTodo); });
		 */
		
	}
	
	// função Recursiva
	public static void repetir (int[] lista, int numeroDeRepeticao) {
		if(lista.length > numeroDeRepeticao) {
			System.out.println(lista[numeroDeRepeticao]);
			repetir(lista, ++numeroDeRepeticao);
		}
	}

}
