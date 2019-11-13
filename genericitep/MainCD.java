package genericitep;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MainCD {

	public static void main(String[] args) {
				/*Set<CD> tree = new TreeSet<CD>();
				CD CD1= new CD("fatimazohra","titre1",100);
				CD CD2=new CD("sanaa","titre2",89.12);
				CD CD3= new CD("Meryam","titre3",130);
				CD CD4=new CD("Aicha","titre4",13.20);
				tree.add(CD1);
				tree.add(CD2);
				tree.add(CD3);
				tree.add(CD4);
				Iterator<CD> it = tree.iterator();
				while(it.hasNext()) {
					System.out.println(it.next());
				}*/
		

		List<CD> list= new ArrayList<CD>();
		list.add(new CD("fatimazohra","titre1",100));
		list.add(new CD("sanaa","titre2",89.12));
		list.add(new CD("Meryam","titre3",130));
		list.add(new CD("Aicha","titre4",50.60));
		
		System.out.println("Avant le tri ");
		Iterator<CD> it =list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		Collections.sort(list);  // il fait le tri
		System.out.println("Apres le tri ");
		it= list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
	}

}
