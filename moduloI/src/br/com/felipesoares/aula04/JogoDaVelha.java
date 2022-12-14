package br.com.felipesoares.aula04;

import java.util.Scanner;

public class JogoDaVelha {
	  static Scanner scanner = new Scanner(System.in);
	   static String [][] tabuleiro = {{"_","_","_"}
	                                   ,{"_","_","_"}
	                                   ,{"_","_","_"}};
	   public static void main(String[] args) {

	       boolean continuar = true;
	       while (continuar) {
	           jogada(1);
	           continuar = mostrarResultado();
	           jogada(2);
	           continuar = mostrarResultado();
	       }
	   }
	   
	   
	   public static Boolean mostrarResultado(){
		   Integer jogadorVencedor = verificarResultado();
          if(jogadorVencedor!=null) {
       	   if(jogadorVencedor.equals(1)) {
       		   System.out.println("Jogador 01 ? o vencedor! =D");
       	   }else {
       		   System.out.println("Jogador 02 ? o vencedor! =D");
       	   }
       	   return false;
          }
          return true;
	   }
	   
	   public static void jogada(int jogador){
	       boolean escolhaCorreta= false;
	       do {
	           System.out.println("Vez do jogador "+jogador+"?");
	           System.out.println("Escreve a posi??o da coluna 1 a 3.");
	           int coluna = scanner.nextInt();
	           System.out.println("Escreve a posi??o da linha 1 a 3.");
	           int linha = scanner.nextInt();
	           if (tabuleiro[linha-1][coluna-1].equals("_")){
	               tabuleiro[linha-1][coluna-1] = (jogador==1)?"X":"O";
	               escolhaCorreta = true;
	           } else {
	               System.out.println("Espa?o j? selecionado!");
	           }

	           imprimeTabuleiro(tabuleiro);
	       }while (!escolhaCorreta);

	   }
	   
	   
	   public static Integer verificarResultado(){
		  
		  if (
	       		   !tabuleiro[2][0].equals("_") 
	       		   && tabuleiro[2][0].equals(tabuleiro[1][1]) 
	       		   && tabuleiro[1][1].equals(tabuleiro[0][2])) {
	       	   return tabuleiro[2][0].equals("X")?1:2;
		  }
		  
		  if (
      		   !tabuleiro[0][0].equals("_") 
      		   && tabuleiro[0][0].equals(tabuleiro[1][1]) 
      		   && tabuleiro[1][1].equals(tabuleiro[2][2])) {
			  return tabuleiro[0][0].equals("X")?1:2;
         }
		   
	       for (int i = 0; i < tabuleiro.length; i++){
	           if (
	        		   !tabuleiro[i][0].equals("_") 
	        		   && tabuleiro[i][0].equals(tabuleiro[i][1]) 
	        		   && tabuleiro[i][1].equals(tabuleiro[i][2])) {
	        	   return tabuleiro[i][0].equals("X")?1:2;
	           }
	           for (int j = 0; j < tabuleiro[i].length; j++){
	        	   if (
		        		   !tabuleiro[0][j].equals("_") 
		        		   && tabuleiro[0][j].equals(tabuleiro[1][j]) 
		        		   && tabuleiro[1][j].equals(tabuleiro[2][j])) {
	        		   return tabuleiro[0][j].equals("X")?1:2;
		           }
	           }
	       }
	       
	       return null;
	   }
	   
	   
	   public static void imprimeTabuleiro(String [][] tabuleiro){
	       System.out.println("\n");
	       for (String[] linha : tabuleiro){
	           for (String coluna : linha){
	               System.out.print(coluna+"\t");
	           }
	           System.out.println();
	       }
	       System.out.println("\n");
	   }

	

}
