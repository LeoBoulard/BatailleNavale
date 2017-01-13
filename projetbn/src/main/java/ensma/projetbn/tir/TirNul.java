package ensma.projetbn.tir;

import ensma.projetbn.bateau.Bateau;

public class TirNul implements ITir{

	private Bateau bateau;
	public TirNul(Bateau b)
	{
		bateau=b;
	}
	
	public void tirer(int x, int y){
		System.out.println("Le voilier ne peut pas tirer");
	}

}
