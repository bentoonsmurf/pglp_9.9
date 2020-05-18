package pglp_9.dernier_exo;


import java.util.Scanner;

/**
 * Classe gérant les entrées utilisateurs 
 * et les appels à la classe CommandFormeFactory
 */
public class CommandArgs {
	String cmd;
	String arg = null;
	
	carre c;
	cercle cl;
	ensemble_de_formes e;
	forme f;
	rectangle r;
	triangle t;
	point p;

	static private CommandFormeFactory cf;
	
	/**
	 * Constructeur
	 * @param cmd commande lancé par l'utilisateur
	 * @param arg  arguments
	 */
	CommandArgs(ensemble_de_formes top_level, String cmd, String arg){
		this.cmd = cmd;
		this.arg=arg;
		point p1=new point();
		point p2=new point();
		point p3=new point();
		String[] argstmp = arg.split(",");
		String nom =argstmp[0];
		if(cmd.equals("deplacer")) {
			 
			 p=new point();
			 c=new carre();
			 cl=new cercle();
			 e=new ensemble_de_formes();
			 f=new forme();
			 r=new rectangle();
			 t=new triangle();
		}
		if(cmd.equals("afficher")) {
			 p=new point();
			 c=new carre();
			 cl=new cercle();
			 e=new ensemble_de_formes();
			 f=new forme();
			 r=new rectangle();
			 t=new triangle();
		}
		
		if(cmd.equals("grouper")) {
		String nom_groupe=nom;
		String[] nom_des_formes;	
		
		p1=top_level.search(argstmp[1]).getAncrage();
		 e=new ensemble_de_formes(p1,nom_groupe);

		
		for(int i=1; i<argstmp.length; i++) {
			e.add(top_level.search(argstmp[i]));
			
			
		}
					
			 p=new point();
			 c=new carre();
			 cl=new cercle();
			// e=new ensemble_de_formes();
			 f=new forme();
			 r=new rectangle();
			 t=new triangle();
		}
		if(cmd.equals("cercle")) {
			p1.setX(Integer.parseInt(argstmp[1]));
			p1.setY(Integer.parseInt(argstmp[2]));
			
			
			cl=new cercle(nom,p1,Integer.parseInt(argstmp[2]));
			 p=new point();
			 c=new carre();
			// cl=new cercle();
			 e=new ensemble_de_formes();
			 f=new forme();
			 r=new rectangle();
			 t=new triangle();
			
		}
		if(cmd.equals("carre")) {
			p1.setX(Integer.parseInt(argstmp[1]));
			p1.setY(Integer.parseInt(argstmp[2]));
			p2.setX(Integer.parseInt(argstmp[3]));
			p2.setY(Integer.parseInt(argstmp[4]));
			
			c=new carre(nom,p1,p2);
			 p=new point();
			// c=new carre();
			 cl=new cercle();
			 e=new ensemble_de_formes();
			 f=new forme();
			 r=new rectangle();
			 t=new triangle();
		}
		
		if(cmd.equals("rectangle")) {
			 p=new point();
			 c=new carre();
			 cl=new cercle();
			 e=new ensemble_de_formes();
			 f=new forme();
			 r=new rectangle();
			 t=new triangle();
			
		}
		
		if(cmd.equals("triangle")) {
			 p=new point();
			 c=new carre();
			 cl=new cercle();
			 e=new ensemble_de_formes();
			 f=new forme();
			 r=new rectangle();
			 t=new triangle();
			
		}
		

		


		cf = CommandFormeFactory.init(top_level, arg,p,c,cl,e,f,r,t);
	}
	
	
	
	
	
	/**
	 * Constructeur appelé avec la classe Scanner
	 * @param userInput les commandes rentrées par l'utilisateur
	 */
	CommandArgs(ensemble_de_formes top_level,String non_splite){
		String[] tmp = non_splite.split(" ");
		String cmd=tmp[0];
		String arg=tmp[1];
		//System.out.println(cmd);
		//System.out.println(arg);
		
		this.cmd = cmd;
		this.arg=arg;
		point p1=new point();
		point p2=new point();
		point p3=new point();
		String[] argstmp = arg.split(",");
		String nom =argstmp[0];
		if(cmd.equals("deplacer")) {
			
			 c=new carre();
			 cl=new cercle();
			 e=new ensemble_de_formes();
			 f=new forme();
			 r=new rectangle();
			 t=new triangle();
		}
		if(cmd.equals("afficher")) {
			
			 c=new carre();
			 cl=new cercle();
			 e=new ensemble_de_formes();
			 f=new forme();
			 r=new rectangle();
			 t=new triangle();
		}
		if(cmd.equals("cercle")) {
			p1.setX(Integer.parseInt(argstmp[1]));
			p1.setY(Integer.parseInt(argstmp[2]));
			
			
			cl=new cercle(nom,p1,Integer.parseInt(argstmp[2]));
			 c=new carre();
			// cl=new cercle();
			 e=new ensemble_de_formes();
			 f=new forme();
			 r=new rectangle();
			 t=new triangle();
			
		}
		if(cmd.equals("carre")) {
		//	System.out.println("carre executé "+cmd);
			p1.setX(Integer.parseInt(argstmp[1]));
			p1.setY(Integer.parseInt(argstmp[2]));
			p2.setX(Integer.parseInt(argstmp[3]));
			p2.setY(Integer.parseInt(argstmp[4]));
			
			c=new carre(nom,p1,p2);
			// c=new carre();
			 cl=new cercle();
			 e=new ensemble_de_formes();
			 f=new forme();
			 r=new rectangle();
			 t=new triangle();
		}
		
		if(cmd.equals("rectangle")) {
			
			 c=new carre();
			 cl=new cercle();
			 e=new ensemble_de_formes();
			 f=new forme();
			 r=new rectangle();
			 t=new triangle();
			
		}
		
		if(cmd.equals("triangle")) {
			 c=new carre();
			 cl=new cercle();
			 e=new ensemble_de_formes();
			 f=new forme();
			 r=new rectangle();
			 t=new triangle();
			
		}
		

		


		cf = CommandFormeFactory.init(top_level, arg,p,c,cl,e,f,r,t);
	
	}
	

	
	/**
	 * Execute la commande rentrée par l'utilisateur
	 */
	public void execute() {
		cf.executeCommand(cmd);
		System.out.println("Commande exécutée");
	}
}
