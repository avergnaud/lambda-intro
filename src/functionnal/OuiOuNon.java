package functionnal;

@FunctionalInterface
public interface OuiOuNon {

	boolean estOk(marvel.model.Character perso);
	
	static int uneMethode() {return 42;}
	
	default boolean uneAutre() {return true;}
	
}
