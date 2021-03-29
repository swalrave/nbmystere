import java.util.Random;

public class ComputerNumber {
	//creation d'un nbr de 4 chiffres aleatoire
	Random ran = new Random();
	
	//on genere directement des chiffres dans 4 variables pour ne pas avoir besoin de casser le nbr
	int ranMil = ran.nextInt(10);	
	int ranCen = ran.nextInt(10);	
	int ranDiz = ran.nextInt(10);	
	int ranUni = ran.nextInt(10);

}
