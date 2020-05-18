package pglp_9.dernier_exo;

public class carre extends forme{
	private point p2;

	public carre() {
		super();
		// TODO Auto-generated constructor stub
	}

	public carre(String nom,point ancrage,point p2) {
		super(ancrage, nom);
		this.p2=p2;
		// TODO Auto-generated constructor stub
	}

	public point getP2() {
		return p2;
	}

	public void setP2(point p2) {
		this.p2 = p2;
	}
}
