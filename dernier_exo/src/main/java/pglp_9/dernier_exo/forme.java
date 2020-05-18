package pglp_9.dernier_exo;

public class forme {
	private point ancrage;
	private String nom;
	
	public forme() {

		this.nom = "";
	}
	
	public forme(point ancrage, String nom) {
		this.ancrage = ancrage;
		this.nom = nom;
	}

	public void afficher() {
		
		System.out.println( this.nom +" est a la position" + Integer.toString(ancrage.x )+","+Integer.toString(ancrage.y ));
		
	}
	public void deplacer(point destination) {
		this.ancrage=destination;
		//afficher qqchose a l'ecran
		
	}
	
	public forme search(String nom) {
		
		return null;
		
	}
	
	public point getAncrage() {
		return ancrage;
	}

	public void setAncrage(point ancrage) {
		this.ancrage = ancrage;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}





}
