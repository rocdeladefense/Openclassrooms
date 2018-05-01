import java.util.Scanner;

public class POMChallenger {

	public void init(int i, int grandeurDuNb) {
		int nbAleatoire = (int)( Math.random()*( 10000) ) + 1; 
		while (i > 0) // i est le nombre de manches
		{
			System.out.println("Quelle est votre proposition ? (Entrez un nombre à 4 chiffres)");
			Scanner scb = new Scanner(System.in);
			int proposition = scb.nextInt();
			int j = grandeurDuNb;
			while (j > 1)
			{
				int tmp = (proposition / (j));
				int tmp2 = (nbAleatoire / (j));
			// si tmp et tmp 2 sont égales, alors print ln = sinon - ou +
			//decrementer j en divisant par 10 (mais comment faire ??) tant qu'il est au dessus de 1
			//et décrémenter i
			}
			
		}
	}
}
