import java.util.Scanner;

public class nombremystere {

	//fct main
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int mode = -22;
		
		do {
			System.out.println();
			System.out.println("-----------------------");
			System.out.println("-- guess the number! --");
			System.out.println("-----------------------");
			System.out.println();
			System.out.println("Mode 1: Joueur devine (taper 1)");
			System.out.println("Mode 2: Ordinateur devine (taper 2)");
			System.out.println("Quitter le programme (taper 3)");
			
			mode = -22;
			String input = sc.next();
			
			try {
				mode = Integer.parseInt(input);
			}
			catch(NumberFormatException ex){}
			
			switch(mode) {
			case 1 :
				@SuppressWarnings("unused") var p = new PlayerGuess();
				break;
			case 2 :
				@SuppressWarnings("unused") var c = new ComputerGuess();
				break;
			case 3 :
				System.out.println("Arrêt en cours.");
				break;
			case 69 :
				System.out.println("pervert ;)");
			default :
				System.out.println("input invalide, veuillez réessayer.");
				break;
			}
			
		}while(mode != 3);
		
		sc.close();
		System.out.println("Fin du programme.");
	}

}
