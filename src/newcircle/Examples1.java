package newcircle;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class Examples1 {

	public static void main(String[] args) {
		
		List<Integer> integers = Arrays.asList(1,2,3,4,5);
		integers.forEach(x->System.out.println(x));
		/*
		 * void java.lang.Iterable.forEach(Consumer<? super Integer> action)
		 * forEach prend une function comme argument...
		 * 
		 * x->System.out.println(x)
		 * lambda expression = function anonyme
		 */

		integers.forEach((Integer x)->{System.out.println(x);});
		
		Consumer<Integer> monConsumer = x -> System.out.println(x);
		integers.forEach(monConsumer);
		/* JDK :
		 	public interface Consumer<T> {
				void accept(T t);
			}
			
			void forEach(Consumer<Integer> action) {
				for(Integer i : items) {
					action.accept(i);
				}
			}
		 */
		
		/*
		 * une lambda expression peut être compilée de plusieurs façons (implémentations de javac)
		 * ex : une méthode statique...
		 * 
		 * Java n'a pas de type natif "function"
		 * > le type d'une lambda expression est une functionnal interface
		 */
		
		/* On s'intéresse aux signatures */
		Integer un = Integer.valueOf("1");
		
		Function<String,Integer> maFunction = Integer::valueOf;
		System.out.println(maFunction.apply("1"));
		
		/* @FunctionalInterface optionnel */
	}
}


