
public class printRes {
	//init de l'attribut
	String affichage;
	
	public printRes (int tent, int result) {
		//conditions g�n�r�es dans une m�thode pour ne pas avoir a faire de conditions pour chaque test
		if(tent > result) {
			this.affichage = "-";
		}
		if(tent < result) {
			this.affichage = "+";
		}
		if(tent == result) {
			this.affichage = "=";
		}
		
		return;
	}
}
