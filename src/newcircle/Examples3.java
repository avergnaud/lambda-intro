package newcircle;

interface UsingString {
	void go(String string);
}

public class Examples3 {

	public static void main(String[] args) {
		UsingString affiche = s -> System.out.println(s);
		affiche.go("hello");

		UsingString affiche2 = System.out::println;
		affiche2.go("world");
		/*
		 * However, we could also make the observation that the method println
		 * has the same signature that our Consumer has, it receives an integer
		 * and does something with it, in this case it prints it to the main
		 * output.
		 * 
		 * However, we cannot specify that this is an arbitrary instance method
		 * reference by saying PrintStream::println, because in this case the
		 * Consumer interface method accept does not receive as one of its
		 * arguments the PrintStream object on which we may want to invoke the
		 * method println. Conversely, we already know which is the target
		 * object on which we would like to invoke the method: we can see that
		 * every time we would like to invoke it on a specific reference, in
		 * this case the object System.out.
		 * 
		 * https://dzone.com/articles/java-lambda-expressions-vs
		 */

		/*
		 * A method reference is a syntactic shortcut for creating a lambda from
		 * an existing method. Instead of providing an implementation body, a
		 * method reference refers to an existing class's or object's method. As
		 * with a lambda, a method reference requires a target type.
		 */
	}
}
