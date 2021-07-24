import java.util.Scanner;

public class PlayerGuess {
	
	public PlayerGuess() {
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
		//boucle tant que le resultat n'est pas trouvé ou que le compteur est inf a 10
		do {
			//input
			System.out.println("tentative n° " + tentative + " - Entrer un nombre a 4 chiffres: ");
			
			nbr = sc.nextLine();
			
			try {
				if(nbr.length() == 4  ) {  //vérification longeur de 4
					Integer.parseInt(nbr); //vérification que ce sont des nombre
					tentative ++;
					String result = comp.guess(nbr);
					System.out.println(result);
					if(result.equals("====")) {
						testWin = true;
					}
				}
				else {
					throw new NumberFormatException();
				}
			}
			catch(NumberFormatException ex){
				System.out.println("input invalide, veuillez réessayer.");
			}
			
		} while(testWin == false & (tentative < 11));
		
		if(testWin == false) {
			System.out.println("Vous avez perdu au bout de la dixième tentative. La réponse était: " + comp.generated());
		}
		else {
			System.out.println("Vous avez gagné.");
		}
		
	}
}
