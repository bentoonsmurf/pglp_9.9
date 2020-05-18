package pglp_9.dernier_exo;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Command Factory gérant les différentes options de l'application
 * @author user
 *
 */
public class CommandFormeFactory {
	private final Map<String, CommandForme> commands;
	
	/**
	 * Constructeur
	 */
	private CommandFormeFactory() {
		this.commands = new HashMap();
	}
	
	/**
	 * Ajoute une commande
	 * @param name nom de la commande
	 * @param command fonction à appeler
	 */
	public void addCommand(String name, CommandForme command) {
		this.commands.put(name, command);
	}
	
	/**
	 * Execute la commande
	 * @param name nom de la commande
	 * @return
	 */
	public boolean executeCommand(String name) {
		if(this.commands.containsKey(name)) {
			this.commands.get(name).apply();
			return true;
		}
		return false;
	}
	
	/**
	 * Initialise toutes les commandes
	 * @return les commandes
	 */
	

	
	public static CommandFormeFactory init(
			ensemble_de_formes top_level, String nom,point destination,
			carre c,cercle cl,ensemble_de_formes e,forme f,rectangle r,triangle t)
	{
		CommandFormeFactory cf = new CommandFormeFactory();
		cf.addCommand("quit", () -> System.exit(0));
		cf.addCommand("q", () -> System.exit(0));
		cf.addCommand("carre", () -> {
			top_level.add(c);
		});
		cf.addCommand("cercle", () -> {
			top_level.add(cl);
		});
		cf.addCommand("rectangle", () -> {
			top_level.add(r);
		});
		cf.addCommand("triangle", () -> {
			top_level.add(t);
		});
		cf.addCommand("deplacer", () -> {
			 forme tmp =top_level.search(nom);
			 if(tmp!=null)tmp.deplacer(destination);
		});
		cf.addCommand("afficher", () -> {
			System.out.println(" top level nom "+top_level.getNom());
			System.out.println("  nom cherché "+nom);
			 forme tmp =top_level.search(nom);
			 if(tmp!=null)tmp.afficher();
		});
		cf.addCommand("grouper", () -> {
			top_level.add(e);
		});

		return cf;
	}
}
