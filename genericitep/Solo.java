package genericitep;

import java.util.ArrayList;
import java.util.Iterator;

/*public class Solo<T> {
	private T valeur;
	public Solo() {
		this.valeur=null;
	}
	public Solo(T valeur) {
		this.valeur= valeur;
	}
	public String toString() {
		return ""+this.valeur;
	}
	public void setValeur(T val) {
		this.valeur=val;
	}
	public */
	public class Solo{
	public static void main() {
		//Solo<Integer> s1 = new Solo<Integer>(123);
		//Solo<Double> s2 = new Solo<Double>(120.954);
		//System.out.println(s1);
		//System.out.println(s2);
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("4");
		Iterator it = list.iterator();
		while(it.hasNext()) {
			String str = (String)it.next();
			if(str.equals("4") || str.equals("2")) it.remove();
		}
		
	}
}

