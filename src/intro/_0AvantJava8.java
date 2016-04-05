package intro;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

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
		

		//MAP
		Map<String,Integer> maMap = new HashMap<>();
		maMap.put("un", 1);
		maMap.put("deux",2);
		
		System.out.println(maMap);
		BiFunction<String,Number,Integer> remappingFunction = (k,v)->3;
		maMap.compute("deux", remappingFunction);
		System.out.println(maMap);
		
	}

	/*
	 * Paradigme POO : on manipule des objets
	 * Paradigme PF : on manipule des fonctions
	 */
	
	
}
