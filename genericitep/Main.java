package genericitep;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		Iterator it = list.iterator();
		while(it.hasNext()) {
			 String str = (String)it.next();
			 it.remove();
			System.out.println("element "+str+" Suprime");
			System.out.println("la liste est "+list);
		}
		
	}

}
