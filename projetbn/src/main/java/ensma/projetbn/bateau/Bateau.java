package ensma.projetbn.bateau;

import ensma.projetbn.casebateau.CaseBateau;
import ensma.projetbn.grille.GrilleJoueur;
import ensma.projetbn.tir.ITir;
import ensma.projetbn.tir.exceptions.HorsMapException;

public abstract class Bateau {
	protected GrilleJoueur grille;
	protected int taille;
	protected CaseBateau[] cases;
	protected ITir tir;
	protected int degatAttaque;
	
	public void tirer(int x, int y){
		try{
		tir.tirer(x,y);
		}catch (HorsMapException e){}
	}
	
	public int getTaille() {
		return taille;
	}

	public void setTaille(int taille) {
		this.taille = taille;
	}

	public CaseBateau[] getCases() {
		return cases;
	}

	public void setCases(CaseBateau[] cases) {
		this.cases = cases;
	}

	public int getDegatAttaque() {
		return degatAttaque;
	}

	public void setDegatAttaque(int degatAttaque) {
		this.degatAttaque = degatAttaque;
	}

	public void setTir(ITir t)
	{
		tir=t;
	}
	public ITir getTir(){
		return tir;
	}

	public GrilleJoueur getGrille() {
		return grille;
	}

	public void setGrille(GrilleJoueur grille) {
		this.grille = grille;
	}
}
