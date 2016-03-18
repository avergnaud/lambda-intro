package usage2;

import java.util.function.Function;

public class _0Function {
	
	public static void main(String[] args) {

		/* https://docs.oracle.com/javase/8/docs/api/java/util/function/Function.html */
		
		Function<String,Integer> f1 = String::length;
		
		System.out.println(f1.apply("hello world"));
	}
}
