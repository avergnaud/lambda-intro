package xebia;

import java.util.function.Function;
import java.util.function.IntFunction;

public class Exemples {

	public static void main(String[] args) {
		// http://xebia-france.github.io/functional-programming-java8/
		
		//Lambda version longue (input) -> {code}
		Function<String,Integer> myFunction = (String input) -> {return input.length();};
		// le compilateur déduit le type des paramètres d'entrées donc pas nécéssaire
		myFunction = (input) -> {return input.length();};
		// un seul argument en entrée pas besoin de parenthèses
		myFunction = input -> {return input.length();};
		// une seule instruction on peut supprimer les accolades et le return
		myFunction = input -> input.length();
		
		// Instance Method reference
		myFunction = String::length; //Equivalent input -> input.length()
		
		// Static method reference
		IntFunction myFunction2 = Math::abs; //Equivalent input -> Math.abs(input)
		// Constructor reference
		Function<String,StringBuilder> myFunction3 = StringBuilder::new; //Equivalent input -> new StringBuilder(input)

	}

}
