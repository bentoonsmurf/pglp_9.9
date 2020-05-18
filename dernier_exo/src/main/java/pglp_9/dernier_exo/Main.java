package pglp_9.dernier_exo;


import java.util.Scanner;

/**
 * Classe Main
 */
public class Main {
	static private Scanner saisie = new Scanner(System.in);
	//saisie.nextLine()
	public static void main(String[] args) {
		CommandArgs ca;
		ensemble_de_formes top_level= new ensemble_de_formes();
		top_level.setNom("top_level");
		
		if(args.length == 2) {
				ca = new CommandArgs(top_level,args[0], args[1]);
			ca.execute();
			System.exit(0);
		}
		else
			while(true) {
				
				ca = new CommandArgs(top_level,saisie.nextLine());
				ca.execute();
			}

	}

}
