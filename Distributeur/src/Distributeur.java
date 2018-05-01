
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Distributeur {
	
	private List boissonsCafe = new ArrayList ();
	private List boissonsChocolat = new ArrayList();
	private int prixChocolat;
	private int prixCafe;
	
	public void init (int nb_cafe, int nb_chocolat, int prixCafe, int prixChocolat)
	{
			for (int i=0;i<nb_cafe;i++)  {
				Cafe c = new Cafe();
				c.setPrix(1);
				this.getBoissonsCafe().add(c);
			}
			for (int j=0;j<nb_chocolat;j++) {
				
				Chocolat d = new Chocolat();
				this.getBoissonsChocolat().add(d);
			}
			
			this.setPrixCafe(prixCafe);
			this.setPrixChocolat(prixChocolat);
			
				
	}

	public int poseQuestionChoixBoisson() {
		Scanner scb = new Scanner(System.in);
		System.out.println("Tapez 1 pour un chocolat \nTapez 2 pour un café");
		return scb.nextInt();	
	}
	
	public void getDemandeMonnaie(int iBoisson) {
		String prixBoisson = "0" ;
		
		if(iBoisson==1) {
			prixBoisson = Integer.toString(this.getPrixChocolat());
		}else {

				prixBoisson = Integer.toString(this.getPrixCafe());
		}
		System.out.println("Insérez "+prixBoisson+" centimes SVP");
		Scanner scv = new Scanner(System.in);
		
		//retrunr du scanner
		//aappeler une auttre fonction avec en parametre le prix initiale de la  boisson et le resulat du scanner
	}
	
	
	public void verificationMonnaie(int prixBoisson, int monnaieMis)
	
	public void donneChocolat( ) {
		this.boissonsChocolat.remove(this.boissonsChocolat.size()-1);
	}
	
	
	
	public void donneCafe()	{
		this.boissonsCafe.remove(this.boissonsCafe.size()-1);
	}
	
	public int verificationPaiement(int monnaie, int prix) {
		int p = monnaie-prix;

		return p;
	}
	
	public boolean verification(int monnaie, int prix) {
		int p =this.verificationPaiement(monnaie, prix);
		if(p == 0) {
				//message ok 
				return true;
			}
			
		return false;
	}



	public List getBoissonsCafe() {
		return boissonsCafe;
	}



	public void setBoissonsCafe(List boissonsCafe) {
		this.boissonsCafe = boissonsCafe;
	}



	public List getBoissonsChocolat() {
		return boissonsChocolat;
	}



	public void setBoissonsChocolat(List boissonsChocolat) {
		this.boissonsChocolat = boissonsChocolat;
	}

	public int getPrixChocolat() {
		return prixChocolat;
	}

	public void setPrixChocolat(int prixChocolat) {
		this.prixChocolat = prixChocolat;
	}

	public int getPrixCafe() {
		return prixCafe;
	}

	public void setPrixCafe(int prixCafe) {
		this.prixCafe = prixCafe;
	}
}