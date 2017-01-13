package ensma.projetbn;

import ensma.projetbn.joueur.Joueur;
import ensma.projetbn.joueur.JoueurHumain;

public class mainTest {

	public static void main(String[] args) {
		
		Joueur joueur1= new JoueurHumain();
		Joueur joueur2= new JoueurHumain();
		joueur1.setAdversaire(joueur2);
		joueur2.setAdversaire(joueur1);
		
		

	}

}
