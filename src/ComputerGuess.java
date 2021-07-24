import java.util.Random;
import java.util.Scanner;

public class ComputerGuess {
	
	int[] tabmin = {0,0,0,0};
	int[] tabmax = {10,10,10,10};
	int[] tabguess = {0,0,0,0};
	Random rand = new Random();
	
	public ComputerGuess() {
		//scanner pour les input
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		
		//appel du constructeur de nbr aleatoire de l'ordinateur
		ComputerNumber comp = new ComputerNumber();
		//init du nbr d'input
		String nbr;
		
		//nombre de tentatives
		int tentative = 1;
		
		Boolean testWin = false;
		
		//input
		
		boolean setup = true;
		do {
			System.out.println("Entrer un nombre a 4 chiffres que l'ordinateur va trouver : ");
			nbr = sc.nextLine();
			try {
				if(nbr.length() == 4  ) {  //vérification longeur de 4
					Integer.parseInt(nbr); //vérification que ce sont des nombre
					comp.setnumbertoguess(nbr);
					setup = false;
				}
				else {
					throw new NumberFormatException();
				}
			}
			catch(NumberFormatException ex){
				System.out.println("input invalide, veuillez réessayer.");
			}
		} while(setup);
			
		//boucle tant que le resultat n'est pas trouvé ou que le compteur est inf a 10
		do {
			tabguess[0] = rand.nextInt(tabmax[0]) + tabmin[0];
			tabguess[1] = rand.nextInt(tabmax[1]) + tabmin[1];
			tabguess[2] = rand.nextInt(tabmax[2]) + tabmin[2];
			tabguess[3] = rand.nextInt(tabmax[3]) + tabmin[3];
			String guess = Integer.toString(tabguess[0]) +
					Integer.toString(tabguess[1]) +
					Integer.toString(tabguess[2]) +
					Integer.toString(tabguess[3]) ;
			String result = comp.guess(guess);
			
			System.out.println("tentative : " + tentative);
			System.out.println(guess);
			
			tentative++;
			
			analyse(result);
			
		} while(testWin == false & (tentative < 11));
		
		if(testWin == false) {
			System.out.println("Bravo. l'ordinateur n'a pas deviner en 10 tentative.");
		}
		else {
			System.out.println("l'ordinateur a deviner en " + tentative + " tentative.");
		}
	}
	
	private void analyse(String result){
		//TODO
		//peut gerer le random avec tabmin, tabmax et tabguess
	}
	
}
