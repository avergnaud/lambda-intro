package ocp;

import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

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
		 * looks like a static method but it is not. Java knows that isEmpty is an instance method...
		 * that does not take any parameters. Java uses the parameter supplied at runtime as the instance
		 * on which the method is called!!!
		 * Supplier<Boolean> sinon = toto::isEmpty;
		 */
		System.out.println("mr.test(\"hello\") : " + mr.test("hello"));
		System.out.println("mr.test(\"\") : " + mr.test(""));
		
		/* https://docs.oracle.com/javase/8/docs/api/java/util/function/Function.html */
		
		/* 
		 * looks like a static method but it is not...
		 * Supplier<Integer> sinon = "hello world"::length;
		 * */
		Function<String,Integer> f1 = String::length;
		System.out.println(f1.apply("hello world"));
	}

	/*http://stackoverflow.com/questions/30514995/what-is-the-difference-between-a-lambda-and-a-method-reference-at-a-runtime-leve*/
	
}
