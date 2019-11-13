package ObjectIO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestGame_serializable {
	public static void main(String[] args) {
		ObjectInputStream ois;
		ObjectOutputStream oos;
		Player p1 = new Player("ronaldo",40);
		Player p2 = new Player("messi",42);
		try {
			oos= new ObjectOutputStream(new BufferedOutputStream(
					new FileOutputStream(
							new File("game.txt"))));
			oos.writeObject(new Game("Assassin Creed","Aventure",45.69,p1));
			oos.writeObject(new Game("Tomb Raider","Plateforme",23.45,p2));
			oos.writeObject(new Game("Tetris","Stratégie",23.45,p2));
			oos.close();
			ois=new ObjectInputStream(new BufferedInputStream(
					new FileInputStream(
							new File("game.txt"))));
			try {
				System.out.println(((Game)ois.readObject()).toString());
				System.out.println(((Game)ois.readObject()).toString());
				System.out.println(((Game)ois.readObject()).toString());
			}catch(ClassNotFoundException e) {e.printStackTrace();}
					
					
					
			
		}catch (FileNotFoundException e){e.printStackTrace();}
			catch(IOException e) {e.printStackTrace();}
	
 }

}
