import java.util.ArrayList;
import java.util.List;

public class Distributeur {
	
	List boissonsCafe = new ArrayList ();
	
	public void init (int nb_cafe, int nb_chocolat)
	{
			for (int i=0;i<nb_cafe;i++) {
				Café c = new Café();
				boissonsCafe.add(c);
			}
				
	}

	public List getBoissonsCafe() {
		return boissonsCafe;
	}

	public void setBoissonsCafe(List boissonsCafe) {
		this.boissonsCafe = boissonsCafe;
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
		
		
		

		return p;
	}
	



}
