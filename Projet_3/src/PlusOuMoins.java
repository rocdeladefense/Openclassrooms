
public class PlusOuMoins {

	public void choixMode (int choixmode) {
		POMChallenger POMch = new POMChallenger();
		POMDefenseur POMde = new POMDefenseur();
		POMDuel POMdu = new POMDuel();
		if (choixmode == 1)
		{
			POMch.init();
		}
		else if (choixmode == 2)
		{
			POMde.init();
		}
		else if (choixmode == 3)
		{
			POMdu.init();
		}
	}
}
