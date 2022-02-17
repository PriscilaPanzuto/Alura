import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class TestaMetodosDefault {

	public static void main(String[] args) {


		List<String> palavras = new ArrayList<String>();
		palavras.add("palavra");
		palavras.add("casa");
		palavras.add("notebook");
		palavras.add("amo");
		palavras.add("paralelepipedo");
		
		//sort feito com lambda de um Comparator
//		palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
				
		//Com method reference
		palavras.sort(Comparator.comparing(String::length));
		
		//Comparador feito com uam classe q implementa Comparator
//		Comparator<String> comparador = new ComparadorPorTamanho();
//		
//		palavras.sort(comparador);
		
		//Foreach feito através de um Consumer
//		Consumer<String> consumidor = new ImprimeNaLinha();
//		
//		palavras.forEach(consumidor);
		
		
		//forEach feito através de um lambda, onde implicitamente, seria como uma simplificacao de uma classe
		//anonima.Seria criado o new Consumer como parametro, mas como só implementa accept, podemos
		//simplificar muita coisa tornando o código com apenas umas linha, a referencia do parametro e a 
		//execução.
//		palavras.forEach(s -> System.out.println(s));
		
		//foreach feito atraves de method reference
		palavras.forEach(System.out::println);

	}
}


