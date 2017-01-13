package ensma.projetbn.tir;

import ensma.projetbn.bateau.Bateau;
import ensma.projetbn.tir.exceptions.HorsMapException;

public class TirEnCroix  implements ITir {

	private Bateau bateau;
	public TirEnCroix(Bateau b)
	{
		bateau=b;
	}
	public void tirer(int x, int y) throws HorsMapException
	{	if(x>=bateau.getGrille().getTaille()||x<0||y>=bateau.getGrille().getTaille()||y<0) throw new HorsMapException();
		for (int i=0;i<bateau.getGrille().getJoueur().getAdversaire().getGrilleJoueur().getCases()[x][y].getCasesOccupant().length;i++)
		{
		
		bateau.getGrille().getJoueur().getAdversaire().getGrilleJoueur().getCases()[x][y].getCasesOccupant()[i].getEtat().recevoirDegat(bateau.getDegatAttaque());
		if(!(x+1>=bateau.getGrille().getTaille())) bateau.getGrille().getJoueur().getAdversaire().getGrilleJoueur().getCases()[x+1][y].getCasesOccupant()[i].getEtat().recevoirDegat(bateau.getDegatAttaque());
		if(!(y+1>=bateau.getGrille().getTaille())) bateau.getGrille().getJoueur().getAdversaire().getGrilleJoueur().getCases()[x][y+1].getCasesOccupant()[i].getEtat().recevoirDegat(bateau.getDegatAttaque());
		if(!(x-1<0)) bateau.getGrille().getJoueur().getAdversaire().getGrilleJoueur().getCases()[x-1][y].getCasesOccupant()[i].getEtat().recevoirDegat(bateau.getDegatAttaque());
		if(!(y-1<0)) bateau.getGrille().getJoueur().getAdversaire().getGrilleJoueur().getCases()[x][y-1].getCasesOccupant()[i].getEtat().recevoirDegat(bateau.getDegatAttaque());
		}
	}
}
