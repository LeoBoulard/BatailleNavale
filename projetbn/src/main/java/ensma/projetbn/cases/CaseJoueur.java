package ensma.projetbn.cases;

import ensma.projetbn.casebateau.CaseBateau;
import ensma.projetbn.ecouleurcase.ECouleurCase;

public class CaseJoueur {
	private CaseBateau[] casesOccupant;
	private ECouleurCase couleur;
	public CaseBateau[] getCasesOccupant() {
		return casesOccupant;
	}
	public void setCasesOccupant(CaseBateau[] casesOccupant) {
		this.casesOccupant = casesOccupant;
	}
	public ECouleurCase getCouleur() {
		return couleur;
	}
	public void setCouleur(ECouleurCase couleur) {
		this.couleur = couleur;
	}
	
	
}
