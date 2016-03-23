package newcircle;

interface Test {
	void go();
}

public class Examples2 {

	public static void main(String[] args) {
		Test ditBonjour = () -> System.out.println("bonjour");
		ditBonjour.go();
	}
}
