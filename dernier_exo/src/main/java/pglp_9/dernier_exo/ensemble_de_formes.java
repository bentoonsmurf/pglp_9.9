package pglp_9.dernier_exo;

import java.util.ArrayList;
import java.util.List;

public class ensemble_de_formes extends forme{
	public List<forme> regroupement;

	public ensemble_de_formes() {
		super();
		regroupement= new ArrayList<forme>();
	}

	public ensemble_de_formes(point ancrage, String nom) {
		super(ancrage, nom);
		regroupement= new ArrayList<forme>();
	}
		
	public void deplacer(point destination) {
		this.setAncrage(destination);
		//afficher qqchose a l'ecran
		
	}
	/// double lecture 
	public forme search(String nom) {
		forme tmp;
		for(int i=0; i<regroupement.size(); i++) {
			
			if(	nom == regroupement.get(i).getNom()) {
				return regroupement.get(i);
			}
			
		}
		for(int j=0; j<regroupement.size(); j++) {
			tmp =regroupement.get(j).search(nom);
			if(tmp!=null) {
				return tmp;
				}
			}
		return null;
		
	}
	public void afficher() {
		forme tmp;
		System.out.println( "le groupe "+this.getNom()+" est a la position" + Integer.toString(this.getAncrage().x )+","+Integer.toString(this.getAncrage().y ));
		
		for(int i=0; i<regroupement.size(); i++) {
		
				 regroupement.get(i).afficher();
			
			
		}

	
		
	}
	
	public void add(forme f) {
		this.regroupement.add(f);
	}
	
	public forme remove() {
		return this.regroupement.remove(0);
		
	}

}
