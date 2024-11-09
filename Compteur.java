package td_classes_abstraites;

public abstract class Compteur {
	public static final int Min=0;
	protected int courant;
	public Compteur()
	{
		this.courant=this.Min;
	}
	public void raz()
	{
		this.courant=0;
	}
	public abstract void incrementer();
	public int getCourant() {
		return this.courant;
	}

}
