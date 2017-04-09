package Modeles;

//import Command.*;

public class Modeles {

	


	
	
	
	
	
	/**
	* Retourne l'instance unique du Modele
	*
	* @return Instance unique du Modele.
	*/
	public static Modeles getInstance() {
		Modeles instance = null;
		if (instance == null) {
			synchronized(Modeles.class) {
				if (instance == null) { 
					instance = new Modeles();
				}
			}
	   }
	   return instance;
	}
}
