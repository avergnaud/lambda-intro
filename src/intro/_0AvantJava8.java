package intro;

import functionnal.Operation;

public class _0AvantJava8 {

	public static void main(String[] args) {
		
		Operation addition = new Operation() {
			@Override
			public int applique(int operande1, int operande2) {
				return operande1 + operande2;
			}
		};
		
		System.out.println(addition.applique(3, 2));
	}

}
