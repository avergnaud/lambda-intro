package intro;

import java.util.function.BinaryOperator;

public class _3AvecReference {

	private static Integer addition(Integer a, Integer b) {

		return a + b;
	}

	public static void main(String[] args) {

		BinaryOperator<Integer> monAddition = _3AvecReference::addition;
		System.out.println(monAddition.apply(3, 4));
	}
}
