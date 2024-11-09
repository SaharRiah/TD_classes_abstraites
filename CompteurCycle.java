package td_classes_abstraites;

public class CompteurCycle extends Compteur {
	public static final int MAX=4;
	public void incrementer()
	{
		if(this.courant==MAX)
			this.courant=0;
		else
			this.courant++;
	}

}
