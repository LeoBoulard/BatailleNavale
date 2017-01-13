package ensma.projetbn.casebateau;

import ensma.projetbn.bateau.Bateau;
import ensma.projetbn.casebateau.etat.EtatNormal;
import ensma.projetbn.casebateau.etat.IEtatCaseBateau;
import ensma.projetbn.cases.CaseJoueur;

public class CaseBateau {
	private Bateau bateau;
	private IEtatCaseBateau etat;
	private CaseJoueur caseOccupee;
	private int resistance;
	
	public CaseBateau(int x, int y, int r, Bateau bat)
	{
		
		etat=new EtatNormal(this);
		bateau=bat;
		caseOccupee=bateau.getGrille().getCases()[x][y];
		resistance=r;
		
	}

	public Bateau getBateau() {
		return bateau;
	}

	public void setBateau(Bateau bateau) {
		this.bateau = bateau;
	}

	public IEtatCaseBateau getEtat() {
		return etat;
	}

	public void setEtat(IEtatCaseBateau etat) {
		this.etat = etat;
	}

	public CaseJoueur getCaseOccupee() {
		return caseOccupee;
	}

	public void setCaseOccupee(CaseJoueur caseOccupee) {
		this.caseOccupee = caseOccupee;
	}

	public int getResistance() {
		return resistance;
	}

	public void setResistance(int resistance) {
		this.resistance = resistance;
	}
}
