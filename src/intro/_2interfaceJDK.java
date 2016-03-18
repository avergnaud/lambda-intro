package intro;

import java.util.function.BinaryOperator;

public class _2interfaceJDK {

	public static void main(String[] args) {
		
		BinaryOperator<Integer> addition = (n1, n2) -> n1 + n2;
		System.out.println(addition.apply(3, 4));
	}
}
