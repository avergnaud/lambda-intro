package intro;

import java.util.function.BinaryOperator;
import java.util.function.Predicate;

public class _5MethodReference {

	private static Integer execute(BinaryOperator<Integer> operation) {

		return operation.apply(3, 4);
	}

	public static void main(String[] args) {

		/* Method Invocation Context */
		Integer resultat = execute(Math::max); /* method reference */
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
		
		/*
		 * FunctionalInterface var = anonymous inner class
		 * FunctionalInterface var = lambda expression;
		 * FunctionalInterface var = method reference;
		 * 
		 */
		String str = "hello";
		Predicate<String> methodRef = str::startsWith;
		Predicate<String> lambda = s -> str.startsWith(s);
		
		System.out.println(methodRef.test("h"));
		System.out.println(lambda.test("h"));
	}
}
