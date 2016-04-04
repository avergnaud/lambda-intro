package usage1;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import marvel.model.Character;

public class _4AvecStream {

	public static void main(String[] args) {

		List<marvel.model.Character> persos = _0GET.PERSOS();

		Predicate<marvel.model.Character> contientB = perso -> perso.getName().contains("b");

		
		
		
		
		
		List<Character> resultat = persos.stream()
				.filter(contientB)
				.collect(Collectors.toList());

		System.out.println(resultat);
	}

}
