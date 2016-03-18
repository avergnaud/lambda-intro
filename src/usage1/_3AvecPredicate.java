package usage1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import marvel.model.Character;

public class _3AvecPredicate {

	public static void main(String[] args) {

		List<marvel.model.Character> persos = _0GET.PERSOS();

		Predicate<marvel.model.Character> contientB = perso -> perso.getName().contains("b");

		List<Character> resultat = new ArrayList<>();
		for (Character perso : persos) {
			if (contientB.test(perso)) {
				resultat.add(perso);
			}
		}

		System.out.println(resultat);
	}

}
