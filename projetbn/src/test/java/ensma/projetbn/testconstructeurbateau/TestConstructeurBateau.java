package ensma.projetbn.testconstructeurbateau;

import edirection.EDirection;
import ensma.projetbn.bateau.Croiseur;
import ensma.projetbn.bateau.Torpilleur;
import ensma.projetbn.bateau.exception.OutOfBounds;
import ensma.projetbn.grille.GrilleJoueur;
import ensma.projetbn.joueur.Joueur;
import ensma.projetbn.joueur.JoueurHumain;

public class TestConstructeurBateau {
	

	public static void main(String[] args) {
		Joueur joueur1=new JoueurHumain();
		System.out.println("Tests des constructeurs des bateaux");
		GrilleJoueur grille= new GrilleJoueur(joueur1);
		grille.setTaille(10);
		
		// test du torpilleur
		Torpilleur torpilleur1=null;
		Torpilleur torpilleur2=null;
		System.out.println("torpilleur 1:");
		try{
		torpilleur1= new Torpilleur(grille,0,0);
		System.out.println("torpilleur 1 OK!");
		}
		catch (OutOfBounds e ) {}
		System.out.println("torpilleur 2:");
		try{
			torpilleur1= new Torpilleur(grille,10,0);
			System.out.println("torpilleur 2 OK!");
			}
			catch (OutOfBounds e ) {}
		
		// test du croiseur
		Croiseur croiseur1=null;
		Croiseur croiseur2=null;
		Croiseur croiseur3=null;
		Croiseur croiseur4=null;
		
		System.out.println("croiseur 1:");
		try{
		croiseur1= new Croiseur(grille,0,0,EDirection.haut);
		System.out.println("croiseur 1 OK!");
		}catch (OutOfBounds e ) {}
		
		System.out.println("croiseur 2:");
		try{
		croiseur1= new Croiseur(grille,5,8,EDirection.droite);
		System.out.println("croiseur 2 OK!");
		}catch (OutOfBounds e ) {}
		
		System.out.println("croiseur 3:");
		try{
		croiseur1= new Croiseur(grille,0,0,EDirection.bas);
		System.out.println("croiseur 3 OK!");
		}catch (OutOfBounds e ) {}
		
		System.out.println("croiseur 4:");
		try{
		croiseur1= new Croiseur(grille,3,3,EDirection.gauche);
		System.out.println("croiseur 4 OK!");
		}catch (OutOfBounds e ) {}
		
	}
	
		
	
}
