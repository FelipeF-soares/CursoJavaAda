package br.com.felipesoares.aula01;

import java.math.BigInteger;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class QuestaoUm {
	
	public static void main(String[] args) {
		
		BigInteger trimestre = new BigInteger("0");
	    String[] valores = {"10000","17000","23000"};
		
	    for(int i = 0; i < valores.length; i++) {
	    	trimestre = trimestre.add(new BigInteger(valores[i]));
	    }
	    
	    String padrao = "###,###.##";
	    DecimalFormat df = new DecimalFormat(padrao);
	    DecimalFormatSymbols dfs = new DecimalFormatSymbols(new Locale("pt", "Brazil"));
	    dfs.setDecimalSeparator(',');
	    dfs.setGroupingSeparator('.');
	    
	    df = new DecimalFormat(padrao, dfs);
	    
	    System.out.println("Gasto Total do Trimestre é R$: " + df.format(trimestre));
	}
	
	
}
