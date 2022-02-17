package br.com.alura.java.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TesteCopiaArquivo {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("testeCopiaArquivo.txt"); //System.in;
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		
		OutputStream os = new FileOutputStream("testeCopiaArquivo2.txt"); //System.out;
		Writer osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);
		
		String linha = br.readLine();
	
		
		while(linha != null) {
			
			bw.write(linha);
			bw.newLine();
			linha = br.readLine();
			
		}
		
		br.close();
		bw.close();

	}

}
