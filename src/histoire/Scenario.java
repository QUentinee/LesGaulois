package histoire;

import personnages.Gaulois;
import personnages.Romain;

public class Scenario {

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix",8);
		asterix.prendreParole();
		asterix.parler("Bonjour à tous");
		Romain minus = new Romain("Minus",6);
		minus.prendreParole();
		minus.parler("UN GAU... UN GAUGAU..");
		asterix.frapper(minus);
		minus.recevoirCoup(1);
		asterix.frapper(minus);
		minus.recevoirCoup(1);
		asterix.frapper(minus);
		minus.recevoirCoup(1);
	}

}
