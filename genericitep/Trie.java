package genericitep;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Trie {
	public static void main(String[] args) {
		Set<String> tree = new TreeSet<String>();
		tree.add("Sanaa");
		tree.add("Fatima");
		tree.add("Mery");
		tree.add("hind");
		tree.add("youssef");
		tree.add("Amina");
		Iterator<String> it = tree.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
