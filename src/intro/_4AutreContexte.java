package intro;

import java.util.function.BinaryOperator;

public class _4AutreContexte {

	private static Integer execute(BinaryOperator<Integer> operation) {
		
		return operation.apply(1, 2);
	}

	public static void main(String[] args) {
		
		/* Method Invocation Context */
		Integer resultat = execute((a, b) -> Math.max(a, b));
		System.out.println(resultat);
	}
}
