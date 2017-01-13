package ensma.projetbn.casebateau.etat;

import ensma.projetbn.casebateau.CaseBateau;

public class EtatNormal extends IEtatCaseBateau{

	private CaseBateau ca;
	
	public EtatNormal(CaseBateau c){
		ca=c;
	}
	
	@Override
	public int ajouterAttaque() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public void recevoirDegat(int d) {
		if (ca.getResistance()>0)
		ca.setResistance(ca.getResistance()-d);
		
	}

}
