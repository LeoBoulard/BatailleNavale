package ensma.projetbn.modele;

import ensma.projetbn.controleur.ControleurBN;
import ensma.projetbn.main.IAppObservable;
import ensma.projetbn.vue.VueBN;

public class ModeleBN {
	private ControleurBN controleur;
	private VueBN vue;
	private IAppObservable obs;
	
	public ModeleBN(final IAppObservable o)
	{
		controleur= new ControleurBN(this);
		obs=o;
	}
	
	public void setVue(VueBN v)
	{
		vue=v;
	}
	
}
