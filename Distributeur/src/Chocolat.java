
public class Chocolat extends sz1{
	
	public String donchoco () {
	
	int stockchoco; 
	String src;
	stockchoco = 3;
		if (stockchoco > 0)
		{
			stockchoco = stockchoco - 1;
			src = "Voici votre chocolat, attention c'est chaud !";	
		}
		else
		{
			src = "Il n'y a plus de chocolat dans la machine, contactez notre entreprise";
		}
		return src;
	}
}