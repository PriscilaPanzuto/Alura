package br.com.alura.java.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TesteEscritaFileWriter {

	public static void main(String[] args) throws IOException {
		
//		OutputStream os = new FileOutputStream("testeJavaEntradaDados2.txt");
//		Writer osw = new OutputStreamWriter(os);
//		BufferedWriter bw = new BufferedWriter(osw);
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("testefilewriter.txt"));
		
		bw.write("Teste de escrita em arquivos com o FileWriter e BufferedWriter.");	
		bw.newLine();
		bw.write("Hello Word!");
		
		bw.close();
		
   }
}
