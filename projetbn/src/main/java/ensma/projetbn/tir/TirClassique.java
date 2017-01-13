package ensma.projetbn.tir;

import ensma.projetbn.bateau.Bateau;
import ensma.projetbn.tir.exceptions.HorsMapException;

public class TirClassique implements ITir {
	private Bateau bateau;
	public TirClassique(Bateau b)
	{
		bateau=b;
	}
	public void tirer(int x, int y) throws HorsMapException{
		if(x>=bateau.getGrille().getTaille()||x<0||y>=bateau.getGrille().getTaille()||y<0) throw new HorsMapException();
		for (int i=0;i<bateau.getGrille().getJoueur().getAdversaire().getGrilleJoueur().getCases()[x][y].getCasesOccupant().length;i++)
		{
		
		bateau.getGrille().getJoueur().getAdversaire().getGrilleJoueur().getCases()[x][y].getCasesOccupant()[i].getEtat().recevoirDegat(bateau.getDegatAttaque());
		}
	}
}
