
public class main {

	public static void main(String[] args) {

		InitJeux in = new InitJeux();
		PlusOuMoins pl = new PlusOuMoins();
		Mastermind ma = new Mastermind();
		int choixJeu = in.questionChoixJeux();
		int choixMode = in.questionChoixMode(choixJeu);
		if (choixJeu == 1)
			pl.choixMode(choixMode);
		else 
			ma.choixMode(choixMode);
	}

}