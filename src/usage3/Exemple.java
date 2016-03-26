package usage3;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import marvel.model.Character;
import usage1._0GET;

public class Exemple {

	public static void main(String[] args) {

		List<marvel.model.Character> persos = _0GET.PERSOS();
		
		//AVANT - ANONYMOUS INNER CLASS :
		Comparator<marvel.model.Character> nameComparator = new Comparator<marvel.model.Character>() {
			@Override
			public int compare(Character o1, Character o2) {
				return o2.getName().compareTo(o1.getName());
			}
		};

		//APRES - LAMBDA :
		nameComparator = (o1,o2) -> o2.getName().compareTo(o1.getName());
		
		//APRES - METHODE REFERENCE :
		nameComparator = Exemple::monComparateur;
		
		Collections.sort(persos, nameComparator);
		System.out.println(persos.get(0).getName());
	}

	/* pour l'exemple : */
	static int monComparateur(Character o1, Character o2) {
		return o2.getName().compareTo(o1.getName());
	}
}
