package xebia;

import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Supplier;

public class Exemples {

	public static void main(String[] args) {
		// http://xebia-france.github.io/functional-programming-java8/
		
		//Lambda version longue (input) -> {code}
		Function<String,Integer> myFunction = (String input) -> {return input.length();};
		// le compilateur deduit le type des parametres d'entrees donc pas necessaire
		myFunction = (input) -> {return input.length();};
		// un seul argument en entree pas besoin de parentheses
		myFunction = input -> {return input.length();};
		// une seule instruction on peut supprimer les accolades et le return
		myFunction = input -> input.length();
		
		// Instance Method reference
		myFunction = String::length;
		/*
		 * looks like a static method but it is not. Java knows that length is an instance method...
		 * that does not take any parameters. Java uses the parameter supplied at runtime as the instance
		 * on which the method is called!!!
		 * Equivalent input -> input.length()
		 * String myString = "toto";
		 * Supplier<Integer> sinon = myString::length;
		 * */
		
		// Static method reference
		IntFunction myFunction2 = Math::abs; //Equivalent input -> Math.abs(input)
		myFunction2.apply(-10);
		// Constructor reference
		Function<String,StringBuilder> myFunction3 = StringBuilder::new; //Equivalent input -> new StringBuilder(input)
		StringBuilder sb = myFunction3.apply("Hello1");

	}

}
