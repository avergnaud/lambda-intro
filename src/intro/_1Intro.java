package intro;

import functionnal.Operation;

public class _1Intro {

	public static void main(String[] args) {

		/* Assignment Context */
		Operation addition = (a, b) -> a + b;
		System.out.println(addition.applique(4, 5));
	}

	/*
	 * Lambda : une implementation anonyme
	 * 	une function
	 * 	une impl�mentation de functional interface
	 * 	une m�thode anonyme
	 * 	une fonction
	 * 	un bloc de code
	 * 
	 * Le type de la variable lambda : Une "functional interface"
	 * 	Interface avec une seule m�thode (c'est la feinte)
	 * 	(attention aux default methods java 8)
	 * 
	 * Type inference
	 * 	Java essaie de mapper "(a, b) -> a + b" � l'interface Operation
	 * 
	 * @FunctionalInterface ?
	 * 	http://www.java2s.com/Tutorials/Java/Java_Lambda/index.htm
	 * 	"Functional interfaces provide target types for lambda expressions and method references"
	 * 	une interface avec une m�thode (abstract...)
	 * 	attention aux default et static methods : ne comptent pas
	 * 
	 * lambda != anonymous inner class :
	 * https://youtu.be/8pDm_kH4YKY?t=49m58s
	 */

}
