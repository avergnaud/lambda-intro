package usage4;

import java.util.Arrays;
import java.util.List;

public class Looping {

	public static void main(String[] args) {
		
		List<String> cats = Arrays.asList("Annie", "Ripley");
		
		for(String cat : cats) {			
			System.out.println(cat);
		}
		
		cats.forEach(System.out::println);
	}

}
