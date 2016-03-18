package usage1;

import java.util.List;

public class _5PlusSimple {

	public static void main(String[] args) {

		List<marvel.model.Character> persos = _0GET.PERSOS();
		
		persos.removeIf(perso -> !perso.getName().contains("b"));

		System.out.println(persos);
	}

}
