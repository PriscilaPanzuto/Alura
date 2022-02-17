import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestaStream {

	public static void main(String[] args) {

		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));
		
		cursos.sort(Comparator.comparingInt(Curso::getAlunos));
		cursos.forEach(c -> System.out.println(c.getAlunos()));
		
		System.out.println("---Apos filter---");
		
		
		cursos.stream().filter(c -> c.getAlunos() > 50).forEach(c -> System.out.println(c.getAlunos()));
		
		System.out.println("---Apos map---");
		
		cursos.stream().map(Curso::getNome).forEach(System.out::println);
		
	}

}
