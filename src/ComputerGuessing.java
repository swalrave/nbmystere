import java.util.Random;

public class ComputerGuessing {
	//creation d'un nbr de 4 chiffres aleatoire
	Random ran = new Random();
	
	int tent2 = 0;
	int newInt = 0;
	
	public ComputerGuessing(int tent, int result) {
		if(tent > result) {
			this.newInt = ran.nextInt(result);
		}
		if(tent < result) {
			while (this.newInt <= tent) {
				this.newInt = ran.nextInt(10);
			}
		}
		
		return;
	}
}