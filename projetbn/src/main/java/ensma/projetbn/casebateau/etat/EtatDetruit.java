package ensma.projetbn.casebateau.etat;

import ensma.projetbn.casebateau.CaseBateau;

public class EtatDetruit extends IEtatCaseBateau {
	private CaseBateau ca;
	
	public EtatDetruit(CaseBateau c){
		ca=c;
	}
	@Override
	public int ajouterAttaque() {
		
		return 0;
	}

	@Override
	public void recevoirDegat(int d) {

	}
	
	
	
}
