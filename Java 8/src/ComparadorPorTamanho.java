import java.util.Comparator;

public class ComparadorPorTamanho implements Comparator<String>{

		@Override
		public int compare(String s1, String s2) {
			return s1.length() - s2.length();
		}
		
		
	}