package br.com.alura.java.io;

import java.io.IOException;
import java.io.PrintStream;

public class TestePrintStream {

	public static void main(String[] args) throws IOException {
		
//		OutputStream os = new FileOutputStream("testeJavaEntradaDados2.txt");
//		Writer osw = new OutputStreamWriter(os);
//		BufferedWriter bw = new BufferedWriter(osw);
		
		//BufferedWriter bw = new BufferedWriter(new FileWriter("testefilewriter.txt"));
		
		PrintStream ps = new PrintStream("testePrintStream.txt");
		
		ps.println("Teste com PrintScream e metodo println");
		ps.println();
		ps.println("o println ja faz a quebra para a próxima linha");
		
//		bw.write("Teste de escrita em arquivos com o FileWriter e BufferedWriter.");	
//		bw.newLine();
//		bw.write("Hello Word!");
		
		ps.close();
		
   }
}
