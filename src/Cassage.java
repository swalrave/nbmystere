public class Cassage {
	//init des attributs
	public int mil;
	public int cen;
	public int diz;
	public int uni;
	
	//constructeur
	public Cassage(String s) {
		separ(s);
	}
	
	//fonction de separation des chiffres
	public void separ(String s) {
		//recup le char a l'index 0 du string de l'input
		char milliers = s.charAt(0);
		//convertit en int ce char dans l'attribut des milliers (mil)
		this.mil = Character.getNumericValue(milliers);
		
		char centaines = s.charAt(1);
		this.cen = Character.getNumericValue(centaines);
		

		char dizaines = s.charAt(2);
		this.diz = Character.getNumericValue(dizaines);
		

		char unites = s.charAt(3);
		this.uni = Character.getNumericValue(unites);
		
	}

	//getters des attributs
	public int getMil() {
		return mil;
	}
	public int getCen() {
		return cen;
	}
	public int getDiz() {
		return diz;
	}
	public int getUni() {
		return uni;
	}
	
}
