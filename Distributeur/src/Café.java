
public class Café extends sz1{

	public String doncafe() {
		
		String src;
		int stockcaf = 3;
		if (stockcaf > 0)
		{
			stockcaf = stockcaf - 1;
			src = "Voici votre cafe, attention c'est chaud !";	
		}
		else
		{
			src = "Il n'y a plus de cafe dans la machine, contactez notre entreprise";
		}
		return src;
}
}