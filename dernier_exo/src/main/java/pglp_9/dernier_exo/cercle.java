package pglp_9.dernier_exo;

public class cercle extends forme{
	private int diammetre;

	public int getDiammetre() {
		return diammetre;
	}

	public cercle() {
		super();
	}

	public cercle(String nom,point ancrage,int d) {
		super(ancrage, nom);
		this.diammetre=d;	
	}

	public void setDiammetre(int diammetre) {
		this.diammetre = diammetre;
	}
}
