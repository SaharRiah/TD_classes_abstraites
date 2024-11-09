package td_classes_abstraites;

public class TestCompteur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CompteurOrd c1= new CompteurOrd();
		CompteurCycle c2= new CompteurCycle();
		for(int i=0;i<5;i++)
		{
			c1.incrementer();
			c2.incrementer();
			System.out.println(c1.getCourant());
			System.out.println(c2.getCourant());
		}
		c1.raz();
		c2.raz();
		System.out.println(c1.getCourant());
		System.out.println(c2.getCourant());

	}

}
