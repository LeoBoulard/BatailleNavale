package ensma.projetbn.vue;

import ensma.projetbn.controleur.ControleurBN;
import ensma.projetbn.modele.ModeleBN;

public class VueBN {

	private ControleurBN controleur;
	private ModeleBN modele;

public VueBN(final ModeleBN m, final ControleurBN c)	{
	modele = m;
	controleur = c;
}
}
