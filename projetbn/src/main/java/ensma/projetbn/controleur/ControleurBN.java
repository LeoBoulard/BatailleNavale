package ensma.projetbn.controleur;

import ensma.projetbn.modele.ModeleBN;
import ensma.projetbn.vue.VueBN;

public class ControleurBN {

private ModeleBN modele;
private VueBN vue;


public ControleurBN(final ModeleBN m){
	modele=m;
	vue = new VueBN(m, this);
	m.setVue(vue);
}

}
