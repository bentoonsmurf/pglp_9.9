package pglp_9.dernier_exo;

public class rectangle extends forme{
	private point p2;
	private point p3;
	
	public rectangle() {
		super();
	}

	public rectangle(String nom,point ancrage,point p2,point p3) {
		super(ancrage, nom);
		this.p2=p2;
		this.p3=p3;
		
	}

	public point getP3() {
		return p3;
	}

	public void setP3(point p3) {
		this.p3 = p3;
	}

	public point getP2() {
		return p2;
	}

	public void setP2(point p2) {
		this.p2 = p2;
	}
}
