package br.com.alura.java.io;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteEscrita {

	public static void main(String[] args) throws IOException {
		
		OutputStream os = new FileOutputStream("testeJavaEntradaDados2.txt");
		Writer osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);
		
		bw.write("Teste de escrita em arquivos com o Writer.");	
		bw.newLine();
		bw.write("Hello Word!");
		
		bw.close();
		
   }
}
