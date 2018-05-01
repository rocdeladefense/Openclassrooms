import java.util.Scanner;

public class sz1 {
	
	public static void main(String[] args) {
		int nbcafe = 3;
		int nbchocolat = 3;
		int prixCafe =1;
		int prixChocolat=3;

		Distributeur distributeur = new Distributeur();
		distributeur.init(nbcafe, nbchocolat,prixCafe,prixChocolat);
		int iRep = distributeur.poseQuestionChoixBoisson();
		distributeur.getDemandeMonnaie(iRep);
		
		
		
		
	}
}
		
		
		
		
	/*	Chocolat ch = new Chocolat();
		Café ca = new Café();
		//int stockcaf2 = 3;
		//int stockchoco2 = 3;
		//int prixchoco = 20;
		//int prixcaf = 20;
		int rendu;
		int du;
		int tmp;
		int cam = 0;
		while (stockchoco2 != 0 && distributeur.getBoissonsCafe().size() > 0)
		{
			Scanner scb = new Scanner(System.in);
			System.out.println("Tapez 1 pour un chocolat \nTapez 2 pour un café");
			int choix = scb.nextInt();
			if (choix == 1) 
			{
				System.out.println("Insérez " + prixchoco + " centimes SVP");
				Scanner scv = new Scanner(System.in);
				int monnaie = scv.nextInt();
				if (monnaie == prixchoco)
				{
					System.out.println("Merci beaucoup, " + ch.donchoco());
					stockchoco2--;
					cam = cam + prixchoco;
				}
				else if (monnaie > prixchoco) 
				{
					rendu = monnaie - prixchoco;
					System.out.println("Merci, nous vous rendons " + rendu + " centimes, " + ch.donchoco());
					stockchoco2--;
					cam = cam + prixchoco;
				}
				else if (monnaie < prixchoco)
				{
					while (monnaie < prixchoco)
					{
					du = prixchoco - monnaie;
					System.out.println("Vous n'avez pas insérez assez d'argent, merci de rajouter au moins " + du + " centimes.");
					System.out.println("Si vous voulez récupérer votre monnaie appuyer sur 0, sinon indiquez la monnaie que vous rajoutez");
					Scanner scy = new Scanner(System.in);
					tmp = scy.nextInt();
					monnaie = monnaie + tmp;
						if (tmp != 0)
						{
							if (tmp == du)
							{
								System.out.println("Merci beaucoup, " + ch.donchoco());
								stockchoco2--;	
								cam = cam + prixchoco;
							}
							else if (tmp > du)
							{
								rendu = monnaie - prixchoco;
								System.out.println("Merci, nous vous rendons " + rendu + " centimes, " + ch.donchoco());
								stockchoco2--;
								cam = cam + prixchoco;
							}
						}
						else if (tmp == 0)
						{
							System.out.println("Voici votre monnaie");
							monnaie = prixchoco;
						}
					}
				}
			}
			else if (choix == 2) 
			{
				System.out.println("Insérez " + prixcaf + " centimes SVP");
				Scanner scv = new Scanner(System.in);
				int monnaie = scv.nextInt();
				
				if (monnaie == prixcaf)
				{
					System.out.println("Merci beaucoup, " + ca.doncafe());
					distributeur.donneCafe();
					//stockcaf2--;
					cam = cam + prixcaf;
				}
				else if (monnaie > prixcaf) 
				{
					rendu = monnaie - prixcaf;
					System.out.println("Merci, nous vous rendons " + rendu + " centimes, " + ca.doncafe());
					distributeur.donneCafe();
					stockcaf2--;
					cam = cam + prixcaf;
				}
				else if (monnaie < prixcaf)
				{
					while (monnaie < prixcaf)
					{
					du = prixcaf - monnaie;
					System.out.println("Vous n'avez pas insérez assez d'argent, merci de rajouter au moins " + du + " centimes.");
					System.out.println("Si vous voulez récupérer votre monnaie appuyer sur 0, sinon indiquez la monnaie que vous rajoutez");
					Scanner scy = new Scanner(System.in);
					tmp = scy.nextInt();
					monnaie = monnaie + tmp;
						if (tmp != 0)
						{
							if (tmp == du)
							{
								System.out.println("Merci beaucoup, " + ca.doncafe());
								stockcaf2--;
								cam = cam + prixcaf;
							}
							else if (tmp > du)
							{
								rendu = monnaie - prixcaf;
								System.out.println("Merci, nous vous rendons " + rendu + " centimes, " + ca.doncafe());
								stockcaf2--;
								cam = cam + prixcaf;
							}
						}
						else if (tmp == 0)
						{
							System.out.println("Voici votre monnaie");
							monnaie = prixcaf;
						}
					}
				}
			}
		}
		if (stockchoco2 != 0)
		{
			while (stockchoco2 != 0)
			{
				Scanner sca = new Scanner(System.in);
				System.out.println("Nous n'avons plus de café, voulez vous du chocolat ? \nTapez 1 pour oui \nTapez 2 pour non");
				int choix2 = sca.nextInt();
				if (choix2 == 1)
				{
					System.out.println("Insérez " + prixchoco + " centimes SVP");
					Scanner scv = new Scanner(System.in);
					int monnaie = scv.nextInt();
					if (monnaie == prixchoco)
					{
						System.out.println("Merci beaucoup, " + ch.donchoco());
						stockchoco2--;
						cam = cam + prixchoco;
					}
					else if (monnaie > prixchoco) 
					{
						rendu = monnaie - prixchoco;
						System.out.println("Merci, nous vous rendons " + rendu + " centimes, " + ch.donchoco());
						stockchoco2--;
						cam = cam + prixchoco;
					}
					else if (monnaie < prixchoco)
					{
						while (monnaie < prixchoco)
						{
						du = prixchoco - monnaie;
						System.out.println("Vous n'avez pas insérez assez d'argent, merci de rajouter au moins " + du + " centimes.");
						System.out.println("Si vous voulez récupérer votre monnaie appuyer sur 0, sinon indiquez la monnaie que vous rajoutez");
						Scanner scy = new Scanner(System.in);
						tmp = scy.nextInt();
						monnaie = monnaie + tmp;
							if (tmp != 0)
							{
								if (tmp == du)
								{
									System.out.println("Merci beaucoup, " + ch.donchoco());
									stockchoco2--;	
									cam = cam + prixchoco;
								}
								else if (tmp > du)
								{
									rendu = monnaie - prixchoco;
									System.out.println("Merci, nous vous rendons " + rendu + " centimes, " + ch.donchoco());
									stockchoco2--;
									cam = cam + prixchoco;
								}
							}
							else if (tmp == 0)
							{
								System.out.println("Voici votre monnaie");
								monnaie = prixchoco;
							}
						}
					}
				}

				}
			}
		if (stockcaf2 != 0)
		{
			while (stockcaf2 != 0)
			{
				System.out.println("Nous n'avons plus de chocolat, voulez vous du café ? \nTapez 1 pour oui \nTapez 2 pour non");
			
			Scanner sc = new Scanner(System.in);
			int choix2 = sc.nextInt();
				if (choix2 == 1)
				{
					System.out.println("Insérez " + prixcaf + " centimes SVP");
					Scanner scv = new Scanner(System.in);
					int monnaie = scv.nextInt();
					if (monnaie == prixcaf)
					{
						System.out.println("Merci beaucoup, " + ca.doncafe());
						stockcaf2--;
						cam = cam + prixcaf;
					}
					else if (monnaie > prixcaf) 
					{
						rendu = monnaie - prixcaf;
						System.out.println("Merci, nous vous rendons " + rendu + " centimes, " + ca.doncafe());
						stockcaf2--;
						cam = cam + prixcaf;
					}
					else if (monnaie < prixcaf)
					{
						while (monnaie < prixcaf)
						{
						du = prixcaf - monnaie;
						System.out.println("Vous n'avez pas insérez assez d'argent, merci de rajouter au moins " + du + " centimes.");
						System.out.println("Si vous voulez récupérer votre monnaie appuyer sur 0, sinon indiquez la monnaie que vous rajoutez");
						Scanner scy = new Scanner(System.in);
						tmp = scy.nextInt();
						monnaie = monnaie + tmp;
							if (tmp != 0)
							{
								if (tmp == du)
								{
									System.out.println("Merci beaucoup, " + ca.doncafe());
									stockcaf2--;
									cam = cam + prixcaf;
								}
								else if (tmp > du)
								{
									rendu = monnaie - prixcaf;
									System.out.println("Merci, nous vous rendons " + rendu + " centimes, " + ca.doncafe());
									stockcaf2--;
									cam = cam + prixcaf;
								}
							}
							else if (tmp == 0)
							{
								System.out.println("Voici votre monnaie");
								monnaie = prixcaf;
							}
						}
					}
				}
			}
		}
		if (stockchoco2 == 0 && stockcaf2 == 0)
		{
			System.out.println("Nous n'avons plus de boissons disponible.");
			System.out.println("Le chiffre d'affaire de la machine est de " + cam + " centimes.");
		}
	
	}
	}
*/