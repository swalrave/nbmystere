import java.util.Scanner;

public class nombremystere {

	//fct main
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Mode 1: Joueur devine (taper 1)");
		System.out.println("Mode 2: Ordinateur devine (taper 2)");
		System.out.println("Quitter le programme (taper 3)");
		int mode = sc.nextInt();
		
		if (mode == 1) {
			PlayerGuess p = new PlayerGuess();
		}

		if (mode == 2) {
			ComputerGuess p = new ComputerGuess();
		}

		if (mode == 3) {
			System.out.println("Fin du programme.");
		}
	}

}
