package intro;

import functionnal.Operation;

public class _1Intro {

	public static void main(String[] args) {

		/* Assignment Context */
		Operation addition = (a, b) -> a + b;
		System.out.println(addition.applique(4, 5));
	}

	/*
	 * Lambda : une "référence de méthode".
	 * 	une méthode anonyme
	 * 	une fonction
	 * 	un bloc de code
	 * 	
	 * Le type de la variable lambda : Une "functional interface"
	 * 	Interface avec une seule méthode (c'est la feinte)
	 * 	(attention aux default methods java 8)
	 * 
	 * Type inference
	 * 
	 * @FunctionalInterface ?
	 * 	http://www.java2s.com/Tutorials/Java/Java_Lambda/index.htm
	 * 	"Functional interfaces provide target types for lambda expressions and method references"
	 */

}
