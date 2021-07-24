import java.util.Random;

public class ComputerNumber {
	//creation d'un nbr de 4 chiffres aleatoire
	Random ran = new Random();
	
	//on genere directement des chiffres dans 4 variables pour ne pas avoir besoin de casser le nbr
	int ranMil = ran.nextInt(10);
	int ranCen = ran.nextInt(10);
	int ranDiz = ran.nextInt(10);
	int ranUni = ran.nextInt(10);
	
	public void setnumbertoguess(String s_correct) {
		//recup le char a l'index 0 du string de l'input
		char tampon = s_correct.charAt(0);
		//convertit en int ce char dans l'attribut des milliers (mil)
		ranMil = Character.getNumericValue(tampon);
		tampon = s_correct.charAt(1);
		ranCen = Character.getNumericValue(tampon);
		tampon = s_correct.charAt(2);
		ranDiz = Character.getNumericValue(tampon);
		tampon = s_correct.charAt(3);
		ranUni = Character.getNumericValue(tampon);
	}
	
	public String generated() {
		return Integer.toString(ranMil) +
				Integer.toString(ranCen) +
				Integer.toString(ranDiz) +
				Integer.toString(ranUni);
	}
	
	public String guess(String s_correct) {
		//recup le char a l'index 0 du string de l'input
		char tampon = s_correct.charAt(0);
		//convertit en int ce char dans l'attribut des milliers (mil)
		int mil = Character.getNumericValue(tampon);
		tampon = s_correct.charAt(1);
		int cen = Character.getNumericValue(tampon);
		tampon = s_correct.charAt(2);
		int diz = Character.getNumericValue(tampon);
		tampon = s_correct.charAt(3);
		int uni = Character.getNumericValue(tampon);
		
		String result = verification(ranMil, mil) + 
				verification(ranMil, cen) +
				verification(ranMil, diz) +
				verification(ranMil, uni);
				
		return result;
	}
	
	private String verification(int random, int guess) {
		if(random == guess) {
			return "=";
		}else if(Integer.max(random, guess) == random) {
			return "+";
		}else {
			return "-";
		}
	}
	
	
}
