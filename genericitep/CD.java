package genericitep;

public class CD implements Comparable<CD>{
	private String auteur,titre;
	private double prix;
	public CD(String auteur,String titre, double prix) {
		this.auteur=auteur;
		this.titre=titre;
		this.prix=prix;
	}
	public String toString() {
		return "CD( auteur="+auteur+" , titre:"+titre+", prix: "+prix+")";
	}
	
	public double getPrix() {
		return prix;
	}
	
	public String getAuteur() {
		return auteur;
	}
	
	public String getTitre() {
		return titre;
	}
	
	/*public int compareTo(CD exemple ) {	 //La meilleure méthode 
		return this.auteur.compareTo(exemple.getAuteur());
	}*/
	
	public int compareTo(CD exemple ) {	
		double x = this.prix - exemple.getPrix();
		if(x<0) { return -1; }
		else if(x>0) { return 1; }
		else return 0;
	}
	
	
	/*public int compareTo(CD exemple ) {
		int x=0;
		if(auteur.compareTo(exemple.auteur)>0) {
			x=1;
		}else if(auteur.compareTo(exemple.auteur)<0) {
			x=-1;
		}
		return x;
	}*/
	

	/*public int compareTo(Object o ) { // si on pas utiliser le type de la classe <CD>

		if(o.getClass().equals(CD.class)) {
			CD cd =(CD)o;
			return this.auteur.compareTo(cd.getAuteur());
		}
		return -1;
	}*/
	
	public static void main(String []args) {
		CD CD1= new CD("fatimazohra","titre1",100);
		CD CD2=new CD("sanaa","titre2",89.12);
		CD CD3= new CD("Aicha","titre3",130);
		CD CD4=new CD("Aicha","titre4",50.60);
		System.out.println(CD1.toString());
		System.out.println(CD1.compareTo(CD2));
	}
}
