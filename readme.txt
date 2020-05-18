pour executer le programe il faut ecrire dans le terminal

mvn package 

se placer dans le dossier target et ecrire

java -jar dernier_exo-0.0.1-SNAPSHOT-jar-with-dependencies.jar 


le programme attend  2 String 

le nom de la commande et 
les arguments de celle ci séparé par des virgules

grouper nom_groupe,nom_forme1,nom_forme2....
deplacer nom,p1
afficher nom
cercle nom,p1,diametre
carre nom,p1,p2
carre nom,1,2,3,4
rectanlge nom,p1,p2,p3
triangle nom,p1,p2,p3

voici en brut un test qui marchais j'usque a ce que je touche au dependances et que je m'y perde


public class ensemble_de_formesTest{
	 
	@Test
	public void test_sur_search() {
		
		ensemble_de_formes top_level= new ensemble_de_formes();
		top_level.setNom("top_level");

		
	
	point p1=new point();
	point p2=new point();
	p1.setX(1);
	p1.setY(2);
	p2.setX(3);
	p2.setY(4);

	ensemble_de_formes intermediaire= new ensemble_de_formes();
	carre c=new carre("nom",p1,p2);
	
	intermediaire.add(c);
	top_level.add(intermediaire);

	//assertNull(top_level.search("nom"));
	//assertNotNull(top_level.search("nom"));
	assertEquals(c,top_level.search("nom"));
	}
	
}
