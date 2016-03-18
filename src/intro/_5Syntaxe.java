package intro;

import java.util.function.BinaryOperator;

public class _5Syntaxe {

	private static Integer execute(BinaryOperator<Integer> operation) {

		return operation.apply(3, 4);
	}

	public static void main(String[] args) {

		/* Method Invocation Context */
		Integer resultat = execute(Math::max);
		System.out.println(resultat);

		/*
		 * Ici execute attend un paramètre de type BinaryOperator<Integer>
		 * 
		 * https://docs.oracle.com/javase/8/docs/api/java/util/function/BinaryOperator.html 
		 * 
		 * i.e. une méthode avec cette signature : 
		 * Integer apply(Integer t, Integer u)
		 * 
		 * https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html
		 * public static int max(int a, int b)
		 * 
		 * > ok
		 */
	}
}
