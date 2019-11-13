package genericitep;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> map= new HashMap<Integer, String>();
		map.put(1,"one");
		map.put(1,"one");
		map.put(2,"two");
		map.put(3,"three");
		//System.out.println(map);
		//Iterator it = hash.Iterator();
		Set<Entry<Integer, String>> setEntry = map.entrySet();
		Iterator<Entry<Integer, String>> itEntry = map.entrySet().iterator();
		System.out.println("Parcourir d une map avec setEntry");
		while(itEntry.hasNext()) {
			Entry<Integer, String> entry = itEntry.next();
			System.out.println("la valeur de  la cle "+entry+ "   =  " +entry.getValue());
			
		}
		// ******Methode keySet************* 
		/*Map<Integer, String> map= new HashMap<Integer, String>();
		map.put(1,"one");
		map.put(1,"one");
		map.put(2,"two");
		map.put(3,"three");
		Set<Integer> setInt = map.keySet();
		Iterator<Integer> it = setInt.iterator();
		
		System.out.println("Parcourir d une map avec keyset");
		while(it.hasNext()) {
			int key = it.next();
			System.out.println("la valeur de  la cle "+key+ "   =  " +map.get(key));	
		}*/

	}

}
