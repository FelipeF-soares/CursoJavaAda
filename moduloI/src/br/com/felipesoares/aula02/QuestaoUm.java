package br.com.felipesoares.aula02;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class QuestaoUm {
	public static void main(String[] args) {
		
		String frase = "Janeiro: 1543, Fevereiro: 1222, Mar�o: 1234";
		String modelo = "###,###.##"; // ignora n�o faz parte do exercicio. 
		DecimalFormatSymbols dFormatSymbols = new DecimalFormatSymbols(new Locale("pt","Brazil")); // ignora não faz parte do exercicio.
		dFormatSymbols.setDecimalSeparator(','); // ignora não faz parte do exercicio.
		dFormatSymbols.setGroupingSeparator('.');// ignora não faz parte do exercicio.
		DecimalFormat dFormat = new DecimalFormat(modelo,dFormatSymbols);// ignora não faz parte do exercicio.
		
		
		String[] mesesValores = frase.split(",");
		BigDecimal total = new BigDecimal("0");
		
			
			for(int i = 0; i < mesesValores.length; i++) {
				String[] separaValores = mesesValores[i].split(":");
				BigDecimal subTotal = new BigDecimal(separaValores[1].trim());
				total = total.add(subTotal);
				System.out.println(mesesValores[i].trim());
		}
		
		System.out.println("Total: " + dFormat.format(total));
		
		
	}
}
