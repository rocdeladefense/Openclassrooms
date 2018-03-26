import java.util.Scanner;

public class sdz1 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a = 0;
		while (a == 0)
		{
			System.out.println("Veuillez choisir quelle type de conversion voulez vous:\nTapez 1 pour C en F \nTapez 2 pour F en C");
			int str = sc.nextInt();
			if (str == 1)
			{
				System.out.println("Vous avez choisi C en F. \nQuelle température voulez vous convertir ?");
				int choix = sc.nextInt();
				int finale = (int) (choix * 1.8);
				finale = (int) (finale + 32);
				System.out.println(choix + " degrés Celsius est égal à " + finale + " Fahrenheit");
				System.out.println("\n Voulez refaire une conversion ?(1 pour oui / 2 pour non)");
				int refaire = sc.nextInt();
				if (refaire == 2)
				{
					a++;
					System.out.println("Merci, au revoir !");
				}
				
				else 
					a = 0;
			}
			else if (str == 2)
			{
				System.out.println("Vous avez choisi de convertir F en C. \nQuelle température voulez vous convertir ?");
				int choix = sc.nextInt();
				int finale = (int) (choix - 32);
				finale = (int) (finale * 5);
				finale = (int) (finale / 9);
				System.out.println(choix + " degrés Fahrenheit est égal à " + finale + " Celsius");
				System.out.println("\n Voulez refaire une conversion ? (1 pour oui / 2 pour non)");
				int refaire = sc.nextInt();
				if (refaire == 2)
				{
					a++;
					System.out.println("Merci, au revoir !");
				}
				else 
					a = 0;
			}
			else
			{
				System.out.println("Vous avez fait de la merde, veuillez réessayez");
				a = 0;
			}
				
		}
	}
}
