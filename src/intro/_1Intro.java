package intro;

import functionnal.Operation;

public class _1Intro {

	public static void main(String[] args) {

		/* Assignment Context */
		Operation addition = (a, b) -> a + b;
		
		System.out.println(addition.applique(4, 5));
	}

	/*
	 * The core idea of functional programming is that you can create and manipulate functions
	 * http://stackoverflow.com/questions/24279/functional-programming-and-non-functional-programming
	 * A language that considers procedures to be "first-class" allows functions to be passed around just like any other value.
	 * This means that functions are basic types and can be passed around just like integers or strings
	 * 
	 * 
	 * Lambda : une implementation anonyme
	 * 	une function
	 * 	une implémentation de functional interface
	 * 	une méthode anonyme
	 * 	une fonction
	 * 	un bloc de code
	 * 	"a lambda is just a function without a name"
	 * 
	 * Le type de la variable lambda : Une "functional interface"
	 * 	Interface avec une seule méthode (c'est la feinte)
	 * 	(attention aux default methods java 8)
	 * 
	 * Type inference
	 * 	Java essaie de mapper "(a, b) -> a + b" à l'interface Operation
	 * 
	 * @FunctionalInterface ?
	 * 	http://www.java2s.com/Tutorials/Java/Java_Lambda/index.htm
	 * 	"Functional interfaces provide target types for lambda expressions and method references"
	 * 	une interface avec une méthode (abstract...)
	 * 	attention aux default et static methods : ne comptent pas
	 * 
	 * lambda != anonymous inner class :
	 * https://youtu.be/8pDm_kH4YKY?t=49m58s
	 */

}
