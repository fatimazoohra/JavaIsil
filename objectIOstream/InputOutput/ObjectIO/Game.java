package ObjectIO;

import java.io.Serializable;

public class Game implements Serializable{
	private String nom,style;
	private double prix;
	private Player player;
	public Game(String nom, String style , double prix, Player p) {
		this.nom=nom;
		this.style=style;
		this.prix=prix;
		this.player = p;
	}
	public String toString() {
		return "Nom du jeu :"+this.nom+ "\n Style de jeu : "+this.style+" \n prix : "+this.prix+"\n"+player;
	}
}
