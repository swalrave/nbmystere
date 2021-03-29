import java.util.Random;
import java.util.Scanner;

public class ComputerGuess {
	public ComputerGuess() {
		//scanner pour les input
		Scanner sc= new Scanner(System.in);
		
		//input
		System.out.println("Entrer un nombre a 4 chiffres: ");
		String nbr = sc.nextLine();
	
		//appel du constructeur separant les 4 chiffres (etant un string) en 4 variables distinctes
		Cassage c = new Cassage(nbr);
		
		//separation des chiffres
		c.separ(nbr);
		
		//nombre de tentatives
		int tentative = 1;

		//appel du constructeur de nbr aleatoire de l'ordinateur
		ComputerNumber comp = new ComputerNumber();
		
		Boolean testWin = false;
		//boucle tant que le resultat n'est pas trouvé ou que le compteur est inf a 10 (TODO)
		do {
			
			//comparaison des chiffres avec les valeurs des var du nbr aleatoire du joueur
			printRes milliers = new printRes(comp.ranMil, c.mil);
			printRes centaines = new printRes(comp.ranCen, c.cen);
			printRes dizaines = new printRes(comp.ranDiz, c.diz);
			printRes unites = new printRes(comp.ranUni, c.uni);
	
			//conversion en string pour l'affichage des +, - et =
			String affMilliers = milliers.affichage;
			String affCentaines = centaines.affichage;
			String affDizaines = dizaines.affichage;
			String affUnites = unites.affichage;
			
			tentative ++;

			ComputerGuessing cgMil = new ComputerGuessing(comp.ranMil, c.mil);
			ComputerGuessing cgCen = new ComputerGuessing(comp.ranCen, c.cen);
			ComputerGuessing cgDiz = new ComputerGuessing(comp.ranDiz, c.diz);
			ComputerGuessing cgUni = new ComputerGuessing(comp.ranUni, c.uni);
			comp.ranMil = cgMil.newInt;
			comp.ranCen = cgCen.newInt;
			comp.ranDiz = cgDiz.newInt;
			comp.ranUni = cgUni.newInt;
			
			System.out.println("" + comp.ranMil + comp.ranCen + comp.ranDiz + comp.ranUni);
			
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
			System.out.println("L'ordinateur a perdu au bout de la dixième tentative. Votre réponse était: " + nbr);
		}
		
		else {
			System.out.println("L'ordinateur a gagné !");
		}
		
		System.out.println("1. rejouer -- 2. Menu -- 3. Quitter");
		int choix = sc.nextInt();
		
		if(choix == 1) {
			ComputerGuess game = new ComputerGuess();
		}
		if(choix == 2) {
			nombremystere n = new nombremystere();
		}
		else {
			System.out.println("Fin du programme.");
		}
	}
}
