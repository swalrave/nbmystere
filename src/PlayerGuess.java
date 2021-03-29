import java.util.Scanner;

public class PlayerGuess {
	public PlayerGuess() {
		//scanner pour les input
		Scanner sc= new Scanner(System.in);
		
		//appel du constructeur de nbr aleatoire de l'ordinateur
		ComputerNumber comp = new ComputerNumber();
		
		//init du nbr d'input
		String nbr = "0000";
		
		//appel du constructeur separant les 4 chiffres (etant un string) en 4 variables distinctes
		Cassage c = new Cassage(nbr);
		
		// Créa de l'affichage du resultat
		String ranAffich = "" + comp.ranMil + comp.ranCen + comp.ranDiz + comp.ranUni;
		
		//nombre de tentatives
		int tentative = 1;
		
		Boolean testWin = false;
		//boucle tant que le resultat n'est pas trouvé ou que le compteur est inf a 10 (TODO)
		do {
			//input
			System.out.println("tentative n° " + tentative + " - Entrer un nombre a 4 chiffres: ");
			nbr = sc.nextLine();
			
			//separation des chiffres
			c.separ(nbr);
			
			//comparaison des chiffres avec les valeurs des var du nbr aleatoire du pc
			printRes milliers = new printRes(c.mil, comp.ranMil);
			printRes centaines = new printRes(c.cen, comp.ranCen);
			printRes dizaines = new printRes(c.diz, comp.ranDiz);
			printRes unites = new printRes(c.uni, comp.ranUni);
	
			//conversion en string pour l'affichage des +, - et =
			String affMilliers = milliers.affichage;
			String affCentaines = centaines.affichage;
			String affDizaines = dizaines.affichage;
			String affUnites = unites.affichage;
			
			tentative ++;
			
			if(tentative >= 11) {
				break;
			}
			
			if(((c.mil == comp.ranMil) && (c.cen == comp.ranCen) && (c.diz == comp.ranDiz) && (c.uni == comp.ranUni))) {
				testWin = true;
				break;
			}
			
			//affichage du 'resultat' sous forme de +, - et =
			System.out.println(affMilliers + affCentaines + affDizaines + affUnites);
		} while(testWin != true || (tentative < 11));
		
		if(testWin == false) {
			System.out.println("Vous avez perdu au bout de la dixième tentative. La réponse était: " + ranAffich);
		}
		
		else {
			System.out.println("Vous avez gagné.");
		}
		
		System.out.println("1. rejouer -- 2. Menu -- 3. Quitter");
		int choix = sc.nextInt();
		
		if(choix == 1) {
			PlayerGuess game = new PlayerGuess();
		}
		if(choix == 2) {
			nombremystere n = new nombremystere();
		}
		else {
			System.out.println("Fin du programme.");
		}
	}
}
