package bytebank;

import java.io.IOException;
import java.util.Scanner;

public class TestaDIO {
		
	    public static void main(String[] args) throws IOException {
	        Scanner leitor = new Scanner(System.in);
	//declare suas variaveis corretamente
	        int par = 0;
	        int impar = 0;
	        int positivo = 0;
	        int negativo = 0;
	//continue a solução
	        for (int i = 1; i <= 5; i++) {
	        	System.out.println("Qual o numero: ");
	        	int a = leitor.nextInt();
	        	if (a == 0) {
	        		par += 1;
	        		continue;
	        	}
	        	if (a % 2 == 0) {
	        		par += 1;
	        	} else {
	        		impar += 1;
	        	}
	        	if (a >= 1) {
	        		positivo += 1;
	        	} else {
	        		negativo += 1;
	        	}
	        }
	//insira suas variaveis corretamente
	        System.out.println(par + " par(es)");
	        System.out.println(impar + " impar(es)");
	        System.out.println(positivo + " positivo(s)");
	        System.out.println(negativo + " negativo(s)");
	}

}

