package ocp;

import java.util.function.Predicate;

public class MR {

	public static void main(String[] args) {
		
		/* Predicate<String> instanceMR = String::startsWith;
		Cannot make a static reference to the non-static method startsWith(String) from the type String
		> en effet, sur quelle instance va-t-on appeler startsWith ? */
		
		String toto = "toto";
		Predicate<String> instanceMR = toto::startsWith;
		System.out.println("instanceMR.test(\"to\") : " + instanceMR.test("to"));
		
		Predicate<String> mr = String::isEmpty;
		/*
		 * looks like a static method but it is not. Java knows that isEmpty es an instance method...
		 * that does not take any parameters. Java uses the parameter supplied at runtime as the instance
		 * on which the method is called!!!
		 */
		System.out.println("mr.test(\"hello\") : " + mr.test("hello"));
		System.out.println("mr.test(\"\") : " + mr.test(""));
	}

	/*http://stackoverflow.com/questions/30514995/what-is-the-difference-between-a-lambda-and-a-method-reference-at-a-runtime-leve*/
	
}
