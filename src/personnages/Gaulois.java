package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion = 1;
	
	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	public String getNom() {
		return nom;
	}
	public void parler(String texte) {
		System.out.println(prendreParole() + "� " + texte + " �");
	}
	public String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la m�choire de "
				+ romain.getNom());
		romain.recevoirCoup(force / 3);
		}
	
	public int boirePotion(int forcePotion) {
		effetPotion = forcePotion;
		this.parler("Merci Druide, je sens que ma force est" + effetPotion + "fois d�cupl�e.");
		return effetPotion;
	}
	
	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion="
				+ effetPotion + "]";
	}
	
	public static void main(String[] args) {
		
	}
}


