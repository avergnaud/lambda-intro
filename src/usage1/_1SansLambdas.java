package usage1;

import java.util.ArrayList;
import java.util.List;

import marvel.model.Character;
import functionnal.MonPredicatPerso;

public class _1SansLambdas {

	public static void main(String[] args) {

		List<marvel.model.Character> persos = _0GET.PERSOS();

		MonPredicatPerso contientB = new MonPredicatPerso() {
			@Override
			public boolean estOk(Character perso) {
				return perso.getName().contains("b");
			}
		};

		List<Character> resultat = new ArrayList<>();
		for (Character perso : persos) {
			if (contientB.estOk(perso)) {
				resultat.add(perso);
			}
		}

		System.out.println(resultat);
	}

}
