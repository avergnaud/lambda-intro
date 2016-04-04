package intro;

import java.util.function.BinaryOperator;

public class _3AvecReference {

	private static Integer addition(Integer a, Integer b) {
		return a + b;
	}

	public static void main(String[] args) {

		BinaryOperator<Integer> monAddition = _3AvecReference::addition;
		
		System.out.println(monAddition.apply(3, 4));
		
		/*
		 * A method reference is a syntactic shortcut for creating a lambda from
		 * an existing method. Instead of providing an implementation body, a
		 * method reference refers to an existing class's or object's method. As
		 * with a lambda, a method reference requires a target type.
		 */
	}
}
