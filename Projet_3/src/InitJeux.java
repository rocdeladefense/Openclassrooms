import java.util.Scanner;

public class InitJeux {

	public int questionChoixJeux () {
		Scanner scb = new Scanner(System.in);
		System.out.println("Choisissez � quel jeu voulez vous jouez : \nTapez 1 pour le +/- \nTapez 2 pour le Mastermind");
		return scb.nextInt();	
	}
	 public int questionChoixMode (int choixJeu) {
		Scanner scb = new Scanner(System.in);
		System.out.println("Choisissez maintenant votre mode de jeu : \nTapez 1 pour le mode challenger \nTapez 2 pour le mode defenseur \nTapez 3 pour le mode duel");
		return scb.nextInt();	
	} 
}
